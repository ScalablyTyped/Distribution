package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends js.Object {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.native
  
  /** The environment authorization code. */
  var authorizationCode: js.UndefOr[String] = js.native
  
  /** The last update time-stamp for the authorization code. */
  var authorizationTimestamp: js.UndefOr[String] = js.native
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.native
  
  /** Represents a link to a container version. */
  var containerVersionId: js.UndefOr[String] = js.native
  
  /**
    * The environment description. Can be set or changed only on USER type environments. @mutable tagmanager.accounts.containers.environments.create @mutable
    * tagmanager.accounts.containers.environments.update
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to enable debug by default for the environment. @mutable tagmanager.accounts.containers.environments.create @mutable
    * tagmanager.accounts.containers.environments.update
    */
  var enableDebug: js.UndefOr[Boolean] = js.native
  
  /** GTM Environment ID uniquely identifies the GTM Environment. */
  var environmentId: js.UndefOr[String] = js.native
  
  /** The fingerprint of the GTM environment as computed at storage time. This value is recomputed whenever the environment is modified. */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The environment display name. Can be set or changed only on USER type environments. @mutable tagmanager.accounts.containers.environments.create @mutable
    * tagmanager.accounts.containers.environments.update
    */
  var name: js.UndefOr[String] = js.native
  
  /** GTM Environment's API relative path. */
  var path: js.UndefOr[String] = js.native
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.native
  
  /** The type of this environment. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Default preview page url for the environment. @mutable tagmanager.accounts.containers.environments.create @mutable tagmanager.accounts.containers.environments.update */
  var url: js.UndefOr[String] = js.native
  
  /** Represents a link to a quick preview of a workspace. */
  var workspaceId: js.UndefOr[String] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAuthorizationCode(value: String): Self = this.set("authorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationCode: Self = this.set("authorizationCode", js.undefined)
    
    @scala.inline
    def setAuthorizationTimestamp(value: String): Self = this.set("authorizationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationTimestamp: Self = this.set("authorizationTimestamp", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setContainerVersionId(value: String): Self = this.set("containerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerVersionId: Self = this.set("containerVersionId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnableDebug(value: Boolean): Self = this.set("enableDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDebug: Self = this.set("enableDebug", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: String): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentId: Self = this.set("environmentId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
  }
}
