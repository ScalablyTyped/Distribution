package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  /** A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor. */
  var after: js.UndefOr[String] = js.undefined
  
  /** A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. */
  var before: js.UndefOr[String] = js.undefined
  
  /** The direction to sort the results by. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. */
  var resolution: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of secret types to return. By default all secret types are returned.
    * See "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)"
    * for a complete list of secret types.
    */
  var secret_type: js.UndefOr[String] = js.undefined
  
  /** The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved. */
  var sort: js.UndefOr[created_ | updated] = js.undefined
  
  /** Set to `open` or `resolved` to only list secret scanning alerts in a specific state. */
  var state: js.UndefOr[open | resolved] = js.undefined
}
object Direction {
  
  inline def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSecret_type(value: String): Self = StObject.set(x, "secret_type", value.asInstanceOf[js.Any])
    
    inline def setSecret_typeUndefined: Self = StObject.set(x, "secret_type", js.undefined)
    
    inline def setSort(value: created_ | updated): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setState(value: open | resolved): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
