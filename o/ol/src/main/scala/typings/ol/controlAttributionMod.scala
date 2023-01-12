package typings.ol

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlAttributionMod {
  
  @JSImport("ol/control/Attribution", JSImport.Default)
  @js.native
  open class default () extends Attribution {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Attribution
    extends typings.ol.controlControlMod.default {
    
    /**
      * Return true when the attribution is currently collapsed or false
      * otherwise.
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Return true if the attribution is collapsible, false otherwise.
      */
    def getCollapsible(): Boolean = js.native
    
    /**
      * Collapse or expand the attribution according to the passed parameter. Will
      * not do anything if the attribution isn't collapsible or if the current
      * collapsed state is already the one requested.
      */
    def setCollapsed(collapsed: Boolean): Unit = js.native
    
    /**
      * Set whether the attribution should be collapsible.
      */
    def setCollapsible(collapsible: Boolean): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapseClassName: js.UndefOr[String] = js.undefined
    
    var collapseLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    var expandClassName: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String | HTMLElement] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
    
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
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapseClassName(value: String): Self = StObject.set(x, "collapseClassName", value.asInstanceOf[js.Any])
      
      inline def setCollapseClassNameUndefined: Self = StObject.set(x, "collapseClassName", js.undefined)
      
      inline def setCollapseLabel(value: String | HTMLElement): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setExpandClassName(value: String): Self = StObject.set(x, "expandClassName", value.asInstanceOf[js.Any])
      
      inline def setExpandClassNameUndefined: Self = StObject.set(x, "expandClassName", js.undefined)
      
      inline def setLabel(value: String | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: /* p0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
}
