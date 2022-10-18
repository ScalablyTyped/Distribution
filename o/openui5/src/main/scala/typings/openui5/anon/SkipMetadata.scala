package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipMetadata extends StObject {
  
  /**
    * A valid cache key
    */
  var cacheKey: js.UndefOr[String] = js.undefined
  
  /**
    * A map of headers to be sent with every request; see {@link #setHeaders} for more details
    */
  var headers: Record[String, String]
  
  /**
    * Whether the metadata document will not be parsed for annotations
    */
  var skipMetadata: Boolean
  
  /**
    * One or several annotation sources; see {@link #addSource} for more details
    */
  var source: String | (Record[String, Any]) | (js.Array[(Record[String, Any]) | String])
}
object SkipMetadata {
  
  inline def apply(
    headers: Record[String, String],
    skipMetadata: Boolean,
    source: String | (Record[String, Any]) | (js.Array[(Record[String, Any]) | String])
  ): SkipMetadata = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], skipMetadata = skipMetadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipMetadata]
  }
  
  extension [Self <: SkipMetadata](x: Self) {
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setSkipMetadata(value: Boolean): Self = StObject.set(x, "skipMetadata", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String | (Record[String, Any]) | (js.Array[(Record[String, Any]) | String])): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: ((Record[String, Any]) | String)*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
