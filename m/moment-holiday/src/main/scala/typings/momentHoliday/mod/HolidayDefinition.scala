package typings.momentHoliday.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolidayDefinition extends js.Object {
  
  var date: String = js.native
  
  var keywords: js.UndefOr[js.Array[String]] = js.native
  
  var keywords_n: js.UndefOr[js.Array[String]] = js.native
  
  var keywords_y: js.UndefOr[js.Array[String]] = js.native
  
  var regions: js.UndefOr[js.Array[String]] = js.native
  
  var regions_n: js.UndefOr[js.Array[String]] = js.native
}
object HolidayDefinition {
  
  @scala.inline
  def apply(date: String): HolidayDefinition = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolidayDefinition]
  }
  
  @scala.inline
  implicit class HolidayDefinitionOps[Self <: HolidayDefinition] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setKeywords_nVarargs(value: String*): Self = this.set("keywords_n", js.Array(value :_*))
    
    @scala.inline
    def setKeywords_n(value: js.Array[String]): Self = this.set("keywords_n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords_n: Self = this.set("keywords_n", js.undefined)
    
    @scala.inline
    def setKeywords_yVarargs(value: String*): Self = this.set("keywords_y", js.Array(value :_*))
    
    @scala.inline
    def setKeywords_y(value: js.Array[String]): Self = this.set("keywords_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords_y: Self = this.set("keywords_y", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setRegions_nVarargs(value: String*): Self = this.set("regions_n", js.Array(value :_*))
    
    @scala.inline
    def setRegions_n(value: js.Array[String]): Self = this.set("regions_n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions_n: Self = this.set("regions_n", js.undefined)
  }
}
