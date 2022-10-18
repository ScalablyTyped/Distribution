package typings.next.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateInContext extends StObject {
  
  def evaluateInContext(filepath: String): Unit
  
  var paths: typings.std.Map[String, String]
  
  var runtime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeRuntime */ Any
  
  var warnedEvals: Set[String]
}
object EvaluateInContext {
  
  inline def apply(
    evaluateInContext: String => Unit,
    paths: typings.std.Map[String, String],
    runtime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeRuntime */ Any,
    warnedEvals: Set[String]
  ): EvaluateInContext = {
    val __obj = js.Dynamic.literal(evaluateInContext = js.Any.fromFunction1(evaluateInContext), paths = paths.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], warnedEvals = warnedEvals.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateInContext]
  }
  
  extension [Self <: EvaluateInContext](x: Self) {
    
    inline def setEvaluateInContext(value: String => Unit): Self = StObject.set(x, "evaluateInContext", js.Any.fromFunction1(value))
    
    inline def setPaths(value: typings.std.Map[String, String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setRuntime(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeRuntime */ Any
    ): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setWarnedEvals(value: Set[String]): Self = StObject.set(x, "warnedEvals", value.asInstanceOf[js.Any])
  }
}
