package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EffectAddEvent")
@js.native
/* protected */ open class EffectAddEvent () extends StObject {
  
  /**
    * Additional properties and details of the effect.
    */
  var effect: Effect = js.native
  
  /**
    * Additional variant number for the effect.
    */
  var effectState: Double = js.native
  
  /**
    * Entity that the effect is being added to.
    */
  var entity: Entity = js.native
}
