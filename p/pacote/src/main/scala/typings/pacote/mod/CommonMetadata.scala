package typings.pacote.mod

import typings.pacote.anon.Directory
import typings.pacote.anon.Email
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonMetadata extends js.Object {
  var author: js.UndefOr[Person] = js.native
  var bugs: js.UndefOr[Email] = js.native
  var contributors: js.UndefOr[js.Array[Person]] = js.native
  var homepage: js.UndefOr[String] = js.native
  var keywords: js.UndefOr[js.Array[String]] = js.native
  var license: js.UndefOr[String] = js.native
  var maintainers: js.UndefOr[js.Array[Person]] = js.native
  var readme: js.UndefOr[String] = js.native
  var readmeFilename: js.UndefOr[String] = js.native
  var repository: js.UndefOr[Directory] = js.native
  var users: js.UndefOr[Record[String, Boolean]] = js.native
}

object CommonMetadata {
  @scala.inline
  def apply(): CommonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMetadata]
  }
  @scala.inline
  implicit class CommonMetadataOps[Self <: CommonMetadata] (val x: Self) extends AnyVal {
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
    def setAuthor(value: Person): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setBugs(value: Email): Self = this.set("bugs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBugs: Self = this.set("bugs", js.undefined)
    @scala.inline
    def setContributorsVarargs(value: Person*): Self = this.set("contributors", js.Array(value :_*))
    @scala.inline
    def setContributors(value: js.Array[Person]): Self = this.set("contributors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContributors: Self = this.set("contributors", js.undefined)
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    @scala.inline
    def setMaintainersVarargs(value: Person*): Self = this.set("maintainers", js.Array(value :_*))
    @scala.inline
    def setMaintainers(value: js.Array[Person]): Self = this.set("maintainers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainers: Self = this.set("maintainers", js.undefined)
    @scala.inline
    def setReadme(value: String): Self = this.set("readme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadme: Self = this.set("readme", js.undefined)
    @scala.inline
    def setReadmeFilename(value: String): Self = this.set("readmeFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadmeFilename: Self = this.set("readmeFilename", js.undefined)
    @scala.inline
    def setRepository(value: Directory): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    @scala.inline
    def setUsers(value: Record[String, Boolean]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

