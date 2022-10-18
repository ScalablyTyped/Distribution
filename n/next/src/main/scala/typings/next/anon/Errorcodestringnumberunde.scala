package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  code :string | number | undefined,   loc :{  line :number,   column :number} | undefined} */
trait Errorcodestringnumberunde extends StObject {
  
  /* standard es2022.error */
  var cause: js.UndefOr[Any] = js.undefined
  
  var code: js.UndefOr[String | Double] = js.undefined
  
  var loc: js.UndefOr[Column] = js.undefined
  
  /* standard es5 */
  var message: String
  
  /* standard es5 */
  var name: String
  
  /* standard es5 */
  var stack: js.UndefOr[String] = js.undefined
}
object Errorcodestringnumberunde {
  
  inline def apply(message: String, name: String): Errorcodestringnumberunde = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcodestringnumberunde]
  }
  
  extension [Self <: Errorcodestringnumberunde](x: Self) {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setLoc(value: Column): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
