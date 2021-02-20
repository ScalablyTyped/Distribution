package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dir extends StObject {
  
  var dir: js.UndefOr[String] = js.native
}
object Dir {
  
  @scala.inline
  def apply(): Dir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dir]
  }
  
  @scala.inline
  implicit class DirMutableBuilder[Self <: Dir] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
  }
}
