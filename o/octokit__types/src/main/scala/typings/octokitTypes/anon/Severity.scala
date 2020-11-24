package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.error
import typings.octokitTypes.octokitTypesStrings.none
import typings.octokitTypes.octokitTypesStrings.note
import typings.octokitTypes.octokitTypesStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Severity extends js.Object {
  
  /**
    * A short description of the rule used to detect the alert.
    */
  var description: String = js.native
  
  /**
    * A unique identifier for the rule used to detect the alert.
    */
  var id: String = js.native
  
  /**
    * The severity of the alert.
    */
  var severity: none | note | warning | error = js.native
}
object Severity {
  
  @scala.inline
  def apply(description: String, id: String, severity: none | note | warning | error): Severity = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Severity]
  }
  
  @scala.inline
  implicit class SeverityOps[Self <: Severity] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: none | note | warning | error): Self = this.set("severity", value.asInstanceOf[js.Any])
  }
}
