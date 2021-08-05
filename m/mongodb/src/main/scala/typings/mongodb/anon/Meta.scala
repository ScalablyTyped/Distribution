package typings.mongodb.anon

import typings.mongodb.mod.MetaSortOperators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  @JSName("$meta")
  var $meta: js.UndefOr[MetaSortOperators] = js.undefined
}
object Meta {
  
  inline def apply(): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def set$meta(value: MetaSortOperators): Self = StObject.set(x, "$meta", value.asInstanceOf[js.Any])
    
    inline def set$metaUndefined: Self = StObject.set(x, "$meta", js.undefined)
  }
}
