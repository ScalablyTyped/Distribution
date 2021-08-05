package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinksArray extends StObject {
  
  var links: js.Array[js.Object]
}
object LinksArray {
  
  inline def apply(links: js.Array[js.Object]): LinksArray = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinksArray]
  }
  
  extension [Self <: LinksArray](x: Self) {
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
  }
}
