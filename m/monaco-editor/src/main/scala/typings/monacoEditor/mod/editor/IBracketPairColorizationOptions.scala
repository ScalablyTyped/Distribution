package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBracketPairColorizationOptions extends StObject {
  
  /**
    * Enable or disable bracket pair colorization.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use independent color pool per bracket type.
    */
  var independentColorPoolPerBracketType: js.UndefOr[Boolean] = js.undefined
}
object IBracketPairColorizationOptions {
  
  inline def apply(): IBracketPairColorizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBracketPairColorizationOptions]
  }
  
  extension [Self <: IBracketPairColorizationOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIndependentColorPoolPerBracketType(value: Boolean): Self = StObject.set(x, "independentColorPoolPerBracketType", value.asInstanceOf[js.Any])
    
    inline def setIndependentColorPoolPerBracketTypeUndefined: Self = StObject.set(x, "independentColorPoolPerBracketType", js.undefined)
  }
}
