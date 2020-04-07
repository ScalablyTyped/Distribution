package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the top-level object that contains all globally addressable OneNote objects such as notebooks, the active notebook, and the active section.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait ApplicationLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote on the web, only one notebook at a time is open in the application instance.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebooks: js.UndefOr[NotebookCollectionLoadOptions] = js.undefined
}

object ApplicationLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, notebooks: NotebookCollectionLoadOptions = null): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (notebooks != null) __obj.updateDynamic("notebooks")(notebooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
}

