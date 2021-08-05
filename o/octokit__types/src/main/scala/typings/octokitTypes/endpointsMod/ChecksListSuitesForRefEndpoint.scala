package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.antiope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksListSuitesForRefEndpoint
  extends StObject
     with RequiredPreview[antiope] {
  
  /**
    * Filters check suites by GitHub App `id`.
    */
  var app_id: js.UndefOr[Double] = js.undefined
  
  /**
    * Filters checks suites by the name of the [check run](https://developer.github.com/v3/checks/runs/).
    */
  var check_name: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var ref: String
  
  var repo: String
}
object ChecksListSuitesForRefEndpoint {
  
  inline def apply(mediaType: `0`[antiope], owner: String, ref: String, repo: String): ChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefEndpoint]
  }
  
  extension [Self <: ChecksListSuitesForRefEndpoint](x: Self) {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setCheck_name(value: String): Self = StObject.set(x, "check_name", value.asInstanceOf[js.Any])
    
    inline def setCheck_nameUndefined: Self = StObject.set(x, "check_name", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
