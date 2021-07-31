package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateReleaseEndpoint extends StObject {
  
  /**
    * Text describing the contents of the tag.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * `true` to create a draft (unpublished) release, `false` to create a published one.
    */
  var draft: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the release.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  /**
    * `true` to identify the release as a prerelease. `false` to identify the release as a full release.
    */
  var prerelease: js.UndefOr[Boolean] = js.undefined
  
  var repo: String
  
  /**
    * The name of the tag.
    */
  var tag_name: String
  
  /**
    * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch (usually `master`).
    */
  var target_commitish: js.UndefOr[String] = js.undefined
}
object ReposCreateReleaseEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, tag_name: String): ReposCreateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateReleaseEndpointMutableBuilder[Self <: ReposCreateReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_commitishUndefined: Self = StObject.set(x, "target_commitish", js.undefined)
  }
}
