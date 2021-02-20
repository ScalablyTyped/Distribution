package typings.nodeForge.mod.tls

import typings.nodeForge.mod.Byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherSuite extends StObject {
  
  var id: js.Tuple2[Byte, Byte] = js.native
  
  var name: String = js.native
}
object CipherSuite {
  
  @scala.inline
  def apply(id: js.Tuple2[Byte, Byte], name: String): CipherSuite = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherSuite]
  }
  
  @scala.inline
  implicit class CipherSuiteMutableBuilder[Self <: CipherSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Tuple2[Byte, Byte]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
