package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "application.toJSON()". */
trait ApplicationData extends js.Object {
  /**
    *
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote on the web, only one notebook at a time is open in the application instance. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebooks: js.UndefOr[js.Array[NotebookData]] = js.undefined
}

object ApplicationData {
  @scala.inline
  def apply(notebooks: js.Array[NotebookData] = null): ApplicationData = {
    val __obj = js.Dynamic.literal()
    if (notebooks != null) __obj.updateDynamic("notebooks")(notebooks)
    __obj.asInstanceOf[ApplicationData]
  }
}

