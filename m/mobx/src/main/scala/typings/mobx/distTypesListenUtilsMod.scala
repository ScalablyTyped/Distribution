package typings.mobx

import typings.mobx.distUtilsUtilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListenUtilsMod {
  
  @JSImport("mobx/dist/types/listen-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasListeners(listenable: IListenable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListeners")(listenable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def notifyListeners[T](listenable: IListenable, change: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyListeners")(listenable.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerListener(listenable: IListenable, handler: js.Function): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("registerListener")(listenable.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  trait IListenable extends StObject {
    
    var changeListeners_ : js.UndefOr[js.Array[js.Function]] = js.undefined
  }
  object IListenable {
    
    inline def apply(): IListenable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IListenable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IListenable] (val x: Self) extends AnyVal {
      
      inline def setChangeListeners_(value: js.Array[js.Function]): Self = StObject.set(x, "changeListeners_", value.asInstanceOf[js.Any])
      
      inline def setChangeListeners_Undefined: Self = StObject.set(x, "changeListeners_", js.undefined)
      
      inline def setChangeListeners_Varargs(value: js.Function*): Self = StObject.set(x, "changeListeners_", js.Array(value*))
    }
  }
}
