package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisWord object, for use in "inkAnalysisWord.set({ ... })". */
trait InkAnalysisWordUpdateData extends js.Object {
  /**
    *
    * Reference to the parent InkAnalysisLine.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineUpdateData] = js.undefined
}

object InkAnalysisWordUpdateData {
  @scala.inline
  def apply(line: InkAnalysisLineUpdateData = null): InkAnalysisWordUpdateData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkAnalysisWordUpdateData]
  }
}

