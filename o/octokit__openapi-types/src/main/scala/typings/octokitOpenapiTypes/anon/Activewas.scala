package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activewas extends StObject {
  
  /** @description The time the audit log event occurred, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time). */
  var `@timestamp`: js.UndefOr[Double] = js.undefined
  
  /** @description A unique identifier for an audit event. */
  var _document_id: js.UndefOr[String] = js.undefined
  
  /** @description The name of the action that was performed, for example `user.login` or `repo.create`. */
  var action: js.UndefOr[String] = js.undefined
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var active_was: js.UndefOr[Boolean] = js.undefined
  
  /** @description The actor who performed the action. */
  var actor: js.UndefOr[String] = js.undefined
  
  /** @description The id of the actor who performed the action. */
  var actor_id: js.UndefOr[Double] = js.undefined
  
  var actor_location: js.UndefOr[Countryname] = js.undefined
  
  /** @description The username of the account being blocked. */
  var blocked_user: js.UndefOr[String] = js.undefined
  
  var business: js.UndefOr[String] = js.undefined
  
  var config: js.UndefOr[js.Array[StringDictionary[Any]]] = js.undefined
  
  var config_was: js.UndefOr[js.Array[StringDictionary[Any]]] = js.undefined
  
  var content_type: js.UndefOr[String] = js.undefined
  
  /** @description The time the audit log event was recorded, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time). */
  var created_at: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var deploy_key_fingerprint: js.UndefOr[String] = js.undefined
  
  var emoji: js.UndefOr[String] = js.undefined
  
  var events: js.UndefOr[js.Array[StringDictionary[Any]]] = js.undefined
  
  var events_were: js.UndefOr[js.Array[StringDictionary[Any]]] = js.undefined
  
  var explanation: js.UndefOr[String] = js.undefined
  
  var fingerprint: js.UndefOr[String] = js.undefined
  
  var hook_id: js.UndefOr[Double] = js.undefined
  
  var limited_availability: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var old_user: js.UndefOr[String] = js.undefined
  
  var openssh_public_key: js.UndefOr[String] = js.undefined
  
  @JSName("org")
  var org_ : js.UndefOr[String] = js.undefined
  
  var org_id: js.UndefOr[Double] = js.undefined
  
  var previous_visibility: js.UndefOr[String] = js.undefined
  
  var read_only: js.UndefOr[Boolean] = js.undefined
  
  /** @description The name of the repository. */
  var repo: js.UndefOr[String] = js.undefined
  
  /** @description The name of the repository. */
  var repository: js.UndefOr[String] = js.undefined
  
  var repository_public: js.UndefOr[Boolean] = js.undefined
  
  var target_login: js.UndefOr[String] = js.undefined
  
  var team: js.UndefOr[String] = js.undefined
  
  /** @description The type of protocol (for example, HTTP or SSH) used to transfer Git data. */
  var transport_protocol: js.UndefOr[Double] = js.undefined
  
  /** @description A human readable name for the protocol (for example, HTTP or SSH) used to transfer Git data. */
  var transport_protocol_name: js.UndefOr[String] = js.undefined
  
  /** @description The user that was affected by the action performed (if available). */
  var user: js.UndefOr[String] = js.undefined
  
  /** @description The repository visibility, for example `public` or `private`. */
  var visibility: js.UndefOr[String] = js.undefined
}
object Activewas {
  
  inline def apply(): Activewas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activewas]
  }
  
  extension [Self <: Activewas](x: Self) {
    
    inline def `set@timestamp`(value: Double): Self = StObject.set(x, "@timestamp", value.asInstanceOf[js.Any])
    
    inline def `set@timestampUndefined`: Self = StObject.set(x, "@timestamp", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActive_was(value: Boolean): Self = StObject.set(x, "active_was", value.asInstanceOf[js.Any])
    
    inline def setActive_wasUndefined: Self = StObject.set(x, "active_was", js.undefined)
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActor_id(value: Double): Self = StObject.set(x, "actor_id", value.asInstanceOf[js.Any])
    
    inline def setActor_idUndefined: Self = StObject.set(x, "actor_id", js.undefined)
    
    inline def setActor_location(value: Countryname): Self = StObject.set(x, "actor_location", value.asInstanceOf[js.Any])
    
    inline def setActor_locationUndefined: Self = StObject.set(x, "actor_location", js.undefined)
    
    inline def setBlocked_user(value: String): Self = StObject.set(x, "blocked_user", value.asInstanceOf[js.Any])
    
    inline def setBlocked_userUndefined: Self = StObject.set(x, "blocked_user", js.undefined)
    
    inline def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    inline def setBusinessUndefined: Self = StObject.set(x, "business", js.undefined)
    
    inline def setConfig(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setConfigVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "config", js.Array(value*))
    
    inline def setConfig_was(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "config_was", value.asInstanceOf[js.Any])
    
    inline def setConfig_wasUndefined: Self = StObject.set(x, "config_was", js.undefined)
    
    inline def setConfig_wasVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "config_was", js.Array(value*))
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeploy_key_fingerprint(value: String): Self = StObject.set(x, "deploy_key_fingerprint", value.asInstanceOf[js.Any])
    
    inline def setDeploy_key_fingerprintUndefined: Self = StObject.set(x, "deploy_key_fingerprint", js.undefined)
    
    inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
    
    inline def setEvents(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setEvents_were(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "events_were", value.asInstanceOf[js.Any])
    
    inline def setEvents_wereUndefined: Self = StObject.set(x, "events_were", js.undefined)
    
    inline def setEvents_wereVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "events_were", js.Array(value*))
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setHook_idUndefined: Self = StObject.set(x, "hook_id", js.undefined)
    
    inline def setLimited_availability(value: Boolean): Self = StObject.set(x, "limited_availability", value.asInstanceOf[js.Any])
    
    inline def setLimited_availabilityUndefined: Self = StObject.set(x, "limited_availability", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOld_user(value: String): Self = StObject.set(x, "old_user", value.asInstanceOf[js.Any])
    
    inline def setOld_userUndefined: Self = StObject.set(x, "old_user", js.undefined)
    
    inline def setOpenssh_public_key(value: String): Self = StObject.set(x, "openssh_public_key", value.asInstanceOf[js.Any])
    
    inline def setOpenssh_public_keyUndefined: Self = StObject.set(x, "openssh_public_key", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setOrg_id(value: Double): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_idUndefined: Self = StObject.set(x, "org_id", js.undefined)
    
    inline def setPrevious_visibility(value: String): Self = StObject.set(x, "previous_visibility", value.asInstanceOf[js.Any])
    
    inline def setPrevious_visibilityUndefined: Self = StObject.set(x, "previous_visibility", js.undefined)
    
    inline def setRead_only(value: Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
    
    inline def setRead_onlyUndefined: Self = StObject.set(x, "read_only", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRepository_public(value: Boolean): Self = StObject.set(x, "repository_public", value.asInstanceOf[js.Any])
    
    inline def setRepository_publicUndefined: Self = StObject.set(x, "repository_public", js.undefined)
    
    inline def setTarget_login(value: String): Self = StObject.set(x, "target_login", value.asInstanceOf[js.Any])
    
    inline def setTarget_loginUndefined: Self = StObject.set(x, "target_login", js.undefined)
    
    inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    inline def setTransport_protocol(value: Double): Self = StObject.set(x, "transport_protocol", value.asInstanceOf[js.Any])
    
    inline def setTransport_protocolUndefined: Self = StObject.set(x, "transport_protocol", js.undefined)
    
    inline def setTransport_protocol_name(value: String): Self = StObject.set(x, "transport_protocol_name", value.asInstanceOf[js.Any])
    
    inline def setTransport_protocol_nameUndefined: Self = StObject.set(x, "transport_protocol_name", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def set_document_id(value: String): Self = StObject.set(x, "_document_id", value.asInstanceOf[js.Any])
    
    inline def set_document_idUndefined: Self = StObject.set(x, "_document_id", js.undefined)
  }
}
