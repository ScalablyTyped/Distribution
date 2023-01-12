package typings.nodeForge.mod.pki

import typings.nodeForge.nodeForgeStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryFingerprintOptions
  extends StObject
     with ByteBufferFingerprintOptions {
  
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: binary
}
object BinaryFingerprintOptions {
  
  inline def apply(): BinaryFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = "binary")
    __obj.asInstanceOf[BinaryFingerprintOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryFingerprintOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
