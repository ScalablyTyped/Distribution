package typings.nukaCarousel.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultControlsConfig extends StObject {
  
  var containerClassName: js.UndefOr[String] = js.undefined
  
  var nextButtonClassName: js.UndefOr[String] = js.undefined
  
  var nextButtonOnClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var nextButtonStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var nextButtonText: js.UndefOr[ReactNode] = js.undefined
  
  var pagingDotsClassName: js.UndefOr[String] = js.undefined
  
  var pagingDotsContainerClassName: js.UndefOr[String] = js.undefined
  
  var pagingDotsOnClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var pagingDotsStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var prevButtonClassName: js.UndefOr[String] = js.undefined
  
  var prevButtonOnClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var prevButtonStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var prevButtonText: js.UndefOr[ReactNode] = js.undefined
}
object DefaultControlsConfig {
  
  inline def apply(): DefaultControlsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultControlsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultControlsConfig] (val x: Self) extends AnyVal {
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    inline def setNextButtonClassName(value: String): Self = StObject.set(x, "nextButtonClassName", value.asInstanceOf[js.Any])
    
    inline def setNextButtonClassNameUndefined: Self = StObject.set(x, "nextButtonClassName", js.undefined)
    
    inline def setNextButtonOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "nextButtonOnClick", js.Any.fromFunction1(value))
    
    inline def setNextButtonOnClickUndefined: Self = StObject.set(x, "nextButtonOnClick", js.undefined)
    
    inline def setNextButtonStyle(value: CSSProperties): Self = StObject.set(x, "nextButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setNextButtonStyleUndefined: Self = StObject.set(x, "nextButtonStyle", js.undefined)
    
    inline def setNextButtonText(value: ReactNode): Self = StObject.set(x, "nextButtonText", value.asInstanceOf[js.Any])
    
    inline def setNextButtonTextUndefined: Self = StObject.set(x, "nextButtonText", js.undefined)
    
    inline def setPagingDotsClassName(value: String): Self = StObject.set(x, "pagingDotsClassName", value.asInstanceOf[js.Any])
    
    inline def setPagingDotsClassNameUndefined: Self = StObject.set(x, "pagingDotsClassName", js.undefined)
    
    inline def setPagingDotsContainerClassName(value: String): Self = StObject.set(x, "pagingDotsContainerClassName", value.asInstanceOf[js.Any])
    
    inline def setPagingDotsContainerClassNameUndefined: Self = StObject.set(x, "pagingDotsContainerClassName", js.undefined)
    
    inline def setPagingDotsOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "pagingDotsOnClick", js.Any.fromFunction1(value))
    
    inline def setPagingDotsOnClickUndefined: Self = StObject.set(x, "pagingDotsOnClick", js.undefined)
    
    inline def setPagingDotsStyle(value: CSSProperties): Self = StObject.set(x, "pagingDotsStyle", value.asInstanceOf[js.Any])
    
    inline def setPagingDotsStyleUndefined: Self = StObject.set(x, "pagingDotsStyle", js.undefined)
    
    inline def setPrevButtonClassName(value: String): Self = StObject.set(x, "prevButtonClassName", value.asInstanceOf[js.Any])
    
    inline def setPrevButtonClassNameUndefined: Self = StObject.set(x, "prevButtonClassName", js.undefined)
    
    inline def setPrevButtonOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "prevButtonOnClick", js.Any.fromFunction1(value))
    
    inline def setPrevButtonOnClickUndefined: Self = StObject.set(x, "prevButtonOnClick", js.undefined)
    
    inline def setPrevButtonStyle(value: CSSProperties): Self = StObject.set(x, "prevButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setPrevButtonStyleUndefined: Self = StObject.set(x, "prevButtonStyle", js.undefined)
    
    inline def setPrevButtonText(value: ReactNode): Self = StObject.set(x, "prevButtonText", value.asInstanceOf[js.Any])
    
    inline def setPrevButtonTextUndefined: Self = StObject.set(x, "prevButtonText", js.undefined)
  }
}
