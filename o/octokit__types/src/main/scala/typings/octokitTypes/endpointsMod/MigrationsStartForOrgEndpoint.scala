package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsStartForOrgEndpoint extends js.Object {
  
  /**
    * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * A list of arrays indicating which repositories should be migrated.
    */
  var repositories: js.Array[String] = js.native
}
object MigrationsStartForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, repositories: js.Array[String]): MigrationsStartForOrgEndpoint = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForOrgEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsStartForOrgEndpointOps[Self <: MigrationsStartForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesVarargs(value: String*): Self = this.set("repositories", js.Array(value :_*))
    
    @scala.inline
    def setRepositories(value: js.Array[String]): Self = this.set("repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_attachments(value: Boolean): Self = this.set("exclude_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_attachments: Self = this.set("exclude_attachments", js.undefined)
    
    @scala.inline
    def setLock_repositories(value: Boolean): Self = this.set("lock_repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLock_repositories: Self = this.set("lock_repositories", js.undefined)
  }
}
