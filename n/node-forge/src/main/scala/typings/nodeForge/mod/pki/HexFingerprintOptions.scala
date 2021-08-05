package typings.nodeForge.mod.pki

import typings.nodeForge.nodeForgeStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexFingerprintOptions
  extends StObject
     with ByteBufferFingerprintOptions {
  
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: hex
}
object HexFingerprintOptions {
  
  inline def apply(): HexFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = "hex")
    __obj.asInstanceOf[HexFingerprintOptions]
  }
  
  extension [Self <: HexFingerprintOptions](x: Self) {
    
    inline def setEncoding(value: hex): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
