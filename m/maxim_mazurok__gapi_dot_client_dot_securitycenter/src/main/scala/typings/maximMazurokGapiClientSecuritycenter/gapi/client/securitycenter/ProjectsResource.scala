package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var assets: AssetsResource
  
  var bigQueryExports: BigQueryExportsResource
  
  var findings: FindingsResource
  
  var muteConfigs: MuteConfigsResource
  
  var sources: SourcesResource
}
object ProjectsResource {
  
  inline def apply(
    assets: AssetsResource,
    bigQueryExports: BigQueryExportsResource,
    findings: FindingsResource,
    muteConfigs: MuteConfigsResource,
    sources: SourcesResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], bigQueryExports = bigQueryExports.asInstanceOf[js.Any], findings = findings.asInstanceOf[js.Any], muteConfigs = muteConfigs.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setAssets(value: AssetsResource): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setBigQueryExports(value: BigQueryExportsResource): Self = StObject.set(x, "bigQueryExports", value.asInstanceOf[js.Any])
    
    inline def setFindings(value: FindingsResource): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setMuteConfigs(value: MuteConfigsResource): Self = StObject.set(x, "muteConfigs", value.asInstanceOf[js.Any])
    
    inline def setSources(value: SourcesResource): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
  }
}
