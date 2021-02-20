package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonactive
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionInteractionMod {
  
  @JSImport("ol/interaction/Interaction", JSImport.Default)
  @js.native
  class default () extends Interaction {
    def this(opt_options: InteractionOptions) = this()
  }
  
  @JSImport("ol/interaction/Interaction", "pan")
  @js.native
  def pan(view: typings.ol.viewMod.default, delta: Coordinate): Unit = js.native
  @JSImport("ol/interaction/Interaction", "pan")
  @js.native
  def pan(view: typings.ol.viewMod.default, delta: Coordinate, opt_duration: Double): Unit = js.native
  
  @JSImport("ol/interaction/Interaction", "zoomByDelta")
  @js.native
  def zoomByDelta(view: typings.ol.viewMod.default, delta: Double): Unit = js.native
  @JSImport("ol/interaction/Interaction", "zoomByDelta")
  @js.native
  def zoomByDelta(
    view: typings.ol.viewMod.default,
    delta: Double,
    opt_anchor: js.UndefOr[scala.Nothing],
    opt_duration: Double
  ): Unit = js.native
  @JSImport("ol/interaction/Interaction", "zoomByDelta")
  @js.native
  def zoomByDelta(view: typings.ol.viewMod.default, delta: Double, opt_anchor: Coordinate): Unit = js.native
  @JSImport("ol/interaction/Interaction", "zoomByDelta")
  @js.native
  def zoomByDelta(view: typings.ol.viewMod.default, delta: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
  
  @js.native
  trait Interaction
    extends typings.ol.objectMod.default {
    
    /**
      * Return whether the interaction is currently active.
      */
    def getActive(): Boolean = js.native
    
    /**
      * Get the map associated with this interaction.
      */
    def getMap(): typings.ol.pluggableMapMod.default = js.native
    
    /**
      * Handles the {@link module:ol/MapBrowserEvent map browser event}.
      */
    def handleEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
    
    @JSName("on")
    def on_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Activate or deactivate the interaction.
      */
    def setActive(active: Boolean): Unit = js.native
    
    /**
      * Remove the interaction from its current map and attach it to the new map.
      * Subclasses may set up event handlers to get notified about changes to
      * the map here.
      */
    def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
    
    @JSName("un")
    def un_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait InteractionOptions extends StObject {
    
    def handleEvent(p0: typings.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
  }
  object InteractionOptions {
    
    @scala.inline
    def apply(handleEvent: typings.ol.mapBrowserEventMod.default[UIEvent] => Boolean): InteractionOptions = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[InteractionOptions]
    }
    
    @scala.inline
    implicit class InteractionOptionsMutableBuilder[Self <: InteractionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleEvent(value: typings.ol.mapBrowserEventMod.default[UIEvent] => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
}
