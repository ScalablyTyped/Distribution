package typings.node.dnsMod

import typings.node.nodeStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyTxtRecord
  extends StObject
     with AnyRecord {
  
  var entries: js.Array[String]
  
  var `type`: TXT
}
object AnyTxtRecord {
  
  inline def apply(entries: js.Array[String]): AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TXT")
    __obj.asInstanceOf[AnyTxtRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnyTxtRecord] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setType(value: TXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
