package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelDeltaDecoration extends js.Object {
  /**
    * Options associated with this decoration.
    */
  var options: IModelDecorationOptions
  /**
    * Range that this decoration covers.
    */
  var range: IRange
}

object IModelDeltaDecoration {
  @scala.inline
  def apply(options: IModelDecorationOptions, range: IRange): IModelDeltaDecoration = {
    val __obj = js.Dynamic.literal(options = options, range = range)
  
    __obj.asInstanceOf[IModelDeltaDecoration]
  }
}

