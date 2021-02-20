package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRmdirOptions extends StObject {
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object IRmdirOptions {
  
  @scala.inline
  def apply(): IRmdirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRmdirOptions]
  }
  
  @scala.inline
  implicit class IRmdirOptionsMutableBuilder[Self <: IRmdirOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
