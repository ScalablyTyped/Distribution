package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tagger extends StObject {
  
  /**
    * @description Message describing the purpose of the tag
    * @example Initial public release
    */
  var message: String
  
  /** @example MDM6VGFnOTQwYmQzMzYyNDhlZmFlMGY5ZWU1YmM3YjJkNWM5ODU4ODdiMTZhYw== */
  var node_id: String
  
  var `object`: TypeUrl
  
  /** @example 940bd336248efae0f9ee5bc7b2d5c985887b16ac */
  var sha: String
  
  /**
    * @description Name of the tag
    * @example v0.0.1
    */
  var tag: String
  
  var tagger: DateEmailName
  
  /**
    * Format: uri
    * @description URL for the tag
    * @example https://api.github.com/repositories/42/git/tags/940bd336248efae0f9ee5bc7b2d5c985887b16ac
    */
  var url: String
  
  var verification: js.UndefOr[Reason] = js.undefined
}
object Tagger {
  
  inline def apply(
    message: String,
    node_id: String,
    `object`: TypeUrl,
    sha: String,
    tag: String,
    tagger: DateEmailName,
    url: String
  ): Tagger = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagger]
  }
  
  extension [Self <: Tagger](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setObject(value: TypeUrl): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagger(value: DateEmailName): Self = StObject.set(x, "tagger", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Reason): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
