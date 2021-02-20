package typings.pgPromise.anon

import typings.pgPromise.mod.IFormattingOptions
import typings.pgPromise.mod.QueryFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var options: js.UndefOr[IFormattingOptions] = js.native
  
  var query: String | QueryFile = js.native
  
  var values: js.UndefOr[js.Any] = js.native
}
object Options {
  
  @scala.inline
  def apply(query: String | QueryFile): Options = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: IFormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setQuery(value: String | QueryFile): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
