package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersUpdateAuthenticatedEndpoint extends js.Object {
  /**
    * The new short biography of the user.
    */
  var bio: js.UndefOr[String] = js.native
  /**
    * The new blog URL of the user.
    */
  var blog: js.UndefOr[String] = js.native
  /**
    * The new company of the user.
    */
  var company: js.UndefOr[String] = js.native
  /**
    * The publicly visible email address of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The new hiring availability of the user.
    */
  var hireable: js.UndefOr[Boolean] = js.native
  /**
    * The new location of the user.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The new name of the user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The new Twitter username of the user.
    */
  var twitter_username: js.UndefOr[String] = js.native
}

object UsersUpdateAuthenticatedEndpoint {
  @scala.inline
  def apply(): UsersUpdateAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersUpdateAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class UsersUpdateAuthenticatedEndpointOps[Self <: UsersUpdateAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setBio(value: String): Self = this.set("bio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBio: Self = this.set("bio", js.undefined)
    @scala.inline
    def setBlog(value: String): Self = this.set("blog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlog: Self = this.set("blog", js.undefined)
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setHireable(value: Boolean): Self = this.set("hireable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHireable: Self = this.set("hireable", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTwitter_username(value: String): Self = this.set("twitter_username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwitter_username: Self = this.set("twitter_username", js.undefined)
  }
  
}

