package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.`read-only`
import typings.octokitTypes.octokitTypesStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends js.Object {
  
  /**
    * Unique identifier of the label.
    */
  var id: Double = js.native
  
  /**
    * Name of the label.
    */
  var name: String = js.native
  
  /**
    * The type of label. Read-only labels are applied automatically when the runner is configured.
    */
  var `type`: `read-only` | custom = js.native
}
object Id {
  
  @scala.inline
  def apply(id: Double, name: String, `type`: `read-only` | custom): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `read-only` | custom): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
