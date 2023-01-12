package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSqlFunction
  extends StObject
     with _OSqlExpression {
  
  var abs: AbsSqlFunction
  
  var avg: AbsSqlFunction
  
  var db: ODB
  
  var sequence: SequenceSqlFunction
}
object OSqlFunction {
  
  inline def apply(abs: AbsSqlFunction, avg: AbsSqlFunction, db: ODB, sequence: SequenceSqlFunction): OSqlFunction = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSqlFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSqlFunction] (val x: Self) extends AnyVal {
    
    inline def setAbs(value: AbsSqlFunction): Self = StObject.set(x, "abs", value.asInstanceOf[js.Any])
    
    inline def setAvg(value: AbsSqlFunction): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setDb(value: ODB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: SequenceSqlFunction): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
