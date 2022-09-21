package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prerelease extends StObject {
  
  /** @description Text describing the contents of the tag. */
  var body: js.UndefOr[String] = js.undefined
  
  /** @description If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. If there is already a discussion linked to the release, this parameter is ignored. For more information, see "[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository)." */
  var discussion_category_name: js.UndefOr[String] = js.undefined
  
  /** @description `true` makes the release a draft, and `false` publishes the release. */
  var draft: js.UndefOr[Boolean] = js.undefined
  
  /** @description The name of the release. */
  var name: js.UndefOr[String] = js.undefined
  
  /** @description `true` to identify the release as a prerelease, `false` to identify the release as a full release. */
  var prerelease: js.UndefOr[Boolean] = js.undefined
  
  /** @description The name of the tag. */
  var tag_name: js.UndefOr[String] = js.undefined
  
  /** @description Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch (usually `master`). */
  var target_commitish: js.UndefOr[String] = js.undefined
}
object Prerelease {
  
  inline def apply(): Prerelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prerelease]
  }
  
  extension [Self <: Prerelease](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDiscussion_category_name(value: String): Self = StObject.set(x, "discussion_category_name", value.asInstanceOf[js.Any])
    
    inline def setDiscussion_category_nameUndefined: Self = StObject.set(x, "discussion_category_name", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTag_nameUndefined: Self = StObject.set(x, "tag_name", js.undefined)
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitishUndefined: Self = StObject.set(x, "target_commitish", js.undefined)
  }
}
