package typings.openui5

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiSupportSupportRulesHistoryMod {
  
  trait AnalysisResult extends StObject {
    
    /**
      * Data for the performed analysis.
      */
    var analysisInfo: js.Object
    
    /**
      * The metadata provided in the analyze method, if any.
      */
    var analysisMetadata: js.Object
    
    /**
      * Array with information about the application.
      */
    var applicationInfo: js.Array[js.Object]
    
    /**
      * Array with all the issues, which were found.
      */
    var issues: js.Array[js.Object]
    
    /**
      * The loaded libraries.
      */
    var loadedLibraries: Record[String, js.Object]
    
    /**
      * Technical information.
      */
    var technicalInfo: js.Array[js.Object]
    
    /**
      * Count of the issues, found in the application.
      */
    var totalIssuesCount: Double
  }
  object AnalysisResult {
    
    inline def apply(
      analysisInfo: js.Object,
      analysisMetadata: js.Object,
      applicationInfo: js.Array[js.Object],
      issues: js.Array[js.Object],
      loadedLibraries: Record[String, js.Object],
      technicalInfo: js.Array[js.Object],
      totalIssuesCount: Double
    ): AnalysisResult = {
      val __obj = js.Dynamic.literal(analysisInfo = analysisInfo.asInstanceOf[js.Any], analysisMetadata = analysisMetadata.asInstanceOf[js.Any], applicationInfo = applicationInfo.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], loadedLibraries = loadedLibraries.asInstanceOf[js.Any], technicalInfo = technicalInfo.asInstanceOf[js.Any], totalIssuesCount = totalIssuesCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalysisResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalysisResult] (val x: Self) extends AnyVal {
      
      inline def setAnalysisInfo(value: js.Object): Self = StObject.set(x, "analysisInfo", value.asInstanceOf[js.Any])
      
      inline def setAnalysisMetadata(value: js.Object): Self = StObject.set(x, "analysisMetadata", value.asInstanceOf[js.Any])
      
      inline def setApplicationInfo(value: js.Array[js.Object]): Self = StObject.set(x, "applicationInfo", value.asInstanceOf[js.Any])
      
      inline def setApplicationInfoVarargs(value: js.Object*): Self = StObject.set(x, "applicationInfo", js.Array(value*))
      
      inline def setIssues(value: js.Array[js.Object]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setIssuesVarargs(value: js.Object*): Self = StObject.set(x, "issues", js.Array(value*))
      
      inline def setLoadedLibraries(value: Record[String, js.Object]): Self = StObject.set(x, "loadedLibraries", value.asInstanceOf[js.Any])
      
      inline def setTechnicalInfo(value: js.Array[js.Object]): Self = StObject.set(x, "technicalInfo", value.asInstanceOf[js.Any])
      
      inline def setTechnicalInfoVarargs(value: js.Object*): Self = StObject.set(x, "technicalInfo", js.Array(value*))
      
      inline def setTotalIssuesCount(value: Double): Self = StObject.set(x, "totalIssuesCount", value.asInstanceOf[js.Any])
    }
  }
}
