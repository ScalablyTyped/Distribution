package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimsParameterMember
  extends /* key */ StringDictionary[js.Any] {
  
  var essential: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var values: js.UndefOr[js.Array[String]] = js.native
}
object ClaimsParameterMember {
  
  @scala.inline
  def apply(): ClaimsParameterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsParameterMember]
  }
  
  @scala.inline
  implicit class ClaimsParameterMemberMutableBuilder[Self <: ClaimsParameterMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEssentialUndefined: Self = StObject.set(x, "essential", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
