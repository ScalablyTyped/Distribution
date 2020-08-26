package typings.newGithubReleaseUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions extends js.Object {
  /**
  		The description text of the release.
  		*/
  val body: js.UndefOr[String] = js.native
  /**
  		Whether the release should be marked as a pre-release.
  		@default false
  		*/
  val isPrerelease: js.UndefOr[Boolean] = js.native
  /**
  		The tag name of the release.
  		*/
  val tag: js.UndefOr[String] = js.native
  /**
  		The branch name or commit SHA to point the release's tag at, if the tag doesn't already exist.
  		Default: The default branch.
  		*/
  val target: js.UndefOr[String] = js.native
  /**
  		The title of the release.
  		GitHub shows the `tag` name when not specified.
  		*/
  val title: js.UndefOr[String] = js.native
}

object BaseOptions {
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setIsPrerelease(value: Boolean): Self = this.set("isPrerelease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrerelease: Self = this.set("isPrerelease", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

