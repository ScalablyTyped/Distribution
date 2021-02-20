package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OIndexEntry extends StObject {
  
  var key: String = js.native
  
  var value: String | ORID = js.native
}
object OIndexEntry {
  
  @scala.inline
  def apply(key: String, value: String | ORID): OIndexEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIndexEntry]
  }
  
  @scala.inline
  implicit class OIndexEntryMutableBuilder[Self <: OIndexEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | ORID): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
