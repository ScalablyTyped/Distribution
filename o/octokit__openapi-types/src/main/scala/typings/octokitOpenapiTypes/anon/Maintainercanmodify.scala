package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maintainercanmodify extends StObject {
  
  /** @description The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository. */
  var base: String
  
  /** @description The contents of the pull request. */
  var body: js.UndefOr[String] = js.undefined
  
  /** @description Indicates whether the pull request is a draft. See "[Draft Pull Requests](https://docs.github.com/en/articles/about-pull-requests#draft-pull-requests)" in the GitHub Help documentation to learn more. */
  var draft: js.UndefOr[Boolean] = js.undefined
  
  /** @description The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`. */
  var head: String
  
  /**
    * @description An issue in the repository to convert to a pull request. The issue title, body, and comments will become the title, body, and comments on the new pull request. Required unless `title` is specified.
    * @example 1
    */
  var issue: js.UndefOr[Double] = js.undefined
  
  /** @description Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request. */
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  
  /** @description The title of the new pull request. Required unless `issue` is specified. */
  var title: js.UndefOr[String] = js.undefined
}
object Maintainercanmodify {
  
  inline def apply(base: String, head: String): Maintainercanmodify = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintainercanmodify]
  }
  
  extension [Self <: Maintainercanmodify](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setIssue(value: Double): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setMaintainer_can_modify(value: Boolean): Self = StObject.set(x, "maintainer_can_modify", value.asInstanceOf[js.Any])
    
    inline def setMaintainer_can_modifyUndefined: Self = StObject.set(x, "maintainer_can_modify", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
