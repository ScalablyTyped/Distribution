package typings.pgPromise.anon

import typings.pgPromise.mod.TransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CndMode extends StObject {
  
  var cnd: js.UndefOr[js.Any] = js.undefined
  
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  
  var tag: js.UndefOr[js.Any] = js.undefined
}
object CndMode {
  
  inline def apply(): CndMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CndMode]
  }
  
  extension [Self <: CndMode](x: Self) {
    
    inline def setCnd(value: js.Any): Self = StObject.set(x, "cnd", value.asInstanceOf[js.Any])
    
    inline def setCndUndefined: Self = StObject.set(x, "cnd", js.undefined)
    
    inline def setMode(value: TransactionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
