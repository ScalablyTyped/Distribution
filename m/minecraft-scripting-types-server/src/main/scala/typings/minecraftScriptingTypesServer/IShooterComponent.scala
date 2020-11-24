package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the entity's ranged attacks. This doesn't allow the entity to use a ranged attack: it only defines what kind of projectile it shoots.
  */
@js.native
trait IShooterComponent extends js.Object {
  
  /**
    * ID of the Potion effect to be applied on hit
    * @default -1
    */
  var auxVal: Double = js.native
  
  /**
    * Entity identifier to use as projectile for the ranged attack. The entity must have the projectile component to be able to be shot as a projectile
    */
  var `def`: String = js.native
}
object IShooterComponent {
  
  @scala.inline
  def apply(auxVal: Double, `def`: String): IShooterComponent = {
    val __obj = js.Dynamic.literal(auxVal = auxVal.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShooterComponent]
  }
  
  @scala.inline
  implicit class IShooterComponentOps[Self <: IShooterComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuxVal(value: Double): Self = this.set("auxVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDef(value: String): Self = this.set("def", value.asInstanceOf[js.Any])
  }
}
