package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentCopyOptions extends StObject {
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object DocumentCopyOptions {
  
  @scala.inline
  def apply(): DocumentCopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCopyOptions]
  }
  
  @scala.inline
  implicit class DocumentCopyOptionsMutableBuilder[Self <: DocumentCopyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
