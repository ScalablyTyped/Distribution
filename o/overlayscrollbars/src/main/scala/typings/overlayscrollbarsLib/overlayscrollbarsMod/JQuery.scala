package typings
package overlayscrollbarsLib.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def overlayScrollbars(): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(filter: java.lang.String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(
    filter: js.Function2[/* element */ stdLib.Element, /* instance */ OverlayScrollbars, scala.Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(options: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Options): JQuery = js.native
  def overlayScrollbars(
    options: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Options,
    extensions: java.lang.String
  ): JQuery = js.native
  def overlayScrollbars(
    options: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Options,
    extensions: js.Array[java.lang.String]
  ): JQuery = js.native
  def overlayScrollbars(
    options: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Options,
    extensions: org.scalablytyped.runtime.StringDictionary[js.Object]
  ): JQuery = js.native
}

