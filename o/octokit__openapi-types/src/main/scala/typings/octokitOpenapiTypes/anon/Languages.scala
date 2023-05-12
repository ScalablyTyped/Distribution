package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`not-configured`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.c
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.configured
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cpp
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.csharp
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.default
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.extended
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.go
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.java_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.javascript
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.kotlin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.python
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.ruby
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.typescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Languages extends StObject {
  
  /** @description Languages to be analysed. */
  var languages: js.UndefOr[
    js.Array[c | cpp | csharp | go | java_ | javascript | kotlin | python | ruby | typescript]
  ] = js.undefined
  
  /**
    * @description CodeQL query suite to be used.
    * @enum {string}
    */
  var query_suite: js.UndefOr[default | extended] = js.undefined
  
  /**
    * @description Code scanning default setup has been configured or not.
    * @enum {string}
    */
  var state: js.UndefOr[configured | `not-configured`] = js.undefined
  
  /**
    * Format: date-time
    * @description Timestamp of latest configuration update.
    * @example 2023-12-06T14:20:20.000Z
    */
  var updated_at: js.UndefOr[String | Null] = js.undefined
}
object Languages {
  
  inline def apply(): Languages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Languages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Languages] (val x: Self) extends AnyVal {
    
    inline def setLanguages(value: js.Array[c | cpp | csharp | go | java_ | javascript | kotlin | python | ruby | typescript]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: (c | cpp | csharp | go | java_ | javascript | kotlin | python | ruby | typescript)*): Self = StObject.set(x, "languages", js.Array(value*))
    
    inline def setQuery_suite(value: default | extended): Self = StObject.set(x, "query_suite", value.asInstanceOf[js.Any])
    
    inline def setQuery_suiteUndefined: Self = StObject.set(x, "query_suite", js.undefined)
    
    inline def setState(value: configured | `not-configured`): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
  }
}
