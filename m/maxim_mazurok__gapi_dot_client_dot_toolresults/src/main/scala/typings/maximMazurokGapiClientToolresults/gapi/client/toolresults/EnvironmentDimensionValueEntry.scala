package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentDimensionValueEntry extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object EnvironmentDimensionValueEntry {
  
  @scala.inline
  def apply(): EnvironmentDimensionValueEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDimensionValueEntry]
  }
  
  @scala.inline
  implicit class EnvironmentDimensionValueEntryMutableBuilder[Self <: EnvironmentDimensionValueEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
