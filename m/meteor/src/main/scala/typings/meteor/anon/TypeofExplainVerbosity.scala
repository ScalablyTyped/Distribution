package typings.meteor.anon

import typings.meteor.meteorStrings.allPlansExecution
import typings.meteor.meteorStrings.executionStats
import typings.meteor.meteorStrings.queryPlanner
import typings.meteor.meteorStrings.queryPlannerExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofExplainVerbosity extends StObject {
  
  val allPlansExecution: typings.meteor.meteorStrings.allPlansExecution
  
  val executionStats: typings.meteor.meteorStrings.executionStats
  
  val queryPlanner: typings.meteor.meteorStrings.queryPlanner
  
  val queryPlannerExtended: typings.meteor.meteorStrings.queryPlannerExtended
}
object TypeofExplainVerbosity {
  
  inline def apply(): TypeofExplainVerbosity = {
    val __obj = js.Dynamic.literal(allPlansExecution = "allPlansExecution", executionStats = "executionStats", queryPlanner = "queryPlanner", queryPlannerExtended = "queryPlannerExtended")
    __obj.asInstanceOf[TypeofExplainVerbosity]
  }
  
  extension [Self <: TypeofExplainVerbosity](x: Self) {
    
    inline def setAllPlansExecution(value: allPlansExecution): Self = StObject.set(x, "allPlansExecution", value.asInstanceOf[js.Any])
    
    inline def setExecutionStats(value: executionStats): Self = StObject.set(x, "executionStats", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanner(value: queryPlanner): Self = StObject.set(x, "queryPlanner", value.asInstanceOf[js.Any])
    
    inline def setQueryPlannerExtended(value: queryPlannerExtended): Self = StObject.set(x, "queryPlannerExtended", value.asInstanceOf[js.Any])
  }
}
