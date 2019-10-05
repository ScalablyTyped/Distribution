package typings.officeDashJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "document.toJSON()". */
trait DocumentData extends js.Object {
  /**
    *
    * Represents a Visio application instance that contains this document. Read-only.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationData] = js.undefined
  /**
    *
    * Represents a collection of pages associated with the document. Read-only.
    *
    * [Api set:  1.1]
    */
  var pages: js.UndefOr[js.Array[PageData]] = js.undefined
  /**
    *
    * Returns the DocumentView object. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewData] = js.undefined
}

object DocumentData {
  @scala.inline
  def apply(
    application: ApplicationData = null,
    pages: js.Array[PageData] = null,
    view: DocumentViewData = null
  ): DocumentData = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application)
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DocumentData]
  }
}

