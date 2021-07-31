package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
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
  
  @scala.inline
  def apply(iv: Buffer, `type`: Double): AesCBC = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCBC]
  }
  
  @scala.inline
  implicit class AesCBCMutableBuilder[Self <: AesCBC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
