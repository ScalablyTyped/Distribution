package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.accepted
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.analyst
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.coordinator
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.declined
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.finder
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.other
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_developer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_reviewer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_verifier
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.reporter
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.sponsor
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateType extends StObject {
  
  /**
    * @description The state of the user's acceptance of the credit.
    * @enum {string}
    */
  var state: accepted | declined | pending
  
  var `type`: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
  
  var user: Avatarurl
}
object StateType {
  
  inline def apply(
    state: accepted | declined | pending,
    `type`: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other,
    user: Avatarurl
  ): StateType = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
    
    inline def setState(value: accepted | declined | pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
