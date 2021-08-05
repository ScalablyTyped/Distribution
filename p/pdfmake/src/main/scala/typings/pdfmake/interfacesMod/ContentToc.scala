package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentToc
  extends StObject
     with ContentBase
     with _Content {
  
  var toc: TableOfContent
}
object ContentToc {
  
  inline def apply(toc: TableOfContent): ContentToc = {
    val __obj = js.Dynamic.literal(toc = toc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentToc]
  }
  
  extension [Self <: ContentToc](x: Self) {
    
    inline def setToc(value: TableOfContent): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
  }
}
