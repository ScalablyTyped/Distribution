package typings.ol.sourceVectorMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.featureloaderMod.FeatureUrlFunction
import typings.ol.olStrings.addfeature
import typings.ol.olStrings.changefeature
import typings.ol.olStrings.clear
import typings.ol.olStrings.removefeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorSource
  extends typings.ol.sourceSourceMod.default {
  def addFeature(feature: typings.ol.featureMod.default): Unit = js.native
  /* protected */ def addFeatureInternal(feature: typings.ol.featureMod.default): Unit = js.native
  def addFeatures(features: js.Array[typings.ol.featureMod.default]): Unit = js.native
  /* protected */ def addFeaturesInternal(features: js.Array[typings.ol.featureMod.default]): Unit = js.native
  def clear(): Unit = js.native
  def clear(opt_fast: Boolean): Unit = js.native
  def forEachFeature[T](callback: js.Function1[/* p0 */ typings.ol.featureMod.default, T]): T = js.native
  def forEachFeatureAtCoordinateDirect[T](coordinate: Coordinate, callback: js.Function1[/* p0 */ typings.ol.featureMod.default, T]): T = js.native
  def forEachFeatureInExtent[T](extent: Extent, callback: js.Function1[/* p0 */ typings.ol.featureMod.default, T]): T = js.native
  def forEachFeatureIntersectingExtent[T](extent: Extent, callback: js.Function1[/* p0 */ typings.ol.featureMod.default, T]): T = js.native
  def getClosestFeatureToCoordinate(coordinate: Coordinate): typings.ol.featureMod.default = js.native
  def getClosestFeatureToCoordinate(coordinate: Coordinate, opt_filter: js.Function0[Unit]): typings.ol.featureMod.default = js.native
  def getExtent(): Extent = js.native
  def getExtent(opt_extent: Extent): Extent = js.native
  def getFeatureById(id: String): typings.ol.featureMod.default = js.native
  def getFeatureById(id: Double): typings.ol.featureMod.default = js.native
  def getFeatures(): js.Array[typings.ol.featureMod.default] = js.native
  def getFeaturesAtCoordinate(coordinate: Coordinate): js.Array[typings.ol.featureMod.default] = js.native
  def getFeaturesCollection(): typings.ol.collectionMod.default[typings.ol.featureMod.default] = js.native
  def getFeaturesInExtent(extent: Extent): js.Array[typings.ol.featureMod.default] = js.native
  def getFormat(): typings.ol.formatFeatureMod.default = js.native
  def getOverlaps(): Boolean = js.native
  def getUrl(): String | FeatureUrlFunction = js.native
  def hasFeature(feature: typings.ol.featureMod.default): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def loadFeatures(extent: Extent, resolution: Double, projection: typings.ol.projProjectionMod.default): Unit = js.native
  @JSName("on")
  def on_addfeature(`type`: addfeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changefeature(`type`: changefeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_clear(`type`: clear, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_removefeature(`type`: removefeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_addfeature(`type`: addfeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changefeature(`type`: changefeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_clear(`type`: clear, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_removefeature(`type`: removefeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): EventsKey = js.native
  def removeFeature(feature: typings.ol.featureMod.default): Unit = js.native
  /* protected */ def removeFeatureInternal(feature: typings.ol.featureMod.default): Unit = js.native
  def removeLoadedExtent(extent: Extent): Unit = js.native
  def setLoader(loader: FeatureLoader): Unit = js.native
  @JSName("un")
  def un_addfeature(`type`: addfeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changefeature(`type`: changefeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_clear(`type`: clear, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_removefeature(`type`: removefeature, listener: js.Function1[/* evt */ VectorSourceEvent, Unit]): Unit = js.native
}

