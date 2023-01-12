package typings.node.dnsMod

import typings.node.nodeStrings.NS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyNsRecord
  extends StObject
     with AnyRecord {
  
  var `type`: NS
  
  var value: String
}
object AnyNsRecord {
  
  inline def apply(value: String): AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NS")
    __obj.asInstanceOf[AnyNsRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnyNsRecord] (val x: Self) extends AnyVal {
    
    inline def setType(value: NS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
