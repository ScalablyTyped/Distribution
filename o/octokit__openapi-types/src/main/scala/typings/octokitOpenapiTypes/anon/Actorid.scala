package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actorid extends StObject {
  
  /** @description The ID of the actor that can bypass a ruleset */
  var actor_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The type of actor that can bypass a ruleset
    * @enum {string}
    */
  var actor_type: js.UndefOr[typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team | Integration] = js.undefined
}
object Actorid {
  
  inline def apply(): Actorid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actorid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actorid] (val x: Self) extends AnyVal {
    
    inline def setActor_id(value: Double): Self = StObject.set(x, "actor_id", value.asInstanceOf[js.Any])
    
    inline def setActor_idUndefined: Self = StObject.set(x, "actor_id", js.undefined)
    
    inline def setActor_type(value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team | Integration): Self = StObject.set(x, "actor_type", value.asInstanceOf[js.Any])
    
    inline def setActor_typeUndefined: Self = StObject.set(x, "actor_type", js.undefined)
  }
}
