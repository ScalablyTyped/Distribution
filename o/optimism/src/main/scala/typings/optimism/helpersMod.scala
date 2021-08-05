package typings.optimism

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("optimism/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maybeUnsubscribe(entryOrDep: Unsubscribable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeUnsubscribe")(entryOrDep.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Unsubscribable extends StObject {
    
    var unsubscribe: js.UndefOr[Unit | js.Function0[js.Any]] = js.undefined
  }
  object Unsubscribable {
    
    inline def apply(): Unsubscribable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Unsubscribable]
    }
    
    extension [Self <: Unsubscribable](x: Self) {
      
      inline def setUnsubscribe(value: Unit | js.Function0[js.Any]): Self = StObject.set(x, "unsubscribe", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeFunction0(value: () => js.Any): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      
      inline def setUnsubscribeUndefined: Self = StObject.set(x, "unsubscribe", js.undefined)
    }
  }
}
