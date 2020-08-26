package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsStartForAuthenticatedUserEndpoint extends js.Object {
  /**
    * Does not include attachments uploaded to GitHub.com in the migration data when set to `true`. Excluding attachments will reduce the migration archive file size.
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.native
  /**
    * Locks the `repositories` to prevent changes during the migration when set to `true`.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.native
  /**
    * An array of repositories to include in the migration.
    */
  var repositories: js.Array[String] = js.native
}

object MigrationsStartForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(repositories: js.Array[String]): MigrationsStartForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class MigrationsStartForAuthenticatedUserEndpointOps[Self <: MigrationsStartForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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

