package typings.moize.anon

import typings.moize.moizeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsReact extends StObject {
  
  var isReact: `true`
}
object IsReact {
  
  inline def apply(): IsReact = {
    val __obj = js.Dynamic.literal(isReact = true)
    __obj.asInstanceOf[IsReact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsReact] (val x: Self) extends AnyVal {
    
    inline def setIsReact(value: `true`): Self = StObject.set(x, "isReact", value.asInstanceOf[js.Any])
  }
}
