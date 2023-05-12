package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonColumnsurlCreatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ColumnsurlCreatedat
}
object ApplicationjsonColumnsurlCreatedat {
  
  inline def apply(applicationSlashjson: ColumnsurlCreatedat): ApplicationjsonColumnsurlCreatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonColumnsurlCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonColumnsurlCreatedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ColumnsurlCreatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
