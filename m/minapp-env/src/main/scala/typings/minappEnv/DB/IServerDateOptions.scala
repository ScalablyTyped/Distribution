package typings.minappEnv.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerDateOptions extends StObject {
  
  var offset: Double = js.native
}
object IServerDateOptions {
  
  @scala.inline
  def apply(offset: Double): IServerDateOptions = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerDateOptions]
  }
  
  @scala.inline
  implicit class IServerDateOptionsMutableBuilder[Self <: IServerDateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
