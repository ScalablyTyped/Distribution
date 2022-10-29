package typings.pixiAccessibility

import typings.pixiDisplay.mod.DisplayObject
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAccessibleTargetMod {
  
  @JSImport("@pixi/accessibility/lib/accessibleTarget", "accessibleTarget")
  @js.native
  val accessibleTarget: IAccessibleTarget = js.native
  
  @js.native
  trait IAccessibleHTMLElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var displayObject: js.UndefOr[DisplayObject] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  
  trait IAccessibleTarget extends StObject {
    
    var _accessibleActive: Boolean
    
    var _accessibleDiv: IAccessibleHTMLElement
    
    var accessible: Boolean
    
    var accessibleChildren: Boolean
    
    var accessibleHint: String
    
    var accessiblePointerEvents: PointerEvents
    
    var accessibleTitle: String
    
    var accessibleType: String
    
    var renderId: Double
    
    var tabIndex: Double
  }
  object IAccessibleTarget {
    
    inline def apply(
      _accessibleActive: Boolean,
      _accessibleDiv: IAccessibleHTMLElement,
      accessible: Boolean,
      accessibleChildren: Boolean,
      accessibleHint: String,
      accessiblePointerEvents: PointerEvents,
      accessibleTitle: String,
      accessibleType: String,
      renderId: Double,
      tabIndex: Double
    ): IAccessibleTarget = {
      val __obj = js.Dynamic.literal(_accessibleActive = _accessibleActive.asInstanceOf[js.Any], _accessibleDiv = _accessibleDiv.asInstanceOf[js.Any], accessible = accessible.asInstanceOf[js.Any], accessibleChildren = accessibleChildren.asInstanceOf[js.Any], accessibleHint = accessibleHint.asInstanceOf[js.Any], accessiblePointerEvents = accessiblePointerEvents.asInstanceOf[js.Any], accessibleTitle = accessibleTitle.asInstanceOf[js.Any], accessibleType = accessibleType.asInstanceOf[js.Any], renderId = renderId.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAccessibleTarget]
    }
    
    extension [Self <: IAccessibleTarget](x: Self) {
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleChildren(value: Boolean): Self = StObject.set(x, "accessibleChildren", value.asInstanceOf[js.Any])
      
      inline def setAccessibleHint(value: String): Self = StObject.set(x, "accessibleHint", value.asInstanceOf[js.Any])
      
      inline def setAccessiblePointerEvents(value: PointerEvents): Self = StObject.set(x, "accessiblePointerEvents", value.asInstanceOf[js.Any])
      
      inline def setAccessibleTitle(value: String): Self = StObject.set(x, "accessibleTitle", value.asInstanceOf[js.Any])
      
      inline def setAccessibleType(value: String): Self = StObject.set(x, "accessibleType", value.asInstanceOf[js.Any])
      
      inline def setRenderId(value: Double): Self = StObject.set(x, "renderId", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def set_accessibleActive(value: Boolean): Self = StObject.set(x, "_accessibleActive", value.asInstanceOf[js.Any])
      
      inline def set_accessibleDiv(value: IAccessibleHTMLElement): Self = StObject.set(x, "_accessibleDiv", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiAccessibility.pixiAccessibilityStrings.auto
    - typings.pixiAccessibility.pixiAccessibilityStrings.none
    - typings.pixiAccessibility.pixiAccessibilityStrings.visiblePainted
    - typings.pixiAccessibility.pixiAccessibilityStrings.visibleFill
    - typings.pixiAccessibility.pixiAccessibilityStrings.visibleStroke
    - typings.pixiAccessibility.pixiAccessibilityStrings.visible
    - typings.pixiAccessibility.pixiAccessibilityStrings.painted
    - typings.pixiAccessibility.pixiAccessibilityStrings.fill
    - typings.pixiAccessibility.pixiAccessibilityStrings.stroke
    - typings.pixiAccessibility.pixiAccessibilityStrings.all
    - typings.pixiAccessibility.pixiAccessibilityStrings.inherit
  */
  trait PointerEvents extends StObject
  object PointerEvents {
    
    inline def all: typings.pixiAccessibility.pixiAccessibilityStrings.all = "all".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.all]
    
    inline def auto: typings.pixiAccessibility.pixiAccessibilityStrings.auto = "auto".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.auto]
    
    inline def fill: typings.pixiAccessibility.pixiAccessibilityStrings.fill = "fill".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.fill]
    
    inline def inherit: typings.pixiAccessibility.pixiAccessibilityStrings.inherit = "inherit".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.inherit]
    
    inline def none: typings.pixiAccessibility.pixiAccessibilityStrings.none = "none".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.none]
    
    inline def painted: typings.pixiAccessibility.pixiAccessibilityStrings.painted = "painted".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.painted]
    
    inline def stroke: typings.pixiAccessibility.pixiAccessibilityStrings.stroke = "stroke".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.stroke]
    
    inline def visible: typings.pixiAccessibility.pixiAccessibilityStrings.visible = "visible".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.visible]
    
    inline def visibleFill: typings.pixiAccessibility.pixiAccessibilityStrings.visibleFill = "visibleFill".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.visibleFill]
    
    inline def visiblePainted: typings.pixiAccessibility.pixiAccessibilityStrings.visiblePainted = "visiblePainted".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.visiblePainted]
    
    inline def visibleStroke: typings.pixiAccessibility.pixiAccessibilityStrings.visibleStroke = "visibleStroke".asInstanceOf[typings.pixiAccessibility.pixiAccessibilityStrings.visibleStroke]
  }
}
