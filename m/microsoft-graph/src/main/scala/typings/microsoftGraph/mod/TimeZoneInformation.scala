package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZoneInformation extends StObject {
  
  // An identifier for the time zone.
  var alias: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A display string that represents the time zone.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object TimeZoneInformation {
  
  inline def apply(): TimeZoneInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZoneInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeZoneInformation] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: NullableOption[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
