package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FX Controller is the base class that all built-in FX use.
  * 
  * You should not normally create an instance of this class directly, but instead use one of the built-in FX that extend it.
  */
trait Controller extends StObject {
  
  /**
    * Toggle this boolean to enable or disable this effect,
    * without removing and adding it from the Game Object.
    * 
    * Only works for Pre FX.
    * 
    * Post FX are always active.
    */
  var active: Boolean
  
  /**
    * Destroys this FX Controller.
    */
  def destroy(): Unit
  
  /**
    * A reference to the Game Object that owns this effect.
    */
  var gameObject: GameObject
  
  /**
    * Sets the active state of this FX Controller.
    * 
    * A disabled FX Controller will not be updated.
    * @param value `true` to enable this FX Controller, or `false` to disable it.
    */
  def setActive(value: Boolean): this.type
  
  /**
    * The FX_CONST type of this effect.
    */
  var `type`: Double
}
object Controller {
  
  inline def apply(
    active: Boolean,
    destroy: () => Unit,
    gameObject: GameObject,
    setActive: Boolean => Controller,
    `type`: Double
  ): Controller = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Controller] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGameObject(value: GameObject): Self = StObject.set(x, "gameObject", value.asInstanceOf[js.Any])
    
    inline def setSetActive(value: Boolean => Controller): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
