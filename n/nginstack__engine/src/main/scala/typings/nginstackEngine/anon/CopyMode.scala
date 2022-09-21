package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyMode extends StObject {
  
  var copyMode: js.UndefOr[String] = js.undefined
  
  var mergeAction: js.UndefOr[String] = js.undefined
}
object CopyMode {
  
  inline def apply(): CopyMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyMode]
  }
  
  extension [Self <: CopyMode](x: Self) {
    
    inline def setCopyMode(value: String): Self = StObject.set(x, "copyMode", value.asInstanceOf[js.Any])
    
    inline def setCopyModeUndefined: Self = StObject.set(x, "copyMode", js.undefined)
    
    inline def setMergeAction(value: String): Self = StObject.set(x, "mergeAction", value.asInstanceOf[js.Any])
    
    inline def setMergeActionUndefined: Self = StObject.set(x, "mergeAction", js.undefined)
  }
}
