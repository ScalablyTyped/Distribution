package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.enterfullscreen
import typings.ol.olStrings.leavefullscreen
import typings.std.HTMLElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenMod {
  
  @JSImport("ol/control/FullScreen", JSImport.Default)
  @js.native
  class default () extends FullScreen {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait FullScreen
    extends typings.ol.controlControlMod.default {
    
    @JSName("on")
    def on_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
    
    @JSName("un")
    def un_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var keys: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String | Text | HTMLElement] = js.native
    
    var labelActive: js.UndefOr[String | Text | HTMLElement] = js.native
    
    var source: js.UndefOr[HTMLElement | String] = js.native
    
    var target: js.UndefOr[HTMLElement | String] = js.native
    
    var tipLabel: js.UndefOr[String] = js.native
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
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setLabel(value: String | Text | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelActive(value: String | Text | HTMLElement): Self = StObject.set(x, "labelActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelActiveUndefined: Self = StObject.set(x, "labelActive", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSource(value: HTMLElement | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
}
