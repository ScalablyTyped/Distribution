package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sections extends StObject {
  
  var items: Boolean = js.native
  
  var sections: String = js.native
  
  var title: String = js.native
}
object Sections {
  
  @scala.inline
  def apply(items: Boolean, sections: String, title: String): Sections = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sections]
  }
  
  @scala.inline
  implicit class SectionsMutableBuilder[Self <: Sections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: Boolean): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSections(value: String): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
