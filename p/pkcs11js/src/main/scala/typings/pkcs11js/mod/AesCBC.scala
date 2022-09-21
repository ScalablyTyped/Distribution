package typings.pkcs11js.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCBC
  extends StObject
     with IParams {
  
  var data: js.UndefOr[Buffer] = js.undefined
  
  var iv: Buffer
}
object AesCBC {
  
  inline def apply(iv: Buffer, `type`: Double): AesCBC = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCBC]
  }
  
  extension [Self <: AesCBC](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
