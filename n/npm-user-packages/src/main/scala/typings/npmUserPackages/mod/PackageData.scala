package typings.npmUserPackages.mod

import typings.npmUserPackages.anon.Bugs
import typings.npmUserPackages.anon.Email
import typings.npmUserPackages.anon.Username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageData extends js.Object {
  
  var author: Email = js.native
  
  var date: String = js.native
  
  var description: String = js.native
  
  var keywords: js.Array[String] = js.native
  
  var links: Bugs = js.native
  
  var maintainers: js.Array[Username] = js.native
  
  var name: String = js.native
  
  var publisher: Username = js.native
  
  var scope: String = js.native
  
  var version: String = js.native
}
object PackageData {
  
  @scala.inline
  def apply(
    author: Email,
    date: String,
    description: String,
    keywords: js.Array[String],
    links: Bugs,
    maintainers: js.Array[Username],
    name: String,
    publisher: Username,
    scope: String,
    version: String
  ): PackageData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageData]
  }
  
  @scala.inline
  implicit class PackageDataOps[Self <: PackageData] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: Email): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: Bugs): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainersVarargs(value: Username*): Self = this.set("maintainers", js.Array(value :_*))
    
    @scala.inline
    def setMaintainers(value: js.Array[Username]): Self = this.set("maintainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: Username): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
