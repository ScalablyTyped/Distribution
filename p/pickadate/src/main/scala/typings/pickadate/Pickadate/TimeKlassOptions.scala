package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeKlassOptions
  extends StObject
     with KlassOptions {
  
  // default 'picker picker--time'
  // List of times
  var list: js.UndefOr[String] = js.undefined
  
  // default 'picker__list'
  var listItem: js.UndefOr[String] = js.undefined
  
  // default 'picker__list-item'
  // Time states
  var viewset: js.UndefOr[String] = js.undefined
}
object TimeKlassOptions {
  
  inline def apply(): TimeKlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeKlassOptions]
  }
  
  extension [Self <: TimeKlassOptions](x: Self) {
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListItem(value: String): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setViewset(value: String): Self = StObject.set(x, "viewset", value.asInstanceOf[js.Any])
    
    inline def setViewsetUndefined: Self = StObject.set(x, "viewset", js.undefined)
  }
}
