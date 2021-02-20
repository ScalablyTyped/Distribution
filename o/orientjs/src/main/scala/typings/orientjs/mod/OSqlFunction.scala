package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSqlFunction extends _OSqlExpression {
  
  var abs: AbsSqlFunction = js.native
  
  var avg: AbsSqlFunction = js.native
  
  var db: ODB = js.native
  
  var sequence: SequenceSqlFunction = js.native
}
object OSqlFunction {
  
  @scala.inline
  def apply(abs: AbsSqlFunction, avg: AbsSqlFunction, db: ODB, sequence: SequenceSqlFunction): OSqlFunction = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSqlFunction]
  }
  
  @scala.inline
  implicit class OSqlFunctionMutableBuilder[Self <: OSqlFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbs(value: AbsSqlFunction): Self = StObject.set(x, "abs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvg(value: AbsSqlFunction): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: ODB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: SequenceSqlFunction): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
