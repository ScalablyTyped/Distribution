package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlControlMod {
  
  @JSImport("ol/control/Control", JSImport.Default)
  @js.native
  class default protected () extends Control {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Control
    extends typings.ol.objectMod.default {
    
    var element: HTMLElement = js.native
    
    /**
      * Get the map associated with this control.
      */
    def getMap(): typings.ol.pluggableMapMod.default = js.native
    
    var listenerKeys: js.Array[EventsKey] = js.native
    
    /**
      * Renders the control.
      */
    def render(mapEvent: typings.ol.mapEventMod.default): Unit = js.native
    
    /**
      * Remove the control from its current map and attach it to the new map.
      * Subclasses may set up event handlers to get notified about changes to
      * the map here.
      */
    def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
    
    def setTarget(target: String): Unit = js.native
    /**
      * This function is used to set a target element for the control. It has no
      * effect if it is called after the control has been added to the map (i.e.
      * after setMap is called on the control). If no target is set in the
      * options passed to the control constructor and if setTarget is not called
      * then the control is added to the map's overlay container.
      */
    def setTarget(target: HTMLElement): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.native
    
    var target: js.UndefOr[HTMLElement | String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setRender(value: /* p0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
