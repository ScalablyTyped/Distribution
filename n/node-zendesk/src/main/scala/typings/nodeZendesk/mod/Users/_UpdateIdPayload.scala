package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _UpdateIdPayload extends StObject
object _UpdateIdPayload {
  
  @scala.inline
  def Externalids(external_ids: js.Array[ZendeskID]): typings.nodeZendesk.anon.Externalids = {
    val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeZendesk.anon.Externalids]
  }
  
  @scala.inline
  def Ids(ids: js.Array[ZendeskID]): typings.nodeZendesk.anon.Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeZendesk.anon.Ids]
  }
}
