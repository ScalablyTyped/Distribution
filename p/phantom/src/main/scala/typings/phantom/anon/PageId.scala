package typings.phantom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageId extends StObject {
  
  var pageId: String
}
object PageId {
  
  inline def apply(pageId: String): PageId = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageId]
  }
  
  extension [Self <: PageId](x: Self) {
    
    inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
  }
}
