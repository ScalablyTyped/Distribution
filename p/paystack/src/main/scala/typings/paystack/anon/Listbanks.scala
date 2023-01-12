package typings.paystack.anon

import typings.paystack.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listbanks extends StObject {
  
  def list_banks(params: Page): js.Promise[ResponsedataArrayany]
  
  def resolve_bin(bin: String): js.Promise[Response]
}
object Listbanks {
  
  inline def apply(list_banks: Page => js.Promise[ResponsedataArrayany], resolve_bin: String => js.Promise[Response]): Listbanks = {
    val __obj = js.Dynamic.literal(list_banks = js.Any.fromFunction1(list_banks), resolve_bin = js.Any.fromFunction1(resolve_bin))
    __obj.asInstanceOf[Listbanks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Listbanks] (val x: Self) extends AnyVal {
    
    inline def setList_banks(value: Page => js.Promise[ResponsedataArrayany]): Self = StObject.set(x, "list_banks", js.Any.fromFunction1(value))
    
    inline def setResolve_bin(value: String => js.Promise[Response]): Self = StObject.set(x, "resolve_bin", js.Any.fromFunction1(value))
  }
}
