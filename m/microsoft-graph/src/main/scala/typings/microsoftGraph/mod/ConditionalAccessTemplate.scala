package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessTemplate
  extends StObject
     with Entity {
  
  // The user-friendly name of the template.
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Complete list of policy details specific to the template. This property contains the JSON of policy settings for
    * configuring a Conditional Access policy.
    */
  var details: js.UndefOr[ConditionalAccessPolicyDetail] = js.undefined
  
  // The user-friendly name of the template.
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * List of conditional access scenarios that the template is recommended for. The possible values are: new,
    * secureFoundation, zeroTrust, remoteWork, protectAdmins, emergingThreats, unknownFutureValue. This is a multi-valued
    * enum. Supports $filter (has).
    */
  var scenarios: js.UndefOr[TemplateScenarios] = js.undefined
}
object ConditionalAccessTemplate {
  
  inline def apply(): ConditionalAccessTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessTemplate] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(value: ConditionalAccessPolicyDetail): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScenarios(value: TemplateScenarios): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    inline def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
  }
}
