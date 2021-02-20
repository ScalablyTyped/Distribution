package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinksArray extends StObject {
  
  var links: js.Array[js.Object] = js.native
}
object LinksArray {
  
  @scala.inline
  def apply(links: js.Array[js.Object]): LinksArray = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinksArray]
  }
  
  @scala.inline
  implicit class LinksArrayMutableBuilder[Self <: LinksArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
  }
}
