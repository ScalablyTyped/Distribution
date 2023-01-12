package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BracketPairColorizationOptions extends StObject {
  
  var enabled: Boolean
  
  var independentColorPoolPerBracketType: Boolean
}
object BracketPairColorizationOptions {
  
  inline def apply(enabled: Boolean, independentColorPoolPerBracketType: Boolean): BracketPairColorizationOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], independentColorPoolPerBracketType = independentColorPoolPerBracketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BracketPairColorizationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BracketPairColorizationOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIndependentColorPoolPerBracketType(value: Boolean): Self = StObject.set(x, "independentColorPoolPerBracketType", value.asInstanceOf[js.Any])
  }
}
