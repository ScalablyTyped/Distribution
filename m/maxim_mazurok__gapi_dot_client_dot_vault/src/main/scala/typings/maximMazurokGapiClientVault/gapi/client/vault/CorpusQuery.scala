package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorpusQuery extends StObject {
  
  /** Service-specific options for Drive holds. If set, **CorpusType** must be **DRIVE**. */
  var driveQuery: js.UndefOr[HeldDriveQuery] = js.undefined
  
  /** Service-specific options for Groups holds. If set, **CorpusType** must be **GROUPS**. */
  var groupsQuery: js.UndefOr[HeldGroupsQuery] = js.undefined
  
  /** Service-specific options for Chat holds. If set, **CorpusType** must be **HANGOUTS_CHAT**. */
  var hangoutsChatQuery: js.UndefOr[HeldHangoutsChatQuery] = js.undefined
  
  /** Service-specific options for Gmail holds. If set, **CorpusType** must be **MAIL**. */
  var mailQuery: js.UndefOr[HeldMailQuery] = js.undefined
  
  /** Service-specific options for Voice holds. If set, **CorpusType** must be **VOICE**. */
  var voiceQuery: js.UndefOr[HeldVoiceQuery] = js.undefined
}
object CorpusQuery {
  
  inline def apply(): CorpusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorpusQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CorpusQuery] (val x: Self) extends AnyVal {
    
    inline def setDriveQuery(value: HeldDriveQuery): Self = StObject.set(x, "driveQuery", value.asInstanceOf[js.Any])
    
    inline def setDriveQueryUndefined: Self = StObject.set(x, "driveQuery", js.undefined)
    
    inline def setGroupsQuery(value: HeldGroupsQuery): Self = StObject.set(x, "groupsQuery", value.asInstanceOf[js.Any])
    
    inline def setGroupsQueryUndefined: Self = StObject.set(x, "groupsQuery", js.undefined)
    
    inline def setHangoutsChatQuery(value: HeldHangoutsChatQuery): Self = StObject.set(x, "hangoutsChatQuery", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatQueryUndefined: Self = StObject.set(x, "hangoutsChatQuery", js.undefined)
    
    inline def setMailQuery(value: HeldMailQuery): Self = StObject.set(x, "mailQuery", value.asInstanceOf[js.Any])
    
    inline def setMailQueryUndefined: Self = StObject.set(x, "mailQuery", js.undefined)
    
    inline def setVoiceQuery(value: HeldVoiceQuery): Self = StObject.set(x, "voiceQuery", value.asInstanceOf[js.Any])
    
    inline def setVoiceQueryUndefined: Self = StObject.set(x, "voiceQuery", js.undefined)
  }
}
