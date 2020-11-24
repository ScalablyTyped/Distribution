package typings.meteorAstronomy.MeteorAstronomy

import typings.meteor.Mongo.FieldSpecifier
import typings.meteor.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOneOptions extends js.Object {
  
  var children: js.UndefOr[Double] = js.native
  
  var defaults: js.UndefOr[Boolean] = js.native
  
  var disableEvents: js.UndefOr[Boolean] = js.native
  
  var fields: js.UndefOr[FieldSpecifier] = js.native
  
  var reactive: js.UndefOr[Boolean] = js.native
  
  var skip: js.UndefOr[Double] = js.native
  
  var sort: js.UndefOr[SortSpecifier] = js.native
  
  var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object FindOneOptions {
  
  @scala.inline
  def apply(): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneOptions]
  }
  
  @scala.inline
  implicit class FindOneOptionsOps[Self <: FindOneOptions] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: Double): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaults(value: Boolean): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setDisableEvents(value: Boolean): Self = this.set("disableEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEvents: Self = this.set("disableEvents", js.undefined)
    
    @scala.inline
    def setFields(value: FieldSpecifier): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setReactive(value: Boolean): Self = this.set("reactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReactive: Self = this.set("reactive", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSort(value: SortSpecifier): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setTransform(value: /* repeated */ js.Any => _): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
