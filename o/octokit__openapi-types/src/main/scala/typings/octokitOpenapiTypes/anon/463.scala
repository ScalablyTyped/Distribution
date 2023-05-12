package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `463` extends StObject {
  
  var id: js.UndefOr[String | (Record[String, scala.Nothing]) | Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[OneOf[js.Tuple4[Boolean, String, Double, BranchCommit]]] = js.undefined
}
object `463` {
  
  inline def apply(): `463` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`463`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `463`] (val x: Self) extends AnyVal {
    
    inline def setId(value: String | (Record[String, scala.Nothing]) | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: OneOf[js.Tuple4[Boolean, String, Double, BranchCommit]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
