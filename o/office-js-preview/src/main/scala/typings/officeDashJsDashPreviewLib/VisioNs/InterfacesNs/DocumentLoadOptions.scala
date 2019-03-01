package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Document class.
  *
  * [Api set:  1.1]
  */
trait DocumentLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents a Visio application instance that contains this document.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationLoadOptions] = js.undefined
  /**
    *
    * Returns the DocumentView object.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewLoadOptions] = js.undefined
}

object DocumentLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    application: ApplicationLoadOptions = null,
    view: DocumentViewLoadOptions = null
  ): DocumentLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (application != null) __obj.updateDynamic("application")(application)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DocumentLoadOptions]
  }
}

