package typings.next

import typings.next.anon.TypeofimportedTypescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTypescriptRunTypeCheckMod {
  
  @JSImport("next/dist/lib/typescript/runTypeCheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runTypeCheck(ts: TypeofimportedTypescript, baseDir: String, tsConfigPath: String): js.Promise[TypeCheckResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTypeCheck")(ts.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], tsConfigPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TypeCheckResult]]
  inline def runTypeCheck(ts: TypeofimportedTypescript, baseDir: String, tsConfigPath: String, cacheDir: String): js.Promise[TypeCheckResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTypeCheck")(ts.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], tsConfigPath.asInstanceOf[js.Any], cacheDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TypeCheckResult]]
  inline def runTypeCheck(
    ts: TypeofimportedTypescript,
    baseDir: String,
    tsConfigPath: String,
    cacheDir: String,
    isAppDirEnabled: Boolean
  ): js.Promise[TypeCheckResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTypeCheck")(ts.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], tsConfigPath.asInstanceOf[js.Any], cacheDir.asInstanceOf[js.Any], isAppDirEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TypeCheckResult]]
  inline def runTypeCheck(
    ts: TypeofimportedTypescript,
    baseDir: String,
    tsConfigPath: String,
    cacheDir: Unit,
    isAppDirEnabled: Boolean
  ): js.Promise[TypeCheckResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTypeCheck")(ts.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], tsConfigPath.asInstanceOf[js.Any], cacheDir.asInstanceOf[js.Any], isAppDirEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TypeCheckResult]]
  
  trait TypeCheckResult extends StObject {
    
    var hasWarnings: Boolean
    
    var incremental: Boolean
    
    var inputFilesCount: Double
    
    var totalFilesCount: Double
    
    var warnings: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TypeCheckResult {
    
    inline def apply(hasWarnings: Boolean, incremental: Boolean, inputFilesCount: Double, totalFilesCount: Double): TypeCheckResult = {
      val __obj = js.Dynamic.literal(hasWarnings = hasWarnings.asInstanceOf[js.Any], incremental = incremental.asInstanceOf[js.Any], inputFilesCount = inputFilesCount.asInstanceOf[js.Any], totalFilesCount = totalFilesCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeCheckResult]
    }
    
    extension [Self <: TypeCheckResult](x: Self) {
      
      inline def setHasWarnings(value: Boolean): Self = StObject.set(x, "hasWarnings", value.asInstanceOf[js.Any])
      
      inline def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
      
      inline def setInputFilesCount(value: Double): Self = StObject.set(x, "inputFilesCount", value.asInstanceOf[js.Any])
      
      inline def setTotalFilesCount(value: Double): Self = StObject.set(x, "totalFilesCount", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
