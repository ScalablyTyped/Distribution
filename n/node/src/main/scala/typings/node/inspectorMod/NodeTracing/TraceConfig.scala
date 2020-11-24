package typings.node.inspectorMod.NodeTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceConfig extends js.Object {
  
  /**
    * Included category filters.
    */
  var includedCategories: js.Array[String] = js.native
  
  /**
    * Controls how the trace buffer stores data.
    */
  var recordMode: js.UndefOr[String] = js.native
}
object TraceConfig {
  
  @scala.inline
  def apply(includedCategories: js.Array[String]): TraceConfig = {
    val __obj = js.Dynamic.literal(includedCategories = includedCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceConfig]
  }
  
  @scala.inline
  implicit class TraceConfigOps[Self <: TraceConfig] (val x: Self) extends AnyVal {
    
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
    def setIncludedCategoriesVarargs(value: String*): Self = this.set("includedCategories", js.Array(value :_*))
    
    @scala.inline
    def setIncludedCategories(value: js.Array[String]): Self = this.set("includedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordMode(value: String): Self = this.set("recordMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordMode: Self = this.set("recordMode", js.undefined)
  }
}
