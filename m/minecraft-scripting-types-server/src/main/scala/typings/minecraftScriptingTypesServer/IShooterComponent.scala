package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the entity's ranged attacks. This doesn't allow the entity to use a ranged attack: it only defines what kind of projectile it shoots.
  */
trait IShooterComponent extends StObject {
  
  /**
    * ID of the Potion effect to be applied on hit
    * @default -1
    */
  var auxVal: Double
  
  /**
    * Entity identifier to use as projectile for the ranged attack. The entity must have the projectile component to be able to be shot as a projectile
    */
  var `def`: String
}
object IShooterComponent {
  
  inline def apply(auxVal: Double, `def`: String): IShooterComponent = {
    val __obj = js.Dynamic.literal(auxVal = auxVal.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShooterComponent]
  }
  
  extension [Self <: IShooterComponent](x: Self) {
    
    inline def setAuxVal(value: Double): Self = StObject.set(x, "auxVal", value.asInstanceOf[js.Any])
    
    inline def setDef(value: String): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
  }
}
