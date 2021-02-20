package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeKlassOptions extends KlassOptions {
  
  // default 'picker picker--time'
  // List of times
  var list: js.UndefOr[String] = js.native
  
  // default 'picker__list'
  var listItem: js.UndefOr[String] = js.native
  
  // default 'picker__list-item'
  // Time states
  var viewset: js.UndefOr[String] = js.native
}
object TimeKlassOptions {
  
  @scala.inline
  def apply(): TimeKlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeKlassOptions]
  }
  
  @scala.inline
  implicit class TimeKlassOptionsMutableBuilder[Self <: TimeKlassOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItem(value: String): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setViewset(value: String): Self = StObject.set(x, "viewset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsetUndefined: Self = StObject.set(x, "viewset", js.undefined)
  }
}
