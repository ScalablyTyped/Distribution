package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actionsrunnerregistration extends StObject {
  
  var actions_runner_registration: js.UndefOr[Remaining] = js.undefined
  
  var code_scanning_upload: js.UndefOr[Remaining] = js.undefined
  
  var core: Remaining
  
  var dependency_snapshots: js.UndefOr[Remaining] = js.undefined
  
  var graphql: js.UndefOr[Remaining] = js.undefined
  
  var integration_manifest: js.UndefOr[Remaining] = js.undefined
  
  var scim: js.UndefOr[Remaining] = js.undefined
  
  var search: Remaining
  
  var source_import: js.UndefOr[Remaining] = js.undefined
}
object Actionsrunnerregistration {
  
  inline def apply(core: Remaining, search: Remaining): Actionsrunnerregistration = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actionsrunnerregistration]
  }
  
  extension [Self <: Actionsrunnerregistration](x: Self) {
    
    inline def setActions_runner_registration(value: Remaining): Self = StObject.set(x, "actions_runner_registration", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_registrationUndefined: Self = StObject.set(x, "actions_runner_registration", js.undefined)
    
    inline def setCode_scanning_upload(value: Remaining): Self = StObject.set(x, "code_scanning_upload", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_uploadUndefined: Self = StObject.set(x, "code_scanning_upload", js.undefined)
    
    inline def setCore(value: Remaining): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    inline def setDependency_snapshots(value: Remaining): Self = StObject.set(x, "dependency_snapshots", value.asInstanceOf[js.Any])
    
    inline def setDependency_snapshotsUndefined: Self = StObject.set(x, "dependency_snapshots", js.undefined)
    
    inline def setGraphql(value: Remaining): Self = StObject.set(x, "graphql", value.asInstanceOf[js.Any])
    
    inline def setGraphqlUndefined: Self = StObject.set(x, "graphql", js.undefined)
    
    inline def setIntegration_manifest(value: Remaining): Self = StObject.set(x, "integration_manifest", value.asInstanceOf[js.Any])
    
    inline def setIntegration_manifestUndefined: Self = StObject.set(x, "integration_manifest", js.undefined)
    
    inline def setScim(value: Remaining): Self = StObject.set(x, "scim", value.asInstanceOf[js.Any])
    
    inline def setScimUndefined: Self = StObject.set(x, "scim", js.undefined)
    
    inline def setSearch(value: Remaining): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSource_import(value: Remaining): Self = StObject.set(x, "source_import", value.asInstanceOf[js.Any])
    
    inline def setSource_importUndefined: Self = StObject.set(x, "source_import", js.undefined)
  }
}
