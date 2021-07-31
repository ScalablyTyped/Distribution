package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPair extends StObject {
  
  /** Filter type. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Filter value. */
  var value: js.UndefOr[String] = js.undefined
}
object FilterPair {
  
  @scala.inline
  def apply(): FilterPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPair]
  }
  
  @scala.inline
  implicit class FilterPairMutableBuilder[Self <: FilterPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
