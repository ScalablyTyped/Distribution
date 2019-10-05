package typings.nodeDashZendesk.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Users {
  import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID]
    - typings.nodeDashZendesk.Anon_Ids
    - typings.nodeDashZendesk.Anon_Externalids
  */
  type UpdateIdPayload = _UpdateIdPayload | js.Array[ZendeskID] | String
}
