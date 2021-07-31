package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueMapValEntry extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[MapValue] = js.undefined
}
object ValueMapValEntry {
  
  @scala.inline
  def apply(): ValueMapValEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueMapValEntry]
  }
  
  @scala.inline
  implicit class ValueMapValEntryMutableBuilder[Self <: ValueMapValEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: MapValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
