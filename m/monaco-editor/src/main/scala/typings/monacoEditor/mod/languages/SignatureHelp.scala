package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelp extends StObject {
  
  /**
    * The active parameter of the active signature.
    */
  var activeParameter: Double
  
  /**
    * The active signature.
    */
  var activeSignature: Double
  
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation]
}
object SignatureHelp {
  
  inline def apply(activeParameter: Double, activeSignature: Double, signatures: js.Array[SignatureInformation]): SignatureHelp = {
    val __obj = js.Dynamic.literal(activeParameter = activeParameter.asInstanceOf[js.Any], activeSignature = activeSignature.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelp]
  }
  
  extension [Self <: SignatureHelp](x: Self) {
    
    inline def setActiveParameter(value: Double): Self = StObject.set(x, "activeParameter", value.asInstanceOf[js.Any])
    
    inline def setActiveSignature(value: Double): Self = StObject.set(x, "activeSignature", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: js.Array[SignatureInformation]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: SignatureInformation*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
