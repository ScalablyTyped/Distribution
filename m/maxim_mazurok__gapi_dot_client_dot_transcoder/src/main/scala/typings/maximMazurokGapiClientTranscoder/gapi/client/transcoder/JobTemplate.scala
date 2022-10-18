package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTemplate extends StObject {
  
  /** The configuration for this template. */
  var config: js.UndefOr[JobConfig] = js.undefined
  
  /** The labels associated with this job template. You can use these to organize and group your job templates. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}` */
  var name: js.UndefOr[String] = js.undefined
}
object JobTemplate {
  
  inline def apply(): JobTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTemplate]
  }
  
  extension [Self <: JobTemplate](x: Self) {
    
    inline def setConfig(value: JobConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
