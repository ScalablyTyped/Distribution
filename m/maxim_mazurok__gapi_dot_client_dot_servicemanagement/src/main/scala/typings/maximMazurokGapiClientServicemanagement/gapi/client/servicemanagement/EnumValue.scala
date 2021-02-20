package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValue extends StObject {
  
  /** Enum value name. */
  var name: js.UndefOr[String] = js.native
  
  /** Enum value number. */
  var number: js.UndefOr[Double] = js.native
  
  /** Protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.native
}
object EnumValue {
  
  @scala.inline
  def apply(): EnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnumValue]
  }
  
  @scala.inline
  implicit class EnumValueMutableBuilder[Self <: EnumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
