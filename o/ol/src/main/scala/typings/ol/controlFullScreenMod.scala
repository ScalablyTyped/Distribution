package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.enterfullscreen
import typings.ol.olStrings.leavefullscreen
import typings.std.HTMLElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlFullScreenMod {
  
  @JSImport("ol/control/FullScreen", JSImport.Default)
  @js.native
  open class default () extends FullScreen {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait FullScreen
    extends typings.ol.controlControlMod.default {
    
    @JSName("on")
    def on_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    
    @JSName("un")
    def un_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var activeClassName: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var inactiveClassName: js.UndefOr[String] = js.undefined
    
    var keys: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String | Text | HTMLElement] = js.undefined
    
    var labelActive: js.UndefOr[String | Text | HTMLElement] = js.undefined
    
    var source: js.UndefOr[HTMLElement | String] = js.undefined
    
    var target: js.UndefOr[HTMLElement | String] = js.undefined
    
    var tipLabel: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInactiveClassName(value: String): Self = StObject.set(x, "inactiveClassName", value.asInstanceOf[js.Any])
      
      inline def setInactiveClassNameUndefined: Self = StObject.set(x, "inactiveClassName", js.undefined)
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLabel(value: String | Text | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelActive(value: String | Text | HTMLElement): Self = StObject.set(x, "labelActive", value.asInstanceOf[js.Any])
      
      inline def setLabelActiveUndefined: Self = StObject.set(x, "labelActive", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSource(value: HTMLElement | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
}
