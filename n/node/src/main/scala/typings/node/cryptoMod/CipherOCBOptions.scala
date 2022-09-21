package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherOCBOptions
  extends StObject
     with TransformOptions {
  
  var authTagLength: Double
}
object CipherOCBOptions {
  
  inline def apply(authTagLength: Double): CipherOCBOptions = {
    val __obj = js.Dynamic.literal(authTagLength = authTagLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherOCBOptions]
  }
  
  extension [Self <: CipherOCBOptions](x: Self) {
    
    inline def setAuthTagLength(value: Double): Self = StObject.set(x, "authTagLength", value.asInstanceOf[js.Any])
  }
}
