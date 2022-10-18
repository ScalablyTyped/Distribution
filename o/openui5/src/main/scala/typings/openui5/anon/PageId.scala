package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageId extends StObject {
  
  /**
    * Id of the page which will be unloaded
    */
  var pageId: js.UndefOr[String] = js.undefined
}
object PageId {
  
  inline def apply(): PageId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageId]
  }
  
  extension [Self <: PageId](x: Self) {
    
    inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    inline def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
  }
}
