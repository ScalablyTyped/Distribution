package typings.mobxReactLite

import typings.mobxReactLite.mobxReactLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined mobx-react-lite.mobx-react-lite/dist/observer.IObserverOptions & {  forwardRef :true} */
  trait IObserverOptionsforwardRe extends StObject {
    
    val forwardRef: js.UndefOr[Boolean] & `true`
  }
  object IObserverOptionsforwardRe {
    
    inline def apply(forwardRef: js.UndefOr[Boolean] & `true`): IObserverOptionsforwardRe = {
      val __obj = js.Dynamic.literal(forwardRef = forwardRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObserverOptionsforwardRe]
    }
    
    extension [Self <: IObserverOptionsforwardRe](x: Self) {
      
      inline def setForwardRef(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
    }
  }
}
