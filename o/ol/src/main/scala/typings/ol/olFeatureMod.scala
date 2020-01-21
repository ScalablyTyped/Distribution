package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColongeometry
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Feature", JSImport.Namespace)
@js.native
object olFeatureMod extends js.Object {
  @js.native
  trait Feature[GeomType /* <: typings.ol.geometryMod.default */]
    extends typings.ol.objectMod.default {
    def getGeometry(): GeomType = js.native
    def getGeometryName(): String = js.native
    def getId(): Double | String = js.native
    def getStyle(): StyleLike = js.native
    def getStyleFunction(): StyleFunction = js.native
    @JSName("on")
    def on_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    def setGeometry(): Unit = js.native
    def setGeometry(geometry: GeomType): Unit = js.native
    def setGeometryName(name: String): Unit = js.native
    def setId(): Unit = js.native
    def setId(id: String): Unit = js.native
    def setId(id: Double): Unit = js.native
    def setStyle(): Unit = js.native
    def setStyle(style: StyleLike): Unit = js.native
    @JSName("un")
    def un_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  @js.native
  class default[GeomType /* <: typings.ol.geometryMod.default */] () extends Feature[GeomType] {
    def this(opt_geometryOrProperties: GeomType) = this()
    def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
  }
  
  def createStyleFunction(obj: js.Array[typings.ol.styleStyleMod.default]): StyleFunction = js.native
  def createStyleFunction(obj: StyleFunction): StyleFunction = js.native
  def createStyleFunction(obj: typings.ol.styleStyleMod.default): StyleFunction = js.native
  type FeatureClass = Feature[typings.ol.geometryMod.default] | typings.ol.renderFeatureMod.default
  type FeatureLike = Feature[typings.ol.geometryMod.default] | typings.ol.renderFeatureMod.default
}

