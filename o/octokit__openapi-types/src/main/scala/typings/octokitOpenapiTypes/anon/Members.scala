package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Members extends StObject {
  
  /**
    * @description The internal ID of the group
    * @example 1
    */
  var group_id: Double
  
  /**
    * @description The display name for the group
    * @example group-azuread-test
    */
  var group_name: String
  
  /**
    * @description An array of external members linked to this group
    * @example [
    *   {
    *     "member_id": 1,
    *     "member_login": "mona-lisa_eocsaxrs",
    *     "member_name": "Mona Lisa",
    *     "member_email": "mona_lisa@github.com"
    *   },
    *   {
    *     "member_id": 2,
    *     "member_login": "octo-lisa_eocsaxrs",
    *     "member_name": "Octo Lisa",
    *     "member_email": "octo_lisa@github.com"
    *   }
    * ]
    */
  var members: js.Array[Memberemail]
  
  /**
    * @description An array of teams linked to this group
    * @example [
    *   {
    *     "team_id": 1,
    *     "team_name": "team-test"
    *   },
    *   {
    *     "team_id": 2,
    *     "team_name": "team-test2"
    *   }
    * ]
    */
  var teams: js.Array[Teamname]
  
  /**
    * @description The date when the group was last updated_at
    * @example 2021-01-03 22:27:15:000 -700
    */
  var updated_at: js.UndefOr[String] = js.undefined
}
object Members {
  
  inline def apply(group_id: Double, group_name: String, members: js.Array[Memberemail], teams: js.Array[Teamname]): Members = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
  
  extension [Self <: Members](x: Self) {
    
    inline def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[Memberemail]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: Memberemail*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setTeams(value: js.Array[Teamname]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: Teamname*): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
  }
}
