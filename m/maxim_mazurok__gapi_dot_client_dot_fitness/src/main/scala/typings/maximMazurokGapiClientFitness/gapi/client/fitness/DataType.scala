package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  /** A field represents one dimension of a data type. */
  var field: js.UndefOr[js.Array[DataTypeField]] = js.undefined
  
  /** Each data type has a unique, namespaced, name. All data types in the com.google namespace are shared as part of the platform. */
  var name: js.UndefOr[String] = js.undefined
}
object DataType {
  
  inline def apply(): DataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataType]
  }
  
  extension [Self <: DataType](x: Self) {
    
    inline def setField(value: js.Array[DataTypeField]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: DataTypeField*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
