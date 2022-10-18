package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SETag extends StObject {
  
  /**
    * an ETag which can be used for concurrency control. If it is specified, it will be used in an If-Match-Header
    * in the request to the server for this entry.
    */
  var sETag: js.UndefOr[String] = js.undefined
}
object SETag {
  
  inline def apply(): SETag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SETag]
  }
  
  extension [Self <: SETag](x: Self) {
    
    inline def setSETag(value: String): Self = StObject.set(x, "sETag", value.asInstanceOf[js.Any])
    
    inline def setSETagUndefined: Self = StObject.set(x, "sETag", js.undefined)
  }
}
