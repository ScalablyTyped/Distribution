package typings.node.anon

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format[PubF /* <: KeyFormat */] extends StObject {
  
  var format: PubF = js.native
  
  var `type`: pkcs1 | spki = js.native
}
object Format {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */](format: PubF, `type`: pkcs1 | spki): Format[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format[PubF]]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format[_], PubF /* <: KeyFormat */] (val x: Self with Format[PubF]) extends AnyVal {
    
    @scala.inline
    def setFormat(value: PubF): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pkcs1 | spki): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
