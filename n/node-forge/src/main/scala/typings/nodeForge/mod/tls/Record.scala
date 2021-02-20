package typings.nodeForge.mod.tls

import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends StObject {
  
  var fragment: ByteBuffer = js.native
  
  var length: Double = js.native
  
  var ready: js.UndefOr[Boolean] = js.native
  
  var `type`: ContentType = js.native
  
  var version: ProtocolVersion = js.native
}
object Record {
  
  @scala.inline
  def apply(fragment: ByteBuffer, length: Double, `type`: ContentType, version: ProtocolVersion): Record = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragment(value: ByteBuffer): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ProtocolVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
