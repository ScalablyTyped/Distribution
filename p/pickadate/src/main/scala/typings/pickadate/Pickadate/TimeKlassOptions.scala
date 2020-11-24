package typings.pickadate.Pickadate

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
  implicit class TimeKlassOptionsOps[Self <: TimeKlassOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setListItem(value: String): Self = this.set("listItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
    
    @scala.inline
    def setViewset(value: String): Self = this.set("viewset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewset: Self = this.set("viewset", js.undefined)
  }
}
