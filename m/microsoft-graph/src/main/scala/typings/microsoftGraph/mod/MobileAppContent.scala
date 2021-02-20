package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppContent extends Entity {
  
  // The list of files for this app content version.
  var files: js.UndefOr[NullableOption[js.Array[MobileAppContentFile]]] = js.native
}
object MobileAppContent {
  
  @scala.inline
  def apply(): MobileAppContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppContent]
  }
  
  @scala.inline
  implicit class MobileAppContentMutableBuilder[Self <: MobileAppContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: NullableOption[js.Array[MobileAppContentFile]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesNull: Self = StObject.set(x, "files", null)
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: MobileAppContentFile*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
