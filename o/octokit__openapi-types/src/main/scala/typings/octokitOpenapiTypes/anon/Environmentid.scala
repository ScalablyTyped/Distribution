package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Available
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Awaiting
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Deleted
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.EastUs
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Exporting
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Failed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Moved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Provisioning
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Queued
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Rebuilding
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Shutdown
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.ShuttingDown
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.SouthEastAsia
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Starting
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Unavailable
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Unknown
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Updating
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.WestEurope
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.WestUs2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environmentid extends StObject {
  
  var billable_owner: Avatarurl
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:01:12Z
    */
  var created_at: String
  
  /**
    * @description Path to devcontainer.json from repo root used to create Codespace.
    * @example .devcontainer/example/devcontainer.json
    */
  var devcontainer_path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Display name for this codespace.
    * @example bookish space pancake
    */
  var display_name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description UUID identifying this codespace's environment.
    * @example 26a7c758-7299-4a73-b978-5a92a7ae98a0
    */
  var environment_id: String | Null
  
  /** @description Details about the codespace's git repository. */
  var git_status: Ahead
  
  /** @example 1 */
  var id: Double
  
  /**
    * @description The number of minutes of inactivity after which this codespace will be automatically stopped.
    * @example 60
    */
  var idle_timeout_minutes: Double | Null
  
  /** @description Text to show user when codespace idle timeout minutes has been overriden by an organization policy */
  var idle_timeout_notice: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description The text to display to a user when a codespace has been stopped for a potentially actionable reason.
    * @example you've used 100% of your spending limit for Codespaces
    */
  var last_known_stop_notice: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: date-time
    * @description Last known time this codespace was started.
    * @example 2011-01-26T19:01:12Z
    */
  var last_used_at: String
  
  /**
    * @description The Azure region where this codespace is located.
    * @example WestUs2
    * @enum {string}
    */
  var location: EastUs | SouthEastAsia | WestEurope | WestUs2
  
  var machine: Cpus | Null
  
  /**
    * Format: uri
    * @description API URL to access available alternate machine types for this codespace.
    */
  var machines_url: String
  
  /**
    * @description Automatically generated name of this codespace.
    * @example monalisa-octocat-hello-world-g4wpq6h95q
    */
  var name: String
  
  var owner: Avatarurl
  
  /** @description Whether or not a codespace has a pending async operation. This would mean that the codespace is temporarily unavailable. The only thing that you can do with a codespace in this state is delete it. */
  var pending_operation: js.UndefOr[Boolean | Null] = js.undefined
  
  /** @description Text to show user when codespace is disabled by a pending operation */
  var pending_operation_disabled_reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Whether the codespace was created from a prebuild.
    * @example false
    */
  var prebuild: Boolean | Null
  
  /**
    * Format: uri
    * @description API URL for the Pull Request associated with this codespace, if any.
    */
  var pulls_url: String | Null
  
  var recent_folders: js.Array[String]
  
  var repository: Branchesurl
  
  /**
    * Format: date-time
    * @description When a codespace will be auto-deleted based on the "retention_period_minutes" and "last_used_at"
    * @example 2011-01-26T20:01:12Z
    */
  var retention_expires_at: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days).
    * @example 60
    */
  var retention_period_minutes: js.UndefOr[Double | Null] = js.undefined
  
  var runtime_constraints: js.UndefOr[Allowedportprivacysettings] = js.undefined
  
  /**
    * Format: uri
    * @description API URL to start this codespace.
    */
  var start_url: String
  
  /**
    * @description State of this codespace.
    * @example Available
    * @enum {string}
    */
  var state: Unknown | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Created | Queued | Provisioning | Available | Awaiting | Unavailable | Deleted | Moved | Shutdown | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Archived | Starting | ShuttingDown | Failed | Exporting | Updating | Rebuilding
  
  /**
    * Format: uri
    * @description API URL to stop this codespace.
    */
  var stop_url: String
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:01:12Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @description API URL for this codespace.
    */
  var url: String
  
  /**
    * Format: uri
    * @description URL to access this codespace on the web.
    */
  var web_url: String
}
object Environmentid {
  
  inline def apply(
    billable_owner: Avatarurl,
    created_at: String,
    git_status: Ahead,
    id: Double,
    last_used_at: String,
    location: EastUs | SouthEastAsia | WestEurope | WestUs2,
    machines_url: String,
    name: String,
    owner: Avatarurl,
    recent_folders: js.Array[String],
    repository: Branchesurl,
    start_url: String,
    state: Unknown | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Created | Queued | Provisioning | Available | Awaiting | Unavailable | Deleted | Moved | Shutdown | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Archived | Starting | ShuttingDown | Failed | Exporting | Updating | Rebuilding,
    stop_url: String,
    updated_at: String,
    url: String,
    web_url: String
  ): Environmentid = {
    val __obj = js.Dynamic.literal(billable_owner = billable_owner.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], git_status = git_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_used_at = last_used_at.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], machines_url = machines_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], recent_folders = recent_folders.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], start_url = start_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stop_url = stop_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any], environment_id = null, idle_timeout_minutes = null, machine = null, prebuild = null, pulls_url = null)
    __obj.asInstanceOf[Environmentid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environmentid] (val x: Self) extends AnyVal {
    
    inline def setBillable_owner(value: Avatarurl): Self = StObject.set(x, "billable_owner", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDevcontainer_path(value: String): Self = StObject.set(x, "devcontainer_path", value.asInstanceOf[js.Any])
    
    inline def setDevcontainer_pathNull: Self = StObject.set(x, "devcontainer_path", null)
    
    inline def setDevcontainer_pathUndefined: Self = StObject.set(x, "devcontainer_path", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameNull: Self = StObject.set(x, "display_name", null)
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_idNull: Self = StObject.set(x, "environment_id", null)
    
    inline def setGit_status(value: Ahead): Self = StObject.set(x, "git_status", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdle_timeout_minutes(value: Double): Self = StObject.set(x, "idle_timeout_minutes", value.asInstanceOf[js.Any])
    
    inline def setIdle_timeout_minutesNull: Self = StObject.set(x, "idle_timeout_minutes", null)
    
    inline def setIdle_timeout_notice(value: String): Self = StObject.set(x, "idle_timeout_notice", value.asInstanceOf[js.Any])
    
    inline def setIdle_timeout_noticeNull: Self = StObject.set(x, "idle_timeout_notice", null)
    
    inline def setIdle_timeout_noticeUndefined: Self = StObject.set(x, "idle_timeout_notice", js.undefined)
    
    inline def setLast_known_stop_notice(value: String): Self = StObject.set(x, "last_known_stop_notice", value.asInstanceOf[js.Any])
    
    inline def setLast_known_stop_noticeNull: Self = StObject.set(x, "last_known_stop_notice", null)
    
    inline def setLast_known_stop_noticeUndefined: Self = StObject.set(x, "last_known_stop_notice", js.undefined)
    
    inline def setLast_used_at(value: String): Self = StObject.set(x, "last_used_at", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: EastUs | SouthEastAsia | WestEurope | WestUs2): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMachine(value: Cpus): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
    
    inline def setMachineNull: Self = StObject.set(x, "machine", null)
    
    inline def setMachines_url(value: String): Self = StObject.set(x, "machines_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPending_operation(value: Boolean): Self = StObject.set(x, "pending_operation", value.asInstanceOf[js.Any])
    
    inline def setPending_operationNull: Self = StObject.set(x, "pending_operation", null)
    
    inline def setPending_operationUndefined: Self = StObject.set(x, "pending_operation", js.undefined)
    
    inline def setPending_operation_disabled_reason(value: String): Self = StObject.set(x, "pending_operation_disabled_reason", value.asInstanceOf[js.Any])
    
    inline def setPending_operation_disabled_reasonNull: Self = StObject.set(x, "pending_operation_disabled_reason", null)
    
    inline def setPending_operation_disabled_reasonUndefined: Self = StObject.set(x, "pending_operation_disabled_reason", js.undefined)
    
    inline def setPrebuild(value: Boolean): Self = StObject.set(x, "prebuild", value.asInstanceOf[js.Any])
    
    inline def setPrebuildNull: Self = StObject.set(x, "prebuild", null)
    
    inline def setPulls_url(value: String): Self = StObject.set(x, "pulls_url", value.asInstanceOf[js.Any])
    
    inline def setPulls_urlNull: Self = StObject.set(x, "pulls_url", null)
    
    inline def setRecent_folders(value: js.Array[String]): Self = StObject.set(x, "recent_folders", value.asInstanceOf[js.Any])
    
    inline def setRecent_foldersVarargs(value: String*): Self = StObject.set(x, "recent_folders", js.Array(value*))
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRetention_expires_at(value: String): Self = StObject.set(x, "retention_expires_at", value.asInstanceOf[js.Any])
    
    inline def setRetention_expires_atNull: Self = StObject.set(x, "retention_expires_at", null)
    
    inline def setRetention_expires_atUndefined: Self = StObject.set(x, "retention_expires_at", js.undefined)
    
    inline def setRetention_period_minutes(value: Double): Self = StObject.set(x, "retention_period_minutes", value.asInstanceOf[js.Any])
    
    inline def setRetention_period_minutesNull: Self = StObject.set(x, "retention_period_minutes", null)
    
    inline def setRetention_period_minutesUndefined: Self = StObject.set(x, "retention_period_minutes", js.undefined)
    
    inline def setRuntime_constraints(value: Allowedportprivacysettings): Self = StObject.set(x, "runtime_constraints", value.asInstanceOf[js.Any])
    
    inline def setRuntime_constraintsUndefined: Self = StObject.set(x, "runtime_constraints", js.undefined)
    
    inline def setStart_url(value: String): Self = StObject.set(x, "start_url", value.asInstanceOf[js.Any])
    
    inline def setState(
      value: Unknown | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Created | Queued | Provisioning | Available | Awaiting | Unavailable | Deleted | Moved | Shutdown | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Archived | Starting | ShuttingDown | Failed | Exporting | Updating | Rebuilding
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStop_url(value: String): Self = StObject.set(x, "stop_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
  }
}
