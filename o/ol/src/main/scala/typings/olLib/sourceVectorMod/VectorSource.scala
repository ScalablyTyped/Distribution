package typings
package olLib.sourceVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorSource
  extends olLib.sourceSourceMod.default {
  def addFeature(feature: olLib.featureMod.default): scala.Unit = js.native
  /* protected */ def addFeatureInternal(feature: olLib.featureMod.default): scala.Unit = js.native
  def addFeatures(features: js.Array[olLib.featureMod.default]): scala.Unit = js.native
  /* protected */ def addFeaturesInternal(features: js.Array[olLib.featureMod.default]): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clear(opt_fast: scala.Boolean): scala.Unit = js.native
  def forEachFeature[T](callback: js.Function1[/* p0 */ olLib.featureMod.default, T]): T = js.native
  def forEachFeatureAtCoordinateDirect[T](
    coordinate: olLib.coordinateMod.Coordinate,
    callback: js.Function1[/* p0 */ olLib.featureMod.default, T]
  ): T = js.native
  def forEachFeatureInExtent[T](extent: olLib.extentMod.Extent, callback: js.Function1[/* p0 */ olLib.featureMod.default, T]): T = js.native
  def forEachFeatureIntersectingExtent[T](extent: olLib.extentMod.Extent, callback: js.Function1[/* p0 */ olLib.featureMod.default, T]): T = js.native
  def getClosestFeatureToCoordinate(coordinate: olLib.coordinateMod.Coordinate): olLib.featureMod.default = js.native
  def getClosestFeatureToCoordinate(coordinate: olLib.coordinateMod.Coordinate, opt_filter: js.Function0[scala.Unit]): olLib.featureMod.default = js.native
  def getExtent(): olLib.extentMod.Extent = js.native
  def getExtent(opt_extent: olLib.extentMod.Extent): olLib.extentMod.Extent = js.native
  def getFeatureById(id: java.lang.String): olLib.featureMod.default = js.native
  def getFeatureById(id: scala.Double): olLib.featureMod.default = js.native
  def getFeatures(): js.Array[olLib.featureMod.default] = js.native
  def getFeaturesAtCoordinate(coordinate: olLib.coordinateMod.Coordinate): js.Array[olLib.featureMod.default] = js.native
  def getFeaturesCollection(): olLib.collectionMod.default[olLib.featureMod.default] = js.native
  def getFeaturesInExtent(extent: olLib.extentMod.Extent): js.Array[olLib.featureMod.default] = js.native
  def getFormat(): olLib.formatFeatureMod.default = js.native
  def getOverlaps(): scala.Boolean = js.native
  def getUrl(): java.lang.String | olLib.featureloaderMod.FeatureUrlFunction = js.native
  def hasFeature(feature: olLib.featureMod.default): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def loadFeatures(
    extent: olLib.extentMod.Extent,
    resolution: scala.Double,
    projection: olLib.projProjectionMod.default
  ): scala.Unit = js.native
  @JSName("on")
  def on_addfeature(
    `type`: olLib.olLibStrings.addfeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changefeature(
    `type`: olLib.olLibStrings.changefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_clear(`type`: olLib.olLibStrings.clear, listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_removefeature(
    `type`: olLib.olLibStrings.removefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_addfeature(
    `type`: olLib.olLibStrings.addfeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changefeature(
    `type`: olLib.olLibStrings.changefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_clear(`type`: olLib.olLibStrings.clear, listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_removefeature(
    `type`: olLib.olLibStrings.removefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def removeFeature(feature: olLib.featureMod.default): scala.Unit = js.native
  /* protected */ def removeFeatureInternal(feature: olLib.featureMod.default): scala.Unit = js.native
  def removeLoadedExtent(extent: olLib.extentMod.Extent): scala.Unit = js.native
  def setLoader(loader: olLib.featureloaderMod.FeatureLoader): scala.Unit = js.native
  @JSName("un")
  def un_addfeature(
    `type`: olLib.olLibStrings.addfeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changefeature(
    `type`: olLib.olLibStrings.changefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_clear(`type`: olLib.olLibStrings.clear, listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]): scala.Unit = js.native
  @JSName("un")
  def un_removefeature(
    `type`: olLib.olLibStrings.removefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent, scala.Unit]
  ): scala.Unit = js.native
}

