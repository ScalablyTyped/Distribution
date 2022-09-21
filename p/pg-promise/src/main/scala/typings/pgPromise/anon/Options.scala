package typings.pgPromise.anon

import typings.pgPromise.mod.IFormattingOptions
import typings.pgPromise.mod.QueryFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: js.UndefOr[IFormattingOptions] = js.undefined
  
  var query: String | QueryFile
  
  var values: js.UndefOr[Any] = js.undefined
}
object Options {
  
  inline def apply(query: String | QueryFile): Options = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: IFormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setQuery(value: String | QueryFile): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
