package typings.mobxReactLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined mobx-react-lite.mobx-react-lite/dist/observer.IObserverOptions & {  forwardRef :true} */
  trait IObserverOptionsforwardRe extends StObject {
    
    val forwardRef: js.UndefOr[Boolean] = js.undefined
  }
  object IObserverOptionsforwardRe {
    
    inline def apply(): IObserverOptionsforwardRe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IObserverOptionsforwardRe]
    }
    
    extension [Self <: IObserverOptionsforwardRe](x: Self) {
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
}
