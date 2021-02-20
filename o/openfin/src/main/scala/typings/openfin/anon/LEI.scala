package typings.openfin.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LEI extends /* key */ StringDictionary[String] {
  
  var LEI: js.UndefOr[String] = js.native
  
  var PERMID: js.UndefOr[String] = js.native
}
object LEI {
  
  @scala.inline
  def apply(): LEI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LEI]
  }
  
  @scala.inline
  implicit class LEIMutableBuilder[Self <: LEI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLEI(value: String): Self = StObject.set(x, "LEI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEIUndefined: Self = StObject.set(x, "LEI", js.undefined)
    
    @scala.inline
    def setPERMID(value: String): Self = StObject.set(x, "PERMID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERMIDUndefined: Self = StObject.set(x, "PERMID", js.undefined)
  }
}
