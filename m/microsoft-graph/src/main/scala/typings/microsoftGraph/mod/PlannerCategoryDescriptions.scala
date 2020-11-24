package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerCategoryDescriptions extends js.Object {
  
  // The label associated with Category 1
  var category1: js.UndefOr[NullableOption[String]] = js.native
  
  // The label associated with Category 2
  var category2: js.UndefOr[NullableOption[String]] = js.native
  
  // The label associated with Category 3
  var category3: js.UndefOr[NullableOption[String]] = js.native
  
  // The label associated with Category 4
  var category4: js.UndefOr[NullableOption[String]] = js.native
  
  // The label associated with Category 5
  var category5: js.UndefOr[NullableOption[String]] = js.native
  
  // The label associated with Category 6
  var category6: js.UndefOr[NullableOption[String]] = js.native
}
object PlannerCategoryDescriptions {
  
  @scala.inline
  def apply(): PlannerCategoryDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerCategoryDescriptions]
  }
  
  @scala.inline
  implicit class PlannerCategoryDescriptionsOps[Self <: PlannerCategoryDescriptions] (val x: Self) extends AnyVal {
    
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
    def setCategory1(value: NullableOption[String]): Self = this.set("category1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory1: Self = this.set("category1", js.undefined)
    
    @scala.inline
    def setCategory1Null: Self = this.set("category1", null)
    
    @scala.inline
    def setCategory2(value: NullableOption[String]): Self = this.set("category2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory2: Self = this.set("category2", js.undefined)
    
    @scala.inline
    def setCategory2Null: Self = this.set("category2", null)
    
    @scala.inline
    def setCategory3(value: NullableOption[String]): Self = this.set("category3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory3: Self = this.set("category3", js.undefined)
    
    @scala.inline
    def setCategory3Null: Self = this.set("category3", null)
    
    @scala.inline
    def setCategory4(value: NullableOption[String]): Self = this.set("category4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory4: Self = this.set("category4", js.undefined)
    
    @scala.inline
    def setCategory4Null: Self = this.set("category4", null)
    
    @scala.inline
    def setCategory5(value: NullableOption[String]): Self = this.set("category5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory5: Self = this.set("category5", js.undefined)
    
    @scala.inline
    def setCategory5Null: Self = this.set("category5", null)
    
    @scala.inline
    def setCategory6(value: NullableOption[String]): Self = this.set("category6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory6: Self = this.set("category6", js.undefined)
    
    @scala.inline
    def setCategory6Null: Self = this.set("category6", null)
  }
}
