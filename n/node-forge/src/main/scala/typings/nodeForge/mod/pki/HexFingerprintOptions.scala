package typings.nodeForge.mod.pki

import typings.nodeForge.nodeForgeStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexFingerprintOptions extends ByteBufferFingerprintOptions {
  
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: hex = js.native
}
object HexFingerprintOptions {
  
  @scala.inline
  def apply(encoding: hex): HexFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexFingerprintOptions]
  }
  
  @scala.inline
  implicit class HexFingerprintOptionsMutableBuilder[Self <: HexFingerprintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: hex): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
