package typings.nodeForge.mod.tls

import typings.nodeForge.mod.Byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolVersion extends StObject {
  
  var major: Byte
  
  var minor: Byte
}
object ProtocolVersion {
  
  inline def apply(major: Byte, minor: Byte): ProtocolVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtocolVersion] (val x: Self) extends AnyVal {
    
    inline def setMajor(value: Byte): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Byte): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
  }
}
