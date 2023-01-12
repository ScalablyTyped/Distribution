package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var openOptions: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
}
object OpenOptions {
  
  inline def apply(openOptions: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): OpenOptions = {
    val __obj = js.Dynamic.literal(openOptions = openOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
    
    inline def setOpenOptions(value: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
  }
}
