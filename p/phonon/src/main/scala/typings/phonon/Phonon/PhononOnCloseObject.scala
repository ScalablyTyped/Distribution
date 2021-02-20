package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononOnCloseObject extends StObject {
  
  def close(): Unit = js.native
}
object PhononOnCloseObject {
  
  @scala.inline
  def apply(close: () => Unit): PhononOnCloseObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[PhononOnCloseObject]
  }
  
  @scala.inline
  implicit class PhononOnCloseObjectMutableBuilder[Self <: PhononOnCloseObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
