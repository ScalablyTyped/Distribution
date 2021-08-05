package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updatable extends StObject {
  
  def isActive(): Boolean
  
  def update(): Unit
}
object Updatable {
  
  inline def apply(isActive: () => Boolean, update: () => Unit): Updatable = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Updatable]
  }
  
  extension [Self <: Updatable](x: Self) {
    
    inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
