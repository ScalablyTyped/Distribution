package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exporturl extends StObject {
  
  /**
    * @description Name of the exported branch
    * @example codespace-monalisa-octocat-hello-world-g4wpq6h95q
    */
  var branch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: date-time
    * @description Completion time of the last export operation
    * @example 2021-01-01T19:01:12Z
    */
  var completed_at: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Url for fetching export details
    * @example https://api.github.com/user/codespaces/:name/exports/latest
    */
  var export_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description Web url for the exported branch
    * @example https://github.com/octocat/hello-world/tree/:branch
    */
  var html_url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Id for the export details
    * @example latest
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * @description Git commit SHA of the exported branch
    * @example fd95a81ca01e48ede9f39c799ecbcef817b8a3b2
    */
  var sha: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description State of the latest export
    * @example succeeded | failed | in_progress
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object Exporturl {
  
  inline def apply(): Exporturl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exporturl]
  }
  
  extension [Self <: Exporturl](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchNull: Self = StObject.set(x, "branch", null)
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
    
    inline def setCompleted_atUndefined: Self = StObject.set(x, "completed_at", js.undefined)
    
    inline def setExport_url(value: String): Self = StObject.set(x, "export_url", value.asInstanceOf[js.Any])
    
    inline def setExport_urlUndefined: Self = StObject.set(x, "export_url", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaNull: Self = StObject.set(x, "sha", null)
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
