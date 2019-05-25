package typings
package olLib.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select
  extends olLib.interactionInteractionMod.default {
  def getFeatures(): olLib.collectionMod.default[olLib.featureMod.default] = js.native
  def getHitTolerance(): scala.Double = js.native
  def getLayer(feature: olLib.featureMod.FeatureLike): olLib.layerVectorMod.default = js.native
  def getOverlay(): olLib.layerVectorMod.default = js.native
  @JSName("on")
  def on_select(`type`: olLib.olLibStrings.select, listener: js.Function1[/* evt */ SelectEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_select(`type`: olLib.olLibStrings.select, listener: js.Function1[/* evt */ SelectEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  def setHitTolerance(hitTolerance: scala.Double): scala.Unit = js.native
  @JSName("un")
  def un_select(`type`: olLib.olLibStrings.select, listener: js.Function1[/* evt */ SelectEvent, scala.Unit]): scala.Unit = js.native
}

