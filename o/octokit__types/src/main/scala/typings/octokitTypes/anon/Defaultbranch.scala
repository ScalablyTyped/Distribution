package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaultbranch extends js.Object {
  
  var created_at: String = js.native
  
  var default_branch: String = js.native
  
  var description: String = js.native
  
  var fork: Boolean = js.native
  
  var forks_count: Double = js.native
  
  var full_name: String = js.native
  
  var homepage: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var language: String = js.native
  
  var master_branch: String = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var open_issues_count: Double = js.native
  
  var owner: Receivedeventsurl = js.native
  
  var `private`: Boolean = js.native
  
  var pushed_at: String = js.native
  
  var score: Double = js.native
  
  var size: Double = js.native
  
  var stargazers_count: Double = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
  
  var watchers_count: Double = js.native
}
object Defaultbranch {
  
  @scala.inline
  def apply(
    created_at: String,
    default_branch: String,
    description: String,
    fork: Boolean,
    forks_count: Double,
    full_name: String,
    homepage: String,
    html_url: String,
    id: Double,
    language: String,
    master_branch: String,
    name: String,
    node_id: String,
    open_issues_count: Double,
    owner: Receivedeventsurl,
    `private`: Boolean,
    pushed_at: String,
    score: Double,
    size: Double,
    stargazers_count: Double,
    updated_at: String,
    url: String,
    watchers_count: Double
  ): Defaultbranch = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks_count = forks_count.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], master_branch = master_branch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], open_issues_count = open_issues_count.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pushed_at = pushed_at.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stargazers_count = stargazers_count.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], watchers_count = watchers_count.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaultbranch]
  }
  
  @scala.inline
  implicit class DefaultbranchOps[Self <: Defaultbranch] (val x: Self) extends AnyVal {
    
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_branch(value: String): Self = this.set("default_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFork(value: Boolean): Self = this.set("fork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForks_count(value: Double): Self = this.set("forks_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_branch(value: String): Self = this.set("master_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_issues_count(value: Double): Self = this.set("open_issues_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Receivedeventsurl): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushed_at(value: String): Self = this.set("pushed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStargazers_count(value: Double): Self = this.set("stargazers_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchers_count(value: Double): Self = this.set("watchers_count", value.asInstanceOf[js.Any])
  }
}
