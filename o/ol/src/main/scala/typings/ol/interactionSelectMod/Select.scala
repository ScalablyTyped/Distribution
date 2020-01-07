package typings.ol.interactionSelectMod

import typings.ol.eventsMod.EventsKey
import typings.ol.featureMod.FeatureLike
import typings.ol.olStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select
  extends typings.ol.interactionInteractionMod.default {
  def getFeatures(): typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
  def getHitTolerance(): Double = js.native
  def getLayer(feature: FeatureLike): typings.ol.layerVectorMod.default = js.native
  @JSName("on")
  def on_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
  def setHitTolerance(hitTolerance: Double): Unit = js.native
  @JSName("un")
  def un_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): Unit = js.native
}

