package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coverage data for a JavaScript function.
  */
trait FunctionCoverage extends StObject {
  
  /**
    * JavaScript function name.
    */
  var functionName: String
  
  /**
    * Whether coverage data for this function has block granularity.
    */
  var isBlockCoverage: Boolean
  
  /**
    * Source ranges inside the function with coverage data.
    */
  var ranges: js.Array[CoverageRange]
}
object FunctionCoverage {
  
  inline def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[CoverageRange]): FunctionCoverage = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCoverage]
  }
  
  extension [Self <: FunctionCoverage](x: Self) {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setIsBlockCoverage(value: Boolean): Self = StObject.set(x, "isBlockCoverage", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: js.Array[CoverageRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: CoverageRange*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
