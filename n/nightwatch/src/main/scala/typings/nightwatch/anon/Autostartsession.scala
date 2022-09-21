package typings.nightwatch.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autostartsession extends StObject {
  
  var auto_start_session: js.UndefOr[Boolean] = js.undefined
  
  var feature_path: js.UndefOr[String] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  var reporter: js.UndefOr[String] = js.undefined
  
  var reporterOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var ui: js.UndefOr[String] = js.undefined
}
object Autostartsession {
  
  inline def apply(): Autostartsession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autostartsession]
  }
  
  extension [Self <: Autostartsession](x: Self) {
    
    inline def setAuto_start_session(value: Boolean): Self = StObject.set(x, "auto_start_session", value.asInstanceOf[js.Any])
    
    inline def setAuto_start_sessionUndefined: Self = StObject.set(x, "auto_start_session", js.undefined)
    
    inline def setFeature_path(value: String): Self = StObject.set(x, "feature_path", value.asInstanceOf[js.Any])
    
    inline def setFeature_pathUndefined: Self = StObject.set(x, "feature_path", js.undefined)
    
    inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterOptions(value: StringDictionary[Any]): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
    
    inline def setReporterOptionsUndefined: Self = StObject.set(x, "reporterOptions", js.undefined)
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
