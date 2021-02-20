package typings.phantom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageId extends StObject {
  
  var pageId: String = js.native
}
object PageId {
  
  @scala.inline
  def apply(pageId: String): PageId = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageId]
  }
  
  @scala.inline
  implicit class PageIdMutableBuilder[Self <: PageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
  }
}
