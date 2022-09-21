package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupidNumber extends StObject {
  
  /**
    * @description External Group Id
    * @example 1
    */
  var group_id: Double
}
object GroupidNumber {
  
  inline def apply(group_id: Double): GroupidNumber = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupidNumber]
  }
  
  extension [Self <: GroupidNumber](x: Self) {
    
    inline def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
  }
}
