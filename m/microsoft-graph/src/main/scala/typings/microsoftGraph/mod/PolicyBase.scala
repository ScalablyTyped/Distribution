package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyBase extends DirectoryObject {
  
  // Description for this policy.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Display name for this policy.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
}
object PolicyBase {
  
  @scala.inline
  def apply(): PolicyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyBase]
  }
  
  @scala.inline
  implicit class PolicyBaseMutableBuilder[Self <: PolicyBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
