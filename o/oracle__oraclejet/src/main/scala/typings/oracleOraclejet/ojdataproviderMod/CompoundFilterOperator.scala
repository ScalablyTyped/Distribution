package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompoundFilterOperator[D] extends StObject {
  
  var criteria: js.Array[FilterOperator[D]]
  
  var op: CompoundOperator
}
object CompoundFilterOperator {
  
  inline def apply[D](criteria: js.Array[FilterOperator[D]], op: CompoundOperator): CompoundFilterOperator[D] = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundFilterOperator[D]]
  }
  
  extension [Self <: CompoundFilterOperator[?], D](x: Self & CompoundFilterOperator[D]) {
    
    inline def setCriteria(value: js.Array[FilterOperator[D]]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaVarargs(value: FilterOperator[D]*): Self = StObject.set(x, "criteria", js.Array(value*))
    
    inline def setOp(value: CompoundOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.oracleOraclejetStrings.$and
    - typings.oracleOraclejet.oracleOraclejetStrings.$or
  */
  trait CompoundOperator extends StObject
  object CompoundOperator {
    
    inline def $and: typings.oracleOraclejet.oracleOraclejetStrings.$and = "$and".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$and]
    
    inline def $or: typings.oracleOraclejet.oracleOraclejetStrings.$or = "$or".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$or]
  }
}
