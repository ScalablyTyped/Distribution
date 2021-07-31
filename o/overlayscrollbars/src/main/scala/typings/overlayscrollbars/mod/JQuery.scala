package typings.overlayscrollbars.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery
  extends StObject
     with _Coordinates {
  
  def overlayScrollbars(): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(options: Options): JQuery = js.native
  def overlayScrollbars(options: Options, extensions: Extensions): JQuery = js.native
}
