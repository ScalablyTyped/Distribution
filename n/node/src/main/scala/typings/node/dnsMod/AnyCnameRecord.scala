package typings.node.dnsMod

import typings.node.nodeStrings.CNAME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyCnameRecord
  extends StObject
     with AnyRecord {
  
  var `type`: CNAME
  
  var value: String
}
object AnyCnameRecord {
  
  inline def apply(value: String): AnyCnameRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CNAME")
    __obj.asInstanceOf[AnyCnameRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnyCnameRecord] (val x: Self) extends AnyVal {
    
    inline def setType(value: CNAME): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
