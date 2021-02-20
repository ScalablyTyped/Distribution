package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the current and maximum possible health of the entity. Upon applying the component back to the entity the health will change. If it reaches 0 or below the entity will die.
  */
@js.native
trait IHealthComponent extends StObject {
  
  /**
    * The maximum health the entity can heal
    * @default 10
    */
  var max: Double = js.native
  
  /**
    * Current health of the entity
    * @default 1
    */
  var value: Double = js.native
}
object IHealthComponent {
  
  @scala.inline
  def apply(max: Double, value: Double): IHealthComponent = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHealthComponent]
  }
  
  @scala.inline
  implicit class IHealthComponentMutableBuilder[Self <: IHealthComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
