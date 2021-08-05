package typings.mobx

import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listenUtilsMod {
  
  @JSImport("mobx/lib/types/listen-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasListeners(listenable: IListenable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListeners")(listenable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def notifyListeners[T](listenable: IListenable, change: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyListeners")(listenable.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerListener(listenable: IListenable, handler: js.Function): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("registerListener")(listenable.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @js.native
  trait IListenable extends StObject {
    
    var changeListeners: js.UndefOr[js.Array[js.Function]] = js.native
    
    def observe(handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], Unit]): Lambda = js.native
    def observe(
      handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], Unit],
      fireImmediately: Boolean
    ): Lambda = js.native
  }
}
