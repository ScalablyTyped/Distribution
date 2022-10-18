package typings.node.anon

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format[PubF /* <: KeyFormat */] extends StObject {
  
  var format: PubF
  
  var `type`: spki
}
object Format {
  
  inline def apply[PubF /* <: KeyFormat */](format: PubF): Format[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spki")
    __obj.asInstanceOf[Format[PubF]]
  }
  
  extension [Self <: Format[?], PubF /* <: KeyFormat */](x: Self & Format[PubF]) {
    
    inline def setFormat(value: PubF): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setType(value: spki): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
