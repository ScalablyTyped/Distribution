package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updatable extends StObject {
  
  def update(): Unit
}
object Updatable {
  
  inline def apply(update: () => Unit): Updatable = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Updatable]
  }
  
  extension [Self <: Updatable](x: Self) {
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
