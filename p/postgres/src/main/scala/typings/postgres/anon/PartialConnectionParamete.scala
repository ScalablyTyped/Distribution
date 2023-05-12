package typings.postgres.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<postgres.postgres.ConnectionParameters> */
trait PartialConnectionParamete extends StObject {
  
  var application_name: js.UndefOr[String] = js.undefined
}
object PartialConnectionParamete {
  
  inline def apply(): PartialConnectionParamete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConnectionParamete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialConnectionParamete] (val x: Self) extends AnyVal {
    
    inline def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
    
    inline def setApplication_nameUndefined: Self = StObject.set(x, "application_name", js.undefined)
  }
}
