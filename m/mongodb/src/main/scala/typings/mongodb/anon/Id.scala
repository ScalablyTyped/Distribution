package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var _id: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
}
object Id {
  
  inline def apply(_id: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Id = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def set_id(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
