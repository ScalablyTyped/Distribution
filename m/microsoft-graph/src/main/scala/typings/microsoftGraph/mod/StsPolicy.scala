package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StsPolicy
  extends StObject
     with PolicyBase {
  
  var appliesTo: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  /**
    * A string collection containing a JSON string that defines the rules and settings for a policy. The syntax for the
    * definition differs for each derived policy type. Required.
    */
  var definition: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If set to true, activates this policy. There can be many policies for the same policy type, but only one can be
    * activated as the organization default. Optional, default value is false.
    */
  var isOrganizationDefault: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object StsPolicy {
  
  inline def apply(): StsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StsPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StsPolicy] (val x: Self) extends AnyVal {
    
    inline def setAppliesTo(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToNull: Self = StObject.set(x, "appliesTo", null)
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: DirectoryObject*): Self = StObject.set(x, "appliesTo", js.Array(value*))
    
    inline def setDefinition(value: js.Array[String]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: String*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setIsOrganizationDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isOrganizationDefault", value.asInstanceOf[js.Any])
    
    inline def setIsOrganizationDefaultNull: Self = StObject.set(x, "isOrganizationDefault", null)
    
    inline def setIsOrganizationDefaultUndefined: Self = StObject.set(x, "isOrganizationDefault", js.undefined)
  }
}
