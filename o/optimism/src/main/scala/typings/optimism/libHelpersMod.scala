package typings.optimism

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMod {
  
  @JSImport("optimism/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasOwnProperty_(v: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasOwnProperty_(v: js.Symbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasOwnProperty_(v: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def maybeUnsubscribe(entryOrDep: Unsubscribable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeUnsubscribe")(entryOrDep.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toArray(collection: Set[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(collection.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  trait Unsubscribable extends StObject {
    
    var unsubscribe: js.UndefOr[Unit | js.Function0[Any]] = js.undefined
  }
  object Unsubscribable {
    
    inline def apply(): Unsubscribable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Unsubscribable]
    }
    
    extension [Self <: Unsubscribable](x: Self) {
      
      inline def setUnsubscribe(value: Unit | js.Function0[Any]): Self = StObject.set(x, "unsubscribe", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeFunction0(value: () => Any): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      
      inline def setUnsubscribeUndefined: Self = StObject.set(x, "unsubscribe", js.undefined)
    }
  }
}
