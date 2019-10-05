package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelDecoration extends js.Object {
  /**
    * Identifier for a decoration.
    */
  val id: String
  /**
    * Options associated with this decoration.
    */
  val options: IModelDecorationOptions
  /**
    * Identifier for a decoration's owner.
    */
  val ownerId: Double
  /**
    * Range that this decoration covers.
    */
  val range: Range
}

object IModelDecoration {
  @scala.inline
  def apply(id: String, options: IModelDecorationOptions, ownerId: Double, range: Range): IModelDecoration = {
    val __obj = js.Dynamic.literal(id = id, options = options, ownerId = ownerId, range = range)
  
    __obj.asInstanceOf[IModelDecoration]
  }
}

