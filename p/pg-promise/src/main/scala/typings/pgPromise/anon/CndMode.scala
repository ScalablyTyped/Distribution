package typings.pgPromise.anon

import typings.pgPromise.mod.TransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CndMode extends StObject {
  
  var cnd: js.UndefOr[js.Any] = js.native
  
  var mode: js.UndefOr[TransactionMode | Null] = js.native
  
  var tag: js.UndefOr[js.Any] = js.native
}
object CndMode {
  
  @scala.inline
  def apply(): CndMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CndMode]
  }
  
  @scala.inline
  implicit class CndModeMutableBuilder[Self <: CndMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCnd(value: js.Any): Self = StObject.set(x, "cnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCndUndefined: Self = StObject.set(x, "cnd", js.undefined)
    
    @scala.inline
    def setMode(value: TransactionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeNull: Self = StObject.set(x, "mode", null)
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
