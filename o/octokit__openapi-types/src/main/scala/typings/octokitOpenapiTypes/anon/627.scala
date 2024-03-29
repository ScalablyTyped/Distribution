package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Plussign1
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`-1`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.confused
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.eyes
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.heart
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.hooray
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.laugh
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `627` extends StObject {
  
  /** @description Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a team discussion. */
  var content: js.UndefOr[Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
}
object `627` {
  
  inline def apply(): `627` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`627`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `627`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
