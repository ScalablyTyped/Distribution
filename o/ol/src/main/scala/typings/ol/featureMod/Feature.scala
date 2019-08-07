package typings.ol.featureMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:geometry`
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature
  extends typings.ol.objectMod.default
     with FeatureClass
     with FeatureLike {
  def getGeometry(): typings.ol.geomGeometryMod.default = js.native
  def getGeometryName(): String = js.native
  def getId(): Double | String = js.native
  def getStyle(): StyleLike = js.native
  def getStyleFunction(): StyleFunction = js.native
  @JSName("on")
  def on_changegeometry(`type`: `change:geometry`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changegeometry(`type`: `change:geometry`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setGeometry(): Unit = js.native
  def setGeometry(geometry: typings.ol.geomGeometryMod.default): Unit = js.native
  def setGeometryName(name: String): Unit = js.native
  def setId(): Unit = js.native
  def setId(id: String): Unit = js.native
  def setId(id: Double): Unit = js.native
  def setStyle(style: StyleLike): Unit = js.native
  @JSName("un")
  def un_changegeometry(`type`: `change:geometry`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

