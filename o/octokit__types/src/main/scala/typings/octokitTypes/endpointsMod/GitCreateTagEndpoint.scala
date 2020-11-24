package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.blob
import typings.octokitTypes.octokitTypesStrings.commit
import typings.octokitTypes.octokitTypesStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCreateTagEndpoint extends js.Object {
  
  /**
    * The tag message.
    */
  var message: String = js.native
  
  /**
    * The SHA of the git object this is tagging.
    */
  var `object`: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * The tag's name. This is typically a version (e.g., "v0.0.1").
    */
  var tag: String = js.native
  
  /**
    * An object with information about the individual creating the tag.
    */
  var tagger: js.UndefOr[GitCreateTagParamsTagger] = js.native
  
  /**
    * The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
    */
  var `type`: commit | tree | blob = js.native
}
object GitCreateTagEndpoint {
  
  @scala.inline
  def apply(
    message: String,
    `object`: String,
    owner: String,
    repo: String,
    tag: String,
    `type`: commit | tree | blob
  ): GitCreateTagEndpoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagEndpoint]
  }
  
  @scala.inline
  implicit class GitCreateTagEndpointOps[Self <: GitCreateTagEndpoint] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: commit | tree | blob): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagger(value: GitCreateTagParamsTagger): Self = this.set("tagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagger: Self = this.set("tagger", js.undefined)
  }
}
