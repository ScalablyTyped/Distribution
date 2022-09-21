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
  
  extension [Self <: IDisposable](x: Self) {
    
    inline def setDispose(value: () => Any): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
