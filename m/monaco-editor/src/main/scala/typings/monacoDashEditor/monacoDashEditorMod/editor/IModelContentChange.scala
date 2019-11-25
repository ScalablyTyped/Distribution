package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelContentChange extends js.Object {
  /**
    * The range that got replaced.
    */
  val range: IRange
  /**
    * The length of the range that got replaced.
    */
  val rangeLength: Double
  /**
    * The offset of the range that got replaced.
    */
  val rangeOffset: Double
  /**
    * The new text for the range.
    */
  val text: String
}

object IModelContentChange {
  @scala.inline
  def apply(range: IRange, rangeLength: Double, rangeOffset: Double, text: String): IModelContentChange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], rangeLength = rangeLength.asInstanceOf[js.Any], rangeOffset = rangeOffset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IModelContentChange]
  }
}

