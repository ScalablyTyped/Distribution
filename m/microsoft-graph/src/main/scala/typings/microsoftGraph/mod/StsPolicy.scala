package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StsPolicy extends PolicyBase {
  
  var appliesTo: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * A string collection containing a JSON string that defines the rules and settings for a policy. The syntax for the
    * definition differs for each derived policy type. Required.
    */
  var definition: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set to true, activates this policy. There can be many policies for the same policy type, but only one can be
    * activated as the organization default. Optional, default value is false.
    */
  var isOrganizationDefault: js.UndefOr[NullableOption[Boolean]] = js.native
}
object StsPolicy {
  
  @scala.inline
  def apply(): StsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StsPolicy]
  }
  
  @scala.inline
  implicit class StsPolicyMutableBuilder[Self <: StsPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliesTo(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliesToNull: Self = StObject.set(x, "appliesTo", null)
    
    @scala.inline
    def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    @scala.inline
    def setAppliesToVarargs(value: DirectoryObject*): Self = StObject.set(x, "appliesTo", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: js.Array[String]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: String*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    @scala.inline
    def setIsOrganizationDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isOrganizationDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOrganizationDefaultNull: Self = StObject.set(x, "isOrganizationDefault", null)
    
    @scala.inline
    def setIsOrganizationDefaultUndefined: Self = StObject.set(x, "isOrganizationDefault", js.undefined)
  }
}
