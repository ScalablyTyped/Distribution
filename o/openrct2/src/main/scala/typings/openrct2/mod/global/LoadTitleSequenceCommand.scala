package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var index: Double
  
  var `type`: load
}
object LoadTitleSequenceCommand {
  
  inline def apply(index: Double): LoadTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("load")
    __obj.asInstanceOf[LoadTitleSequenceCommand]
  }
  
  extension [Self <: LoadTitleSequenceCommand](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: load): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
