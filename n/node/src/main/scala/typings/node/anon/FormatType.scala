package typings.node.anon

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatType[PubF /* <: KeyFormat */] extends StObject {
  
  var format: PubF
  
  var `type`: spki
}
object FormatType {
  
  inline def apply[PubF /* <: KeyFormat */](format: PubF): FormatType[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spki")
    __obj.asInstanceOf[FormatType[PubF]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatType[?], PubF /* <: KeyFormat */] (val x: Self & FormatType[PubF]) extends AnyVal {
    
    inline def setFormat(value: PubF): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setType(value: spki): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
