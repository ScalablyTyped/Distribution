package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextSnapshot extends StObject {
  
  def read(): String | Null
}
object ITextSnapshot {
  
  inline def apply(read: () => String | Null): ITextSnapshot = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[ITextSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITextSnapshot] (val x: Self) extends AnyVal {
    
    inline def setRead(value: () => String | Null): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
  }
}
