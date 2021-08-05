package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.Dispose
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDragDropHelper
  extends StObject
     with typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
object IDragDropHelper {
  
  inline def apply(
    dispose: () => Unit,
    subscribe: (HTMLElement, typings.officeUiFabricReact.utilitiesMod.EventGroup, typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropOptions) => Dispose,
    unsubscribe: (HTMLElement, String) => Unit
  ): IDragDropHelper = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), subscribe = js.Any.fromFunction3(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[IDragDropHelper]
  }
}
