package typings.node.cryptoMod

import typings.node.nodeStrings.jwk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JwkKeyExportOptions extends StObject {
  
  var format: jwk
}
object JwkKeyExportOptions {
  
  inline def apply(): JwkKeyExportOptions = {
    val __obj = js.Dynamic.literal(format = "jwk")
    __obj.asInstanceOf[JwkKeyExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JwkKeyExportOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: jwk): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
