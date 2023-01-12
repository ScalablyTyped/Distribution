package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest extends StObject {
  
  /** A comma-separated list of package names. If specified, only alerts for these packages will be returned. */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  /** The direction to sort the results by. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.
    *
    * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `rubygems`, `rust`
    */
  var ecosystem: js.UndefOr[String] = js.undefined
  
  /** A comma-separated list of full manifest paths. If specified, only alerts for these manifests will be returned. */
  var manifest: js.UndefOr[String] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Scope of the dependency on a Dependabot alert. */
  var scope: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-scope'] */ js.Any
  ] = js.undefined
  
  /**
    * A comma-separated list of severities. If specified, only alerts with these severities will be returned.
    *
    * Can be: `low`, `medium`, `high`, `critical`
    */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * The property by which to sort the results.
    * `created` means when the alert was created.
    * `updated` means when the alert's state last changed.
    */
  var sort: js.UndefOr[created_ | updated] = js.undefined
  
  /**
    * A comma-separated list of states. If specified, only alerts with these states will be returned.
    *
    * Can be: `dismissed`, `fixed`, `open`
    */
  var state: js.UndefOr[String] = js.undefined
}
object Manifest {
  
  inline def apply(): Manifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEcosystem(value: String): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setEcosystemUndefined: Self = StObject.set(x, "ecosystem", js.undefined)
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setScope(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-scope'] */ js.Any
    ): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSort(value: created_ | updated): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
