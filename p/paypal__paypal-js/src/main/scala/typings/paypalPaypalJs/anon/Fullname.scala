package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fullname extends StObject {
  
  /** When the party is a person, the party's full name. */
  var full_name: js.UndefOr[String] = js.undefined
}
object Fullname {
  
  inline def apply(): Fullname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fullname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fullname] (val x: Self) extends AnyVal {
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
  }
}
