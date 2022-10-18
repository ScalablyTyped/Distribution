package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldGroupIds extends StObject {
  
  /**
    * field group IDs of the logical field groups to validate
    */
  var fieldGroupIds: js.UndefOr[js.Array[String]] = js.undefined
}
object FieldGroupIds {
  
  inline def apply(): FieldGroupIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldGroupIds]
  }
  
  extension [Self <: FieldGroupIds](x: Self) {
    
    inline def setFieldGroupIds(value: js.Array[String]): Self = StObject.set(x, "fieldGroupIds", value.asInstanceOf[js.Any])
    
    inline def setFieldGroupIdsUndefined: Self = StObject.set(x, "fieldGroupIds", js.undefined)
    
    inline def setFieldGroupIdsVarargs(value: String*): Self = StObject.set(x, "fieldGroupIds", js.Array(value*))
  }
}
