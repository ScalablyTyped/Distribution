package typings.minappEnv.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerDateOptions extends StObject {
  
  var offset: Double
}
object IServerDateOptions {
  
  inline def apply(offset: Double): IServerDateOptions = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerDateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IServerDateOptions] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
