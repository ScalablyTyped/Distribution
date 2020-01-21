package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Document object, for use in "document.set({ ... })". */
trait DocumentUpdateData extends js.Object {
  /**
    *
    * Represents a Visio application instance that contains this document.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationUpdateData] = js.undefined
  /**
    *
    * Returns the DocumentView object.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewUpdateData] = js.undefined
}

object DocumentUpdateData {
  @scala.inline
  def apply(application: ApplicationUpdateData = null, view: DocumentViewUpdateData = null): DocumentUpdateData = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentUpdateData]
  }
}

