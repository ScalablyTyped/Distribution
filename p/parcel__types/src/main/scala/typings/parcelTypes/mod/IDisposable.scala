package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisposable extends StObject {
  
  def dispose(): Any
}
object IDisposable {
  
  inline def apply(dispose: () => Any): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[IDisposable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDisposable] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => Any): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
