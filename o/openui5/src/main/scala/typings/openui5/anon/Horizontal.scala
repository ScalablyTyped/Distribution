package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Horizontal extends StObject {
  
  /**
    * Whether the element should be scrollable horizontally
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated since 1.42, the parameter has no effect
    */
  var iscroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the delegate will also be active to allow touch like scrolling with the mouse on non-touch platforms.
    */
  var nonTouchScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated since 1.42, the parameter has no effect
    */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Native scrolling does not need content wrapper. In this case, ID of the container element should be provided.
    */
  var scrollContainerId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the element should be scrollable vertically
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated since 1.42, the parameter has no effect
    */
  var zynga: js.UndefOr[Boolean] = js.undefined
}
object Horizontal {
  
  inline def apply(): Horizontal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Horizontal]
  }
  
  extension [Self <: Horizontal](x: Self) {
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setIscroll(value: Boolean): Self = StObject.set(x, "iscroll", value.asInstanceOf[js.Any])
    
    inline def setIscrollUndefined: Self = StObject.set(x, "iscroll", js.undefined)
    
    inline def setNonTouchScrolling(value: Boolean): Self = StObject.set(x, "nonTouchScrolling", value.asInstanceOf[js.Any])
    
    inline def setNonTouchScrollingUndefined: Self = StObject.set(x, "nonTouchScrolling", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setScrollContainerId(value: String): Self = StObject.set(x, "scrollContainerId", value.asInstanceOf[js.Any])
    
    inline def setScrollContainerIdUndefined: Self = StObject.set(x, "scrollContainerId", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    inline def setZynga(value: Boolean): Self = StObject.set(x, "zynga", value.asInstanceOf[js.Any])
    
    inline def setZyngaUndefined: Self = StObject.set(x, "zynga", js.undefined)
  }
}
