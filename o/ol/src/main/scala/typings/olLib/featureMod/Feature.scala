package typings
package olLib.featureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature
  extends olLib.objectMod.default
     with FeatureClass
     with FeatureLike {
  def getGeometry(): olLib.geomGeometryMod.default = js.native
  def getGeometryName(): java.lang.String = js.native
  def getId(): scala.Double | java.lang.String = js.native
  def getStyle(): olLib.styleStyleMod.StyleLike = js.native
  def getStyleFunction(): olLib.styleStyleMod.StyleFunction = js.native
  @JSName("on")
  def on_changegeometry(
    `type`: olLib.olLibStrings.`change:geometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changegeometry(
    `type`: olLib.olLibStrings.`change:geometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setGeometry(geometry: olLib.geomGeometryMod.default): scala.Unit = js.native
  def setGeometryName(name: java.lang.String): scala.Unit = js.native
  def setId(id: java.lang.String): scala.Unit = js.native
  def setId(id: scala.Double): scala.Unit = js.native
  def setStyle(style: olLib.styleStyleMod.StyleLike): scala.Unit = js.native
  @JSName("un")
  def un_changegeometry(
    `type`: olLib.olLibStrings.`change:geometry`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

