package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorpusQuery extends StObject {
  
  /** Details pertaining to Drive holds. If set, corpus must be Drive. */
  var driveQuery: js.UndefOr[HeldDriveQuery] = js.undefined
  
  /** Details pertaining to Groups holds. If set, corpus must be Groups. */
  var groupsQuery: js.UndefOr[HeldGroupsQuery] = js.undefined
  
  /** Details pertaining to Hangouts Chat holds. If set, corpus must be Hangouts Chat. */
  var hangoutsChatQuery: js.UndefOr[HeldHangoutsChatQuery] = js.undefined
  
  /** Details pertaining to mail holds. If set, corpus must be mail. */
  var mailQuery: js.UndefOr[HeldMailQuery] = js.undefined
}
object CorpusQuery {
  
  @scala.inline
  def apply(): CorpusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorpusQuery]
  }
  
  @scala.inline
  implicit class CorpusQueryMutableBuilder[Self <: CorpusQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveQuery(value: HeldDriveQuery): Self = StObject.set(x, "driveQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveQueryUndefined: Self = StObject.set(x, "driveQuery", js.undefined)
    
    @scala.inline
    def setGroupsQuery(value: HeldGroupsQuery): Self = StObject.set(x, "groupsQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsQueryUndefined: Self = StObject.set(x, "groupsQuery", js.undefined)
    
    @scala.inline
    def setHangoutsChatQuery(value: HeldHangoutsChatQuery): Self = StObject.set(x, "hangoutsChatQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangoutsChatQueryUndefined: Self = StObject.set(x, "hangoutsChatQuery", js.undefined)
    
    @scala.inline
    def setMailQuery(value: HeldMailQuery): Self = StObject.set(x, "mailQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailQueryUndefined: Self = StObject.set(x, "mailQuery", js.undefined)
  }
}
