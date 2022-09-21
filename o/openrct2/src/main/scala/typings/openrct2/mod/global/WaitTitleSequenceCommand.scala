package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var duration: Double
  
  var `type`: wait
}
object WaitTitleSequenceCommand {
  
  inline def apply(duration: Double): WaitTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("wait")
    __obj.asInstanceOf[WaitTitleSequenceCommand]
  }
  
  extension [Self <: WaitTitleSequenceCommand](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setType(value: wait): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
