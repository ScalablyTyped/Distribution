package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter extends StObject {
  
  var eslintOptions: Any
  
  var formatter: String | Null
  
  var lintDuringBuild: Boolean
  
  var maxWarnings: Double
  
  var outputFile: String | Null
  
  var reportErrorsOnly: Boolean
}
object Formatter {
  
  inline def apply(eslintOptions: Any, lintDuringBuild: Boolean, maxWarnings: Double, reportErrorsOnly: Boolean): Formatter = {
    val __obj = js.Dynamic.literal(eslintOptions = eslintOptions.asInstanceOf[js.Any], lintDuringBuild = lintDuringBuild.asInstanceOf[js.Any], maxWarnings = maxWarnings.asInstanceOf[js.Any], reportErrorsOnly = reportErrorsOnly.asInstanceOf[js.Any], formatter = null, outputFile = null)
    __obj.asInstanceOf[Formatter]
  }
  
  extension [Self <: Formatter](x: Self) {
    
    inline def setEslintOptions(value: Any): Self = StObject.set(x, "eslintOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatter(value: String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterNull: Self = StObject.set(x, "formatter", null)
    
    inline def setLintDuringBuild(value: Boolean): Self = StObject.set(x, "lintDuringBuild", value.asInstanceOf[js.Any])
    
    inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
    
    inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
    
    inline def setOutputFileNull: Self = StObject.set(x, "outputFile", null)
    
    inline def setReportErrorsOnly(value: Boolean): Self = StObject.set(x, "reportErrorsOnly", value.asInstanceOf[js.Any])
  }
}
