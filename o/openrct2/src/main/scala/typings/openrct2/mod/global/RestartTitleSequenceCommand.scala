package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.restart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var `type`: restart
}
object RestartTitleSequenceCommand {
  
  inline def apply(): RestartTitleSequenceCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("restart")
    __obj.asInstanceOf[RestartTitleSequenceCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestartTitleSequenceCommand] (val x: Self) extends AnyVal {
    
    inline def setType(value: restart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
