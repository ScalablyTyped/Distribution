package typings.mongodb.anon

import typings.mongodb.mod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta
  extends StObject
     with SortDirection {
  
  @JSName("$meta")
  var $meta: String
}
object Meta {
  
  inline def apply($meta: String): Meta = {
    val __obj = js.Dynamic.literal($meta = $meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def set$meta(value: String): Self = StObject.set(x, "$meta", value.asInstanceOf[js.Any])
  }
}
