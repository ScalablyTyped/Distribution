package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`false`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`true`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.legacy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discussioncategoryname extends StObject {
  
  /** @description Text describing the contents of the tag. */
  var body: js.UndefOr[String] = js.undefined
  
  /** @description If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see "[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository)." */
  var discussion_category_name: js.UndefOr[String] = js.undefined
  
  /**
    * @description `true` to create a draft (unpublished) release, `false` to create a published one.
    * @default false
    */
  var draft: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to automatically generate the name and body for this release. If `name` is specified, the specified name will be used; otherwise, a name will be automatically generated. If `body` is specified, the body will be pre-pended to the automatically generated notes.
    * @default false
    */
  var generate_release_notes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest release should be determined based on the release creation date and higher semantic version.
    * @default true
    * @enum {string}
    */
  var make_latest: js.UndefOr[`true` | `false` | legacy] = js.undefined
  
  /** @description The name of the release. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description `true` to identify the release as a prerelease. `false` to identify the release as a full release.
    * @default false
    */
  var prerelease: js.UndefOr[Boolean] = js.undefined
  
  /** @description The name of the tag. */
  var tag_name: String
  
  /** @description Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch. */
  var target_commitish: js.UndefOr[String] = js.undefined
}
object Discussioncategoryname {
  
  inline def apply(tag_name: String): Discussioncategoryname = {
    val __obj = js.Dynamic.literal(tag_name = tag_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discussioncategoryname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Discussioncategoryname] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDiscussion_category_name(value: String): Self = StObject.set(x, "discussion_category_name", value.asInstanceOf[js.Any])
    
    inline def setDiscussion_category_nameUndefined: Self = StObject.set(x, "discussion_category_name", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setGenerate_release_notes(value: Boolean): Self = StObject.set(x, "generate_release_notes", value.asInstanceOf[js.Any])
    
    inline def setGenerate_release_notesUndefined: Self = StObject.set(x, "generate_release_notes", js.undefined)
    
    inline def setMake_latest(value: `true` | `false` | legacy): Self = StObject.set(x, "make_latest", value.asInstanceOf[js.Any])
    
    inline def setMake_latestUndefined: Self = StObject.set(x, "make_latest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitishUndefined: Self = StObject.set(x, "target_commitish", js.undefined)
  }
}
