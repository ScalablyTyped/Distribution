package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleVerifyBrandSafetyCategories extends js.Object {
  
  /** Unknown or unrateable. */
  var avoidUnknownBrandSafetyCategory: js.UndefOr[Boolean] = js.native
  
  /** Brand safety high severity avoidance categories. */
  var avoidedHighSeverityCategories: js.UndefOr[js.Array[String]] = js.native
  
  /** Brand safety medium severity avoidance categories. */
  var avoidedMediumSeverityCategories: js.UndefOr[js.Array[String]] = js.native
}
object DoubleVerifyBrandSafetyCategories {
  
  @scala.inline
  def apply(): DoubleVerifyBrandSafetyCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyBrandSafetyCategories]
  }
  
  @scala.inline
  implicit class DoubleVerifyBrandSafetyCategoriesOps[Self <: DoubleVerifyBrandSafetyCategories] (val x: Self) extends AnyVal {
    
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
    def setAvoidUnknownBrandSafetyCategory(value: Boolean): Self = this.set("avoidUnknownBrandSafetyCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidUnknownBrandSafetyCategory: Self = this.set("avoidUnknownBrandSafetyCategory", js.undefined)
    
    @scala.inline
    def setAvoidedHighSeverityCategoriesVarargs(value: String*): Self = this.set("avoidedHighSeverityCategories", js.Array(value :_*))
    
    @scala.inline
    def setAvoidedHighSeverityCategories(value: js.Array[String]): Self = this.set("avoidedHighSeverityCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidedHighSeverityCategories: Self = this.set("avoidedHighSeverityCategories", js.undefined)
    
    @scala.inline
    def setAvoidedMediumSeverityCategoriesVarargs(value: String*): Self = this.set("avoidedMediumSeverityCategories", js.Array(value :_*))
    
    @scala.inline
    def setAvoidedMediumSeverityCategories(value: js.Array[String]): Self = this.set("avoidedMediumSeverityCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidedMediumSeverityCategories: Self = this.set("avoidedMediumSeverityCategories", js.undefined)
  }
}
