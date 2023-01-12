package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.end
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var `type`: end
}
object EndTitleSequenceCommand {
  
  inline def apply(): EndTitleSequenceCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("end")
    __obj.asInstanceOf[EndTitleSequenceCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndTitleSequenceCommand] (val x: Self) extends AnyVal {
    
    inline def setType(value: end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
