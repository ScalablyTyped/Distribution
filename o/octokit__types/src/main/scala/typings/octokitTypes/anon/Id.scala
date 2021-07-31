package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.`read-only`
import typings.octokitTypes.octokitTypesStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  /**
    * Unique identifier of the label.
    */
  var id: Double
  
  /**
    * Name of the label.
    */
  var name: String
  
  /**
    * The type of label. Read-only labels are applied automatically when the runner is configured.
    */
  var `type`: `read-only` | custom
}
object Id {
  
  @scala.inline
  def apply(id: Double, name: String, `type`: `read-only` | custom): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `read-only` | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
