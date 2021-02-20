package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWatchOptions extends IOptions {
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object IWatchOptions {
  
  @scala.inline
  def apply(): IWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWatchOptions]
  }
  
  @scala.inline
  implicit class IWatchOptionsMutableBuilder[Self <: IWatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
