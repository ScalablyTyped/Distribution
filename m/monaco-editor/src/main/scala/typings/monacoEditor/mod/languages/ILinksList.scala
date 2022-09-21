package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILinksList extends StObject {
  
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var links: js.Array[ILink]
}
object ILinksList {
  
  inline def apply(links: js.Array[ILink]): ILinksList = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinksList]
  }
  
  extension [Self <: ILinksList](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setLinks(value: js.Array[ILink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: ILink*): Self = StObject.set(x, "links", js.Array(value*))
  }
}
