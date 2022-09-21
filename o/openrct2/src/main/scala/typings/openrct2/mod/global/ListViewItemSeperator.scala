package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.seperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewItemSeperator extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: seperator
}
object ListViewItemSeperator {
  
  inline def apply(): ListViewItemSeperator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("seperator")
    __obj.asInstanceOf[ListViewItemSeperator]
  }
  
  extension [Self <: ListViewItemSeperator](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: seperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
