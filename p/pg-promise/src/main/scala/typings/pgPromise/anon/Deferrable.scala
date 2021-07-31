package typings.pgPromise.anon

import typings.pgPromise.mod.isolationLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deferrable extends StObject {
  
  var deferrable: js.UndefOr[Boolean] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var tiLevel: js.UndefOr[isolationLevel] = js.undefined
}
object Deferrable {
  
  @scala.inline
  def apply(): Deferrable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deferrable]
  }
  
  @scala.inline
  implicit class DeferrableMutableBuilder[Self <: Deferrable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setTiLevel(value: isolationLevel): Self = StObject.set(x, "tiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiLevelUndefined: Self = StObject.set(x, "tiLevel", js.undefined)
  }
}
