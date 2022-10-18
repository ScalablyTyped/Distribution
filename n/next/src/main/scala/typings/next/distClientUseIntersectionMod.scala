package typings.next

import typings.react.mod.RefObject
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientUseIntersectionMod {
  
  @JSImport("next/dist/client/use-intersection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIntersection[T /* <: Element */](hasRootRefRootMarginDisabled: UseIntersection_): js.Tuple3[js.Function1[/* element */ T | Null, Unit], Boolean, js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIntersection")(hasRootRefRootMarginDisabled.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.Function1[/* element */ T | Null, Unit], Boolean, js.Function0[Unit]]]
  
  /* Inlined std.Pick<std.IntersectionObserverInit, 'rootMargin' | 'root'> */
  trait UseIntersectionObserverInit extends StObject {
    
    var root: js.UndefOr[Element | Document | Null] = js.undefined
    
    var rootMargin: js.UndefOr[String] = js.undefined
  }
  object UseIntersectionObserverInit {
    
    inline def apply(): UseIntersectionObserverInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseIntersectionObserverInit]
    }
    
    extension [Self <: UseIntersectionObserverInit](x: Self) {
      
      inline def setRoot(value: Element | Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      inline def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  /* Inlined {  disabled :boolean | undefined,   rootRef :react.react.RefObject<std.HTMLElement> | null | undefined} & next.next/dist/client/use-intersection.UseIntersectionObserverInit */
  trait UseIntersection_ extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[Element | Document | Null] = js.undefined
    
    var rootMargin: js.UndefOr[String] = js.undefined
    
    var rootRef: js.UndefOr[RefObject[HTMLElement] | Null] = js.undefined
  }
  object UseIntersection_ {
    
    inline def apply(): UseIntersection_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseIntersection_]
    }
    
    extension [Self <: UseIntersection_](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRoot(value: Element | Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      inline def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
      
      inline def setRootRefNull: Self = StObject.set(x, "rootRef", null)
      
      inline def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
