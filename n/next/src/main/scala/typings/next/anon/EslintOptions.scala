package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EslintOptions extends StObject {
  
  var eslintOptions: js.UndefOr[Any] = js.undefined
  
  var formatter: js.UndefOr[String | Null] = js.undefined
  
  var lintDuringBuild: js.UndefOr[Boolean] = js.undefined
  
  var maxWarnings: js.UndefOr[Double] = js.undefined
  
  var outputFile: js.UndefOr[String | Null] = js.undefined
  
  var reportErrorsOnly: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object EslintOptions {
  
  inline def apply(): EslintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EslintOptions]
  }
  
  extension [Self <: EslintOptions](x: Self) {
    
    inline def setEslintOptions(value: Any): Self = StObject.set(x, "eslintOptions", value.asInstanceOf[js.Any])
    
    inline def setEslintOptionsUndefined: Self = StObject.set(x, "eslintOptions", js.undefined)
    
    inline def setFormatter(value: String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterNull: Self = StObject.set(x, "formatter", null)
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setLintDuringBuild(value: Boolean): Self = StObject.set(x, "lintDuringBuild", value.asInstanceOf[js.Any])
    
    inline def setLintDuringBuildUndefined: Self = StObject.set(x, "lintDuringBuild", js.undefined)
    
    inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
    
    inline def setMaxWarningsUndefined: Self = StObject.set(x, "maxWarnings", js.undefined)
    
    inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
    
    inline def setOutputFileNull: Self = StObject.set(x, "outputFile", null)
    
    inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
    
    inline def setReportErrorsOnly(value: Boolean): Self = StObject.set(x, "reportErrorsOnly", value.asInstanceOf[js.Any])
    
    inline def setReportErrorsOnlyUndefined: Self = StObject.set(x, "reportErrorsOnly", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
