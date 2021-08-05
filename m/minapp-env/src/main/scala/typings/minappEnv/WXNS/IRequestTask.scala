package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRequestTask extends StObject {
  
  def abort(): Unit
}
object IRequestTask {
  
  inline def apply(abort: () => Unit): IRequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[IRequestTask]
  }
  
  extension [Self <: IRequestTask](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
  }
}
