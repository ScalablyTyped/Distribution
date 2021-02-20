package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var openOptions: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions = js.native
}
object OpenOptions {
  
  @scala.inline
  def apply(openOptions: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): OpenOptions = {
    val __obj = js.Dynamic.literal(openOptions = openOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
  
  @scala.inline
  implicit class OpenOptionsMutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenOptions(value: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
  }
}
