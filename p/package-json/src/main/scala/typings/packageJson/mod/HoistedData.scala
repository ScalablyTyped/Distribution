package typings.packageJson.mod

import typings.packageJson.anon.Email
import typings.packageJson.anon.Type
import typings.packageJson.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoistedData extends js.Object {
  
  val author: js.UndefOr[Person] = js.native
  
  val bugs: js.UndefOr[Email | Url] = js.native
  
  val contributors: js.UndefOr[js.Array[Person]] = js.native
  
  val description: js.UndefOr[String] = js.native
  
  val homepage: js.UndefOr[String] = js.native
  
  val keywords: js.UndefOr[js.Array[String]] = js.native
  
  val license: js.UndefOr[String] = js.native
  
  val maintainers: js.UndefOr[js.Array[Person]] = js.native
  
  val readme: js.UndefOr[String] = js.native
  
  val readmeFilename: js.UndefOr[String] = js.native
  
  val repository: js.UndefOr[Type] = js.native
}
object HoistedData {
  
  @scala.inline
  def apply(): HoistedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoistedData]
  }
  
  @scala.inline
  implicit class HoistedDataOps[Self <: HoistedData] (val x: Self) extends AnyVal {
    
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
    def setBugs(value: Email | Url): Self = this.set("bugs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBugs: Self = this.set("bugs", js.undefined)
    
    @scala.inline
    def setContributorsVarargs(value: Person*): Self = this.set("contributors", js.Array(value :_*))
    
    @scala.inline
    def setContributors(value: js.Array[Person]): Self = this.set("contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributors: Self = this.set("contributors", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
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
    def setRepository(value: Type): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
}
