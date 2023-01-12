package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assets extends StObject {
  
  var assets: js.Array[Downloadcount]
  
  /** Format: uri */
  var assets_url: String
  
  var author: Avatarurl
  
  var body: js.UndefOr[String | Null] = js.undefined
  
  var body_html: js.UndefOr[String] = js.undefined
  
  var body_text: js.UndefOr[String] = js.undefined
  
  /** Format: date-time */
  var created_at: String
  
  /**
    * Format: uri
    * @description The URL of the release discussion.
    */
  var discussion_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description true to create a draft (unpublished) release, false to create a published one.
    * @example false
    */
  var draft: Boolean
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var mentions_count: js.UndefOr[Double] = js.undefined
  
  var name: String | Null
  
  var node_id: String
  
  /**
    * @description Whether to identify the release as a prerelease or a full release.
    * @example false
    */
  var prerelease: Boolean
  
  /** Format: date-time */
  var published_at: String | Null
  
  var reactions: js.UndefOr[Confused] = js.undefined
  
  /**
    * @description The name of the tag.
    * @example v1.0.0
    */
  var tag_name: String
  
  /** Format: uri */
  var tarball_url: String | Null
  
  /**
    * @description Specifies the commitish value that determines where the Git tag is created from.
    * @example master
    */
  var target_commitish: String
  
  var upload_url: String
  
  /** Format: uri */
  var url: String
  
  /** Format: uri */
  var zipball_url: String | Null
}
object Assets {
  
  inline def apply(
    assets: js.Array[Downloadcount],
    assets_url: String,
    author: Avatarurl,
    created_at: String,
    draft: Boolean,
    html_url: String,
    id: Double,
    node_id: String,
    prerelease: Boolean,
    tag_name: String,
    target_commitish: String,
    upload_url: String,
    url: String
  ): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], assets_url = assets_url.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], name = null, published_at = null, tarball_url = null, zipball_url = null)
    __obj.asInstanceOf[Assets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: js.Array[Downloadcount]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: Downloadcount*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setAssets_url(value: String): Self = StObject.set(x, "assets_url", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_htmlUndefined: Self = StObject.set(x, "body_html", js.undefined)
    
    inline def setBody_text(value: String): Self = StObject.set(x, "body_text", value.asInstanceOf[js.Any])
    
    inline def setBody_textUndefined: Self = StObject.set(x, "body_text", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDiscussion_url(value: String): Self = StObject.set(x, "discussion_url", value.asInstanceOf[js.Any])
    
    inline def setDiscussion_urlUndefined: Self = StObject.set(x, "discussion_url", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMentions_count(value: Double): Self = StObject.set(x, "mentions_count", value.asInstanceOf[js.Any])
    
    inline def setMentions_countUndefined: Self = StObject.set(x, "mentions_count", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setPublished_atNull: Self = StObject.set(x, "published_at", null)
    
    inline def setReactions(value: Confused): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTarball_url(value: String): Self = StObject.set(x, "tarball_url", value.asInstanceOf[js.Any])
    
    inline def setTarball_urlNull: Self = StObject.set(x, "tarball_url", null)
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setUpload_url(value: String): Self = StObject.set(x, "upload_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setZipball_url(value: String): Self = StObject.set(x, "zipball_url", value.asInstanceOf[js.Any])
    
    inline def setZipball_urlNull: Self = StObject.set(x, "zipball_url", null)
  }
}
