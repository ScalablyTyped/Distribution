package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.featureMod.Feature
import typings.ol.featureMod.FeatureClass
import typings.ol.featureMod.FeatureLike
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:geometry`
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Feature", JSImport.Namespace)
@js.native
object featureMod extends js.Object {
  @js.native
  trait Feature
    extends typings.ol.objectMod.default
       with FeatureClass
       with FeatureLike {
    def getGeometry(): js.UndefOr[typings.ol.geomGeometryMod.default] = js.native
    def getGeometryName(): String = js.native
    def getId(): js.UndefOr[Double | String] = js.native
    def getStyle(): StyleLike | Null = js.native
    def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
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
    def setStyle(): Unit = js.native
    def setStyle(style: StyleLike): Unit = js.native
    @JSName("un")
    def un_changegeometry(`type`: `change:geometry`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.featureMod.Feature
    - typings.ol.renderFeatureMod.default
  */
  trait FeatureClass extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.featureMod.Feature
    - typings.ol.renderFeatureMod.default
  */
  trait FeatureLike extends js.Object
  
  @js.native
  class default () extends Feature {
    def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
    def this(opt_geometryOrProperties: typings.ol.geomGeometryMod.default) = this()
  }
  
  def createStyleFunction(obj: js.Array[typings.ol.styleStyleMod.default]): StyleFunction = js.native
  def createStyleFunction(obj: StyleFunction): StyleFunction = js.native
  def createStyleFunction(obj: typings.ol.styleStyleMod.default): StyleFunction = js.native
}

