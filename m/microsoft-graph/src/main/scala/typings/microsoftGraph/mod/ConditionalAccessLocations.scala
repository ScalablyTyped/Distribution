package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessLocations extends js.Object {
  
  // Location IDs excluded from scope of policy.
  var excludeLocations: js.UndefOr[js.Array[String]] = js.native
  
  // Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted.
  var includeLocations: js.UndefOr[js.Array[String]] = js.native
}
object ConditionalAccessLocations {
  
  @scala.inline
  def apply(): ConditionalAccessLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessLocations]
  }
  
  @scala.inline
  implicit class ConditionalAccessLocationsOps[Self <: ConditionalAccessLocations] (val x: Self) extends AnyVal {
    
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
    def setExcludeLocationsVarargs(value: String*): Self = this.set("excludeLocations", js.Array(value :_*))
    
    @scala.inline
    def setExcludeLocations(value: js.Array[String]): Self = this.set("excludeLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeLocations: Self = this.set("excludeLocations", js.undefined)
    
    @scala.inline
    def setIncludeLocationsVarargs(value: String*): Self = this.set("includeLocations", js.Array(value :_*))
    
    @scala.inline
    def setIncludeLocations(value: js.Array[String]): Self = this.set("includeLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeLocations: Self = this.set("includeLocations", js.undefined)
  }
}
