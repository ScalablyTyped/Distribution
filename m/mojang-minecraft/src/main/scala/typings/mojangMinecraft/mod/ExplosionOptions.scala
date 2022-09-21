package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ExplosionOptions")
@js.native
open class ExplosionOptions () extends StObject {
  
  /**
    * Whether parts of the explosion also impact underwater.
    */
  var allowUnderwater: Boolean = js.native
  
  /**
    * Whether the explosion will break blocks within the blast
    * radius.
    */
  var breaksBlocks: Boolean = js.native
  
  /**
    * If true, the explosion is accompanied by fires within or
    * near the blast radius.
    */
  var causesFire: Boolean = js.native
  
  /**
    * Optional source of the explosion.
    */
  var source: Entity = js.native
}
