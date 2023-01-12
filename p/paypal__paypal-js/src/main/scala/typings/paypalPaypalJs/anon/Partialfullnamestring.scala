package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  full_name :string}> */
trait Partialfullnamestring extends StObject {
  
  var full_name: js.UndefOr[String] = js.undefined
}
object Partialfullnamestring {
  
  inline def apply(): Partialfullnamestring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialfullnamestring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialfullnamestring] (val x: Self) extends AnyVal {
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
  }
}
