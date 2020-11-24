package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterFurther extends js.Object {
  
  var filterFurther: js.UndefOr[String] = js.native
  
  var noMatchesFound: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Hint] = js.native
}
object FilterFurther {
  
  @scala.inline
  def apply(): FilterFurther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterFurther]
  }
  
  @scala.inline
  implicit class FilterFurtherOps[Self <: FilterFurther] (val x: Self) extends AnyVal {
    
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
    def setFilterFurther(value: String): Self = this.set("filterFurther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterFurther: Self = this.set("filterFurther", js.undefined)
    
    @scala.inline
    def setNoMatchesFound(value: String): Self = this.set("noMatchesFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoMatchesFound: Self = this.set("noMatchesFound", js.undefined)
    
    @scala.inline
    def setRequired(value: Hint): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
