package typings.node.dnsMod

import typings.node.nodeStrings.PTR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyPtrRecord extends AnyRecord {
  
  var `type`: PTR = js.native
  
  var value: String = js.native
}
object AnyPtrRecord {
  
  @scala.inline
  def apply(`type`: PTR, value: String): AnyPtrRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPtrRecord]
  }
  
  @scala.inline
  implicit class AnyPtrRecordMutableBuilder[Self <: AnyPtrRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: PTR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
