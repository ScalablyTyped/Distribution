package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends StObject {
  
  var items: js.Array[BorderColor] = js.native
  
  var sections: js.Array[js.Object] = js.native
  
  var title: String = js.native
  
  var titleHalign: center | end | start = js.native
  
  var titleStyle: js.Object = js.native
}
object Items {
  
  @scala.inline
  def apply(
    items: js.Array[BorderColor],
    sections: js.Array[js.Object],
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[BorderColor]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: BorderColor*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: js.Array[js.Object]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsVarargs(value: js.Object*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleHalign(value: center | end | start): Self = StObject.set(x, "titleHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: js.Object): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
  }
}
