package typings.next

import typings.next.anon.RunWebpackSpan
import typings.next.distCompiledWebpackWebpackMod.webpack.Configuration
import typings.next.distCompiledWebpackWebpackMod.webpack.Stats
import typings.next.distCompiledWebpackWebpackMod.webpack.StatsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildCompilerMod {
  
  @JSImport("next/dist/build/compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runCompiler(config: Configuration, hasRunWebpackSpan: RunWebpackSpan): js.Promise[CompilerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCompiler")(config.asInstanceOf[js.Any], hasRunWebpackSpan.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompilerResult]]
  
  trait CompilerResult extends StObject {
    
    var errors: js.Array[StatsError]
    
    var stats: js.UndefOr[Stats] = js.undefined
    
    var warnings: js.Array[StatsError]
  }
  object CompilerResult {
    
    inline def apply(errors: js.Array[StatsError], warnings: js.Array[StatsError]): CompilerResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilerResult]
    }
    
    extension [Self <: CompilerResult](x: Self) {
      
      inline def setErrors(value: js.Array[StatsError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: StatsError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWarnings(value: js.Array[StatsError]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: StatsError*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
