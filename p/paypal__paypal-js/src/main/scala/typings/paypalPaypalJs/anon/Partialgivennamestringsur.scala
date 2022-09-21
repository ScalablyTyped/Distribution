package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  given_name :string,   surname :string}> */
trait Partialgivennamestringsur extends StObject {
  
  var given_name: js.UndefOr[String] = js.undefined
  
  var surname: js.UndefOr[String] = js.undefined
}
object Partialgivennamestringsur {
  
  inline def apply(): Partialgivennamestringsur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialgivennamestringsur]
  }
  
  extension [Self <: Partialgivennamestringsur](x: Self) {
    
    inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
    
    inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
    
    inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
  }
}
