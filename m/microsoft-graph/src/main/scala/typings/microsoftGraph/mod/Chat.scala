package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chat
  extends StObject
     with Entity {
  
  // Specifies the type of chat. Possible values are: group, oneOnOne, meeting, unknownFutureValue.
  var chatType: js.UndefOr[ChatType] = js.undefined
  
  // Date and time at which the chat was created. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A collection of all the apps in the chat. Nullable.
  var installedApps: js.UndefOr[NullableOption[js.Array[TeamsAppInstallation]]] = js.undefined
  
  // Date and time at which the chat was renamed or list of members were last changed. Read-only.
  var lastUpdatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A collection of all the members in the chat. Nullable.
  var members: js.UndefOr[NullableOption[js.Array[ConversationMember]]] = js.undefined
  
  // A collection of all the messages in the chat. Nullable.
  var messages: js.UndefOr[NullableOption[js.Array[ChatMessage]]] = js.undefined
  
  /**
    * Represents details about an online meeting. If the chat isn't associated with an online meeting, the property is empty.
    * Read-only.
    */
  var onlineMeetingInfo: js.UndefOr[NullableOption[TeamworkOnlineMeetingInfo]] = js.undefined
  
  // A collection of all the tabs in the chat. Nullable.
  var tabs: js.UndefOr[NullableOption[js.Array[TeamsTab]]] = js.undefined
  
  // The identifier of the tenant in which the chat was created. Read-only.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // (Optional) Subject or topic for the chat. Only available for group chats.
  var topic: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The URL for the chat in Microsoft Teams. The URL should be treated as an opaque blob, and not parsed. Read-only.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object Chat {
  
  inline def apply(): Chat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chat] (val x: Self) extends AnyVal {
    
    inline def setChatType(value: ChatType): Self = StObject.set(x, "chatType", value.asInstanceOf[js.Any])
    
    inline def setChatTypeUndefined: Self = StObject.set(x, "chatType", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setInstalledApps(value: NullableOption[js.Array[TeamsAppInstallation]]): Self = StObject.set(x, "installedApps", value.asInstanceOf[js.Any])
    
    inline def setInstalledAppsNull: Self = StObject.set(x, "installedApps", null)
    
    inline def setInstalledAppsUndefined: Self = StObject.set(x, "installedApps", js.undefined)
    
    inline def setInstalledAppsVarargs(value: TeamsAppInstallation*): Self = StObject.set(x, "installedApps", js.Array(value*))
    
    inline def setLastUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeNull: Self = StObject.set(x, "lastUpdatedDateTime", null)
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[ConversationMember]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: ConversationMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setMessages(value: NullableOption[js.Array[ChatMessage]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: ChatMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setOnlineMeetingInfo(value: NullableOption[TeamworkOnlineMeetingInfo]): Self = StObject.set(x, "onlineMeetingInfo", value.asInstanceOf[js.Any])
    
    inline def setOnlineMeetingInfoNull: Self = StObject.set(x, "onlineMeetingInfo", null)
    
    inline def setOnlineMeetingInfoUndefined: Self = StObject.set(x, "onlineMeetingInfo", js.undefined)
    
    inline def setTabs(value: NullableOption[js.Array[TeamsTab]]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsNull: Self = StObject.set(x, "tabs", null)
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTabsVarargs(value: TeamsTab*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setTopic(value: NullableOption[String]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
