package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  def patch(): js.Promise[Unit]
}
object Patch {
  
  inline def apply(patch: () => js.Promise[Unit]): Patch = {
    val __obj = js.Dynamic.literal(patch = js.Any.fromFunction0(patch))
    __obj.asInstanceOf[Patch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: () => js.Promise[Unit]): Self = StObject.set(x, "patch", js.Any.fromFunction0(value))
  }
}
