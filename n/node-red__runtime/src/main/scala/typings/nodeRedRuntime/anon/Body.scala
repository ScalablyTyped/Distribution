package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: String
  
  var library: String
  
  var meta: js.Object
  
  var path: String
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var `type`: String
}
object Body {
  
  inline def apply(body: String, library: String, meta: js.Object, path: String, `type`: String): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
