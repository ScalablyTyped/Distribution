package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestingDatasetNewDataSetMod {
  
  inline def apply(fields: js.Array[FieldObj]): typings.nginstackEngine.libDatasetDataSetMod.^ = ^.asInstanceOf[js.Dynamic].apply(fields.asInstanceOf[js.Any]).asInstanceOf[typings.nginstackEngine.libDatasetDataSetMod.^]
  
  @JSImport("@nginstack/engine/lib/testing/dataset/newDataSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldObj extends StObject {
    
    var name: String
    
    var string: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object FieldObj {
    
    inline def apply(name: String, `type`: String): FieldObj = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldObj] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setString(value: Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
