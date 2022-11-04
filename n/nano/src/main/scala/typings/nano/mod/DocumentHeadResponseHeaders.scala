package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document head response headers:
  * @see docs: {@link https://docs.couchdb.org/en/latest/api/document/common.html#head--db-docid} */
trait DocumentHeadResponseHeaders extends StObject {
  
  /** Double quoted document’s revision token. */
  var etag: String
}
object DocumentHeadResponseHeaders {
  
  inline def apply(etag: String): DocumentHeadResponseHeaders = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHeadResponseHeaders]
  }
  
  extension [Self <: DocumentHeadResponseHeaders](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
  }
}
