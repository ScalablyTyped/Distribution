package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMkdirOptions extends StObject {
  
  var mode: js.UndefOr[TMode] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object IMkdirOptions {
  
  @scala.inline
  def apply(): IMkdirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMkdirOptions]
  }
  
  @scala.inline
  implicit class IMkdirOptionsMutableBuilder[Self <: IMkdirOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: TMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
