package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZoneBase extends StObject {
  
  /**
    * The name of a time zone. It can be a standard time zone name such as 'Hawaii-Aleutian Standard Time', or 'Customized
    * Time Zone' for a custom time zone.
    */
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object TimeZoneBase {
  
  inline def apply(): TimeZoneBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZoneBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeZoneBase] (val x: Self) extends AnyVal {
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
