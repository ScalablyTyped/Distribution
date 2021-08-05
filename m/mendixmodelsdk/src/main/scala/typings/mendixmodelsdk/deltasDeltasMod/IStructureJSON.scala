package typings.mendixmodelsdk.deltasDeltasMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStructureJSON
  extends StObject
     with /* propertyName */ StringDictionary[
      PrimitiveValue | (js.Array[IStructureJSON | PrimitiveValue]) | IStructureJSON | Null
    ] {
  
  @JSName("$ID")
  var $ID: String
  
  @JSName("$Type")
  var $Type: String
}
object IStructureJSON {
  
  inline def apply($ID: String, $Type: String): IStructureJSON = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructureJSON]
  }
  
  extension [Self <: IStructureJSON](x: Self) {
    
    inline def set$ID(value: String): Self = StObject.set(x, "$ID", value.asInstanceOf[js.Any])
    
    inline def set$Type(value: String): Self = StObject.set(x, "$Type", value.asInstanceOf[js.Any])
  }
}
