package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the top-level object that contains all globally addressable OneNote objects such as notebooks, the active notebook, and the active section.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait ApplicationLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote on the web, only one notebook at a time is open in the application instance.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebooks: js.UndefOr[NotebookCollectionLoadOptions] = js.native
}

object ApplicationLoadOptions {
  @scala.inline
  def apply(): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
  @scala.inline
  implicit class ApplicationLoadOptionsOps[Self <: ApplicationLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setNotebooks(value: NotebookCollectionLoadOptions): Self = this.set("notebooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebooks: Self = this.set("notebooks", js.undefined)
  }
  
}

