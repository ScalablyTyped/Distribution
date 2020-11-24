package typings.ol.groupMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonlayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerGroup
  extends typings.ol.baseMod.default {
  
  /**
    * Returns the {@link module:ol/Collection collection} of {@link module:ol/layer/Layer~Layer layers}
    * in this group.
    */
  def getLayers(): typings.ol.collectionMod.default[typings.ol.baseMod.default] = js.native
  
  @JSName("on")
  def on_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  /**
    * Set the {@link module:ol/Collection collection} of {@link module:ol/layer/Layer~Layer layers}
    * in this group.
    */
  def setLayers(layers: typings.ol.collectionMod.default[typings.ol.baseMod.default]): Unit = js.native
  
  @JSName("un")
  def un_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
