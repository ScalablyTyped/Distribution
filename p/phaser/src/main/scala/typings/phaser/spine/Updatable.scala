package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updatable extends StObject {
  
  def isActive(): Boolean
  
  def update(): Unit
}
object Updatable {
  
  @scala.inline
  def apply(isActive: () => Boolean, update: () => Unit): Updatable = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Updatable]
  }
  
  @scala.inline
  implicit class UpdatableMutableBuilder[Self <: Updatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
