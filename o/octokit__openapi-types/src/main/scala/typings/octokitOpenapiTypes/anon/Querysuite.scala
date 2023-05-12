package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`not-configured`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.configured
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.default
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.extended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Querysuite extends StObject {
  
  /**
    * @description CodeQL query suite to be used.
    * @enum {string}
    */
  var query_suite: js.UndefOr[default | extended] = js.undefined
  
  /**
    * @description Whether code scanning default setup has been configured or not.
    * @enum {string}
    */
  var state: configured | `not-configured`
}
object Querysuite {
  
  inline def apply(state: configured | `not-configured`): Querysuite = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Querysuite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Querysuite] (val x: Self) extends AnyVal {
    
    inline def setQuery_suite(value: default | extended): Self = StObject.set(x, "query_suite", value.asInstanceOf[js.Any])
    
    inline def setQuery_suiteUndefined: Self = StObject.set(x, "query_suite", js.undefined)
    
    inline def setState(value: configured | `not-configured`): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
