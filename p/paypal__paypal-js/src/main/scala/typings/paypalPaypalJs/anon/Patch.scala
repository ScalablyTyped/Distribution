package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisOrdersMod.OrderResponseBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  def patch(): js.Promise[OrderResponseBody]
}
object Patch {
  
  inline def apply(patch: () => js.Promise[OrderResponseBody]): Patch = {
    val __obj = js.Dynamic.literal(patch = js.Any.fromFunction0(patch))
    __obj.asInstanceOf[Patch]
  }
  
  extension [Self <: Patch](x: Self) {
    
    inline def setPatch(value: () => js.Promise[OrderResponseBody]): Self = StObject.set(x, "patch", js.Any.fromFunction0(value))
  }
}
