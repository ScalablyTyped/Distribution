package typings.nodeForge.mod.pki

import typings.nodeForge.nodeForgeStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryFingerprintOptions extends ByteBufferFingerprintOptions {
  
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: binary = js.native
}
object BinaryFingerprintOptions {
  
  @scala.inline
  def apply(encoding: binary): BinaryFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryFingerprintOptions]
  }
  
  @scala.inline
  implicit class BinaryFingerprintOptionsMutableBuilder[Self <: BinaryFingerprintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
