package typings
package overlayscrollbarsLib.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayScrollbars extends js.Object {
  def addExt(extensionName: java.lang.String, options: js.Object): overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Extension = js.native
  def destroy(): scala.Unit = js.native
  def ext(): js.Object = js.native
  def ext(extensionName: java.lang.String): overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Extension = js.native
  def getElements(): overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Elements = js.native
  def getElements(elementName: java.lang.String): js.Any = js.native
  def getState(): overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.State = js.native
  def getState(stateProperty: java.lang.String): js.Any = js.native
  def options(): overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Options = js.native
  def options(optionName: java.lang.String): scala.Unit = js.native
  def options(optionName: java.lang.String, optionValue: js.Object): scala.Unit = js.native
  def options(options: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Options): scala.Unit = js.native
  @JSName("options")
  def options_Any(optionName: java.lang.String): js.Any = js.native
  def removeExt(extensionName: java.lang.String): scala.Boolean = js.native
  def scroll(): overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.ScrollInfo = js.native
  def scroll(coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates): scala.Unit = js.native
  def scroll(
    coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates,
    duration: scala.Double
  ): scala.Unit = js.native
  def scroll(
    coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates,
    duration: scala.Double,
    easing: js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Easing, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Easing
    ]
  ): scala.Unit = js.native
  def scroll(
    coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates,
    duration: scala.Double,
    easing: js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Easing, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Easing
    ],
    complete: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def scroll(
    coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates,
    duration: scala.Double,
    easing: overlayscrollbarsLib.Anon_XYEasing
  ): scala.Unit = js.native
  def scroll(
    coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates,
    duration: scala.Double,
    easing: overlayscrollbarsLib.Anon_XYEasing,
    complete: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def scroll(
    coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates,
    duration: scala.Double,
    easing: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Easing
  ): scala.Unit = js.native
  def scroll(
    coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates,
    duration: scala.Double,
    easing: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Easing,
    complete: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def scroll(
    coordinates: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Coordinates,
    options: js.Object
  ): scala.Unit = js.native
  def scrollStop(): OverlayScrollbars = js.native
  def sleep(): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(force: scala.Boolean): scala.Unit = js.native
}

