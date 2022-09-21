package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "NavigationResult")
@js.native
/* protected */ open class NavigationResult () extends StObject {
  
  /**
    * Whether the navigation result contains a full path,
    * including to the requested destination.
    */
  val isFullPath: Boolean = js.native
  
  /**
    * A set of block locations that comprise the navigation route.
    */
  val path: js.Array[BlockLocation] = js.native
}
