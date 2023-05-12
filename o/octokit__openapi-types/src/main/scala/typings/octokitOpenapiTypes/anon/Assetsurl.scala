package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assetsurl extends StObject {
  
  var assets: js.Array[BrowserdownloadurlContenttype]
  
  /** Format: uri */
  var assets_url: String
  
  /** User */
  var author: Deleted | Null
  
  var body: String | Null
  
  /** Format: date-time */
  var created_at: String | Null
  
  /** Format: uri */
  var discussion_url: js.UndefOr[String] = js.undefined
  
  /** @description Whether the release is a draft or published */
  var draft: Boolean
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var name: String | Null
  
  var node_id: String
  
  /** @description Whether the release is identified as a prerelease or a full release. */
  var prerelease: Boolean
  
  /** Format: date-time */
  var published_at: String | Null
  
  /** Reactions */
  var reactions: js.UndefOr[Eyes] = js.undefined
  
  /** @description The name of the tag. */
  var tag_name: String
  
  /** Format: uri */
  var tarball_url: String | Null
  
  /** @description Specifies the commitish value that determines where the Git tag is created from. */
  var target_commitish: String
  
  /** Format: uri-template */
  var upload_url: String
  
  /** Format: uri */
  var url: String
  
  /** Format: uri */
  var zipball_url: String | Null
}
object Assetsurl {
  
  inline def apply(
    assets: js.Array[BrowserdownloadurlContenttype],
    assets_url: String,
    draft: Boolean,
    html_url: String,
    id: Double,
    node_id: String,
    prerelease: Boolean,
    tag_name: String,
    target_commitish: String,
    upload_url: String,
    url: String
  ): Assetsurl = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], assets_url = assets_url.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], author = null, body = null, created_at = null, name = null, published_at = null, tarball_url = null, zipball_url = null)
    __obj.asInstanceOf[Assetsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assetsurl] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: js.Array[BrowserdownloadurlContenttype]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: BrowserdownloadurlContenttype*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setAssets_url(value: String): Self = StObject.set(x, "assets_url", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: Deleted): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setDiscussion_url(value: String): Self = StObject.set(x, "discussion_url", value.asInstanceOf[js.Any])
    
    inline def setDiscussion_urlUndefined: Self = StObject.set(x, "discussion_url", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setPublished_atNull: Self = StObject.set(x, "published_at", null)
    
    inline def setReactions(value: Eyes): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
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
