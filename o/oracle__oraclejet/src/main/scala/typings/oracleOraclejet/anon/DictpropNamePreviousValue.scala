package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNamePreviousValue
  extends /* key */ StringDictionary[js.Any] {
  
  var previousValue: js.Any = js.native
  
  var value: js.Any = js.native
}
object DictpropNamePreviousValue {
  
  @scala.inline
  def apply(previousValue: js.Any, value: js.Any): DictpropNamePreviousValue = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNamePreviousValue]
  }
  
  @scala.inline
  implicit class DictpropNamePreviousValueMutableBuilder[Self <: DictpropNamePreviousValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousValue(value: js.Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
