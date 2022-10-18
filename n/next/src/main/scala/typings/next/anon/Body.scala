package typings.next.anon

import typings.next.distServerRenderResultMod.default
import typings.next.nextStrings.html
import typings.next.nextStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: default
  
  var revalidateOptions: js.UndefOr[Any] = js.undefined
  
  var `type`: html | json
}
object Body {
  
  inline def apply(body: default, `type`: html | json): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: default): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOptions(value: Any): Self = StObject.set(x, "revalidateOptions", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOptionsUndefined: Self = StObject.set(x, "revalidateOptions", js.undefined)
    
    inline def setType(value: html | json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
