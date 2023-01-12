package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainContentVisible extends StObject {
  
  /**
    * the current breakpoint.
    */
  var currentBreakpoint: js.UndefOr[String] = js.undefined
  
  /**
    * visibility of the main content.
    */
  var mainContentVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the breakpoint that was active before change to current breakpoint.
    */
  var previousBreakpoint: js.UndefOr[String] = js.undefined
  
  /**
    * visibility of the side content.
    */
  var sideContentVisible: js.UndefOr[Boolean] = js.undefined
}
object MainContentVisible {
  
  inline def apply(): MainContentVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainContentVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MainContentVisible] (val x: Self) extends AnyVal {
    
    inline def setCurrentBreakpoint(value: String): Self = StObject.set(x, "currentBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setCurrentBreakpointUndefined: Self = StObject.set(x, "currentBreakpoint", js.undefined)
    
    inline def setMainContentVisible(value: Boolean): Self = StObject.set(x, "mainContentVisible", value.asInstanceOf[js.Any])
    
    inline def setMainContentVisibleUndefined: Self = StObject.set(x, "mainContentVisible", js.undefined)
    
    inline def setPreviousBreakpoint(value: String): Self = StObject.set(x, "previousBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setPreviousBreakpointUndefined: Self = StObject.set(x, "previousBreakpoint", js.undefined)
    
    inline def setSideContentVisible(value: Boolean): Self = StObject.set(x, "sideContentVisible", value.asInstanceOf[js.Any])
    
    inline def setSideContentVisibleUndefined: Self = StObject.set(x, "sideContentVisible", js.undefined)
  }
}
