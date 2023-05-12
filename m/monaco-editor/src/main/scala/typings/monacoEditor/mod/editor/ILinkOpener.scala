package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILinkOpener extends StObject {
  
  def open(resource: Uri): Boolean | js.Promise[Boolean]
}
object ILinkOpener {
  
  inline def apply(open: Uri => Boolean | js.Promise[Boolean]): ILinkOpener = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[ILinkOpener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILinkOpener] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: Uri => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
