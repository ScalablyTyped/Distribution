package typings.node.anon

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatType[PubF /* <: KeyFormat */] extends StObject {
  
  var format: PubF
  
  var `type`: pkcs1 | spki
}
object FormatType {
  
  inline def apply[PubF /* <: KeyFormat */](format: PubF, `type`: pkcs1 | spki): FormatType[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatType[PubF]]
  }
  
  extension [Self <: FormatType[?], PubF /* <: KeyFormat */](x: Self & FormatType[PubF]) {
    
    inline def setFormat(value: PubF): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setType(value: pkcs1 | spki): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
