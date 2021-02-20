package typings.minappEnv.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerDate extends StObject {
  
  val options: IServerDateOptions = js.native
}
object ServerDate {
  
  @scala.inline
  def apply(options: IServerDateOptions): ServerDate = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerDate]
  }
  
  @scala.inline
  implicit class ServerDateMutableBuilder[Self <: ServerDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: IServerDateOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
