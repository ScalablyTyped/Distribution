package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "CommandResult")
@js.native
/* protected */ open class CommandResult () extends StObject {
  
  /**
    * If the command operates against a number of entities,
    * blocks, or items, this returns the number of successful
    * applications of this command.
    */
  val successCount: Double = js.native
}
