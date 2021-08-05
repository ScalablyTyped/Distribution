package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assets extends StObject {
  
  var assets: js.Array[Browserdownloadurl]
  
  var assets_url: String
  
  var author: Avatarurl
  
  var body: String
  
  var created_at: String
  
  var draft: Boolean
  
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var prerelease: Boolean
  
  var published_at: String
  
  var tag_name: String
  
  var tarball_url: String
  
  var target_commitish: String
  
  var upload_url: String
  
  var url: String
  
  var zipball_url: String
}
object Assets {
  
  inline def apply(
    assets: js.Array[Browserdownloadurl],
    assets_url: String,
    author: Avatarurl,
    body: String,
    created_at: String,
    draft: Boolean,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    prerelease: Boolean,
    published_at: String,
    tag_name: String,
    tarball_url: String,
    target_commitish: String,
    upload_url: String,
    url: String,
    zipball_url: String
  ): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], assets_url = assets_url.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
  
  extension [Self <: Assets](x: Self) {
    
    inline def setAssets(value: js.Array[Browserdownloadurl]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: Browserdownloadurl*): Self = StObject.set(x, "assets", js.Array(value :_*))
    
    inline def setAssets_url(value: String): Self = StObject.set(x, "assets_url", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTarball_url(value: String): Self = StObject.set(x, "tarball_url", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setUpload_url(value: String): Self = StObject.set(x, "upload_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setZipball_url(value: String): Self = StObject.set(x, "zipball_url", value.asInstanceOf[js.Any])
  }
}
