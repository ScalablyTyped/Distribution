package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "document.toJSON()". */
@js.native
trait DocumentData extends js.Object {
  /**
    *
    * Represents a Visio application instance that contains this document. Read-only.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationData] = js.native
  /**
    *
    * Represents a collection of pages associated with the document. Read-only.
    *
    * [Api set:  1.1]
    */
  var pages: js.UndefOr[js.Array[PageData]] = js.native
  /**
    *
    * Returns the DocumentView object. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewData] = js.native
}

object DocumentData {
  @scala.inline
  def apply(): DocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentData]
  }
  @scala.inline
  implicit class DocumentDataOps[Self <: DocumentData] (val x: Self) extends AnyVal {
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
    def setApplication(value: ApplicationData): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setPagesVarargs(value: PageData*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[PageData]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setView(value: DocumentViewData): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

