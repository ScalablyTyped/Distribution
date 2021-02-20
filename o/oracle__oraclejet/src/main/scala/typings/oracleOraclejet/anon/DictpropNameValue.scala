package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameValue
  extends /* key */ StringDictionary[js.Any] {
  
  var value: Double = js.native
}
object DictpropNameValue {
  
  @scala.inline
  def apply(value: Double): DictpropNameValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameValue]
  }
  
  @scala.inline
  implicit class DictpropNameValueMutableBuilder[Self <: DictpropNameValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
