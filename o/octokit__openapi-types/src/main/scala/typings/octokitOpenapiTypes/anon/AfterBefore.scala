package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.git
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterBefore extends StObject {
  
  /** A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor. */
  var after: js.UndefOr[String] = js.undefined
  
  /** A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. */
  var before: js.UndefOr[String] = js.undefined
  
  /**
    * The event types to include:
    *
    * - `web` - returns web (non-Git) events.
    * - `git` - returns Git events.
    * - `all` - returns both web and Git events.
    *
    * The default is `web`.
    */
  var include: js.UndefOr[web | git | all] = js.undefined
  
  /**
    * The order of audit log events. To list newest events first, specify `desc`. To list oldest events first, specify `asc`.
    *
    * The default is `desc`.
    */
  var order: js.UndefOr[desc | asc] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** A search phrase. For more information, see [Searching the audit log](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/reviewing-the-audit-log-for-your-organization#searching-the-audit-log). */
  var phrase: js.UndefOr[String] = js.undefined
}
object AfterBefore {
  
  inline def apply(): AfterBefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterBefore]
  }
  
  extension [Self <: AfterBefore](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setInclude(value: web | git | all): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setOrder(value: desc | asc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    
    inline def setPhraseUndefined: Self = StObject.set(x, "phrase", js.undefined)
  }
}
