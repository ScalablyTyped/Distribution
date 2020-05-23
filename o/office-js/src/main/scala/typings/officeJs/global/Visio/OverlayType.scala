package typings.officeJs.global.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the type of the overlay.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.OverlayType")
@js.native
object OverlayType extends js.Object {
  /* "Html" */ val html: typings.officeJs.Visio.OverlayType.html with String = js.native
  /* "Image" */ val image: typings.officeJs.Visio.OverlayType.image with String = js.native
  /* "Text" */ val text: typings.officeJs.Visio.OverlayType.text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Visio.OverlayType with String] = js.native
}

