package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sections extends StObject {
  
  var items: Boolean
  
  var sections: String
  
  var title: String
}
object Sections {
  
  inline def apply(items: Boolean, sections: String, title: String): Sections = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sections]
  }
  
  extension [Self <: Sections](x: Self) {
    
    inline def setItems(value: Boolean): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setSections(value: String): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
