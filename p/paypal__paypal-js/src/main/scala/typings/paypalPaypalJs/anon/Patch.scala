package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisOrdersMod.UpdateOrderRequestBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  def patch(options: UpdateOrderRequestBody): js.Promise[Unit]
}
object Patch {
  
  inline def apply(patch: UpdateOrderRequestBody => js.Promise[Unit]): Patch = {
    val __obj = js.Dynamic.literal(patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[Patch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: UpdateOrderRequestBody => js.Promise[Unit]): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
  }
}
