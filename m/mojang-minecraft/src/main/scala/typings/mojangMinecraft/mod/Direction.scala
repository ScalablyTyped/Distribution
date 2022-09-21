package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends StObject
@JSImport("mojang-minecraft", "Direction")
@js.native
object Direction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction & String] = js.native
  
  /**
    * Represents an object located or facing in the down (z - 1)
    * direction.
    */
  @js.native
  sealed trait down
    extends StObject
       with Direction
  /* "down" */ val down: typings.mojangMinecraft.mod.Direction.down & String = js.native
  
  /**
    * Represents an object located or facing in the east (x + 1)
    * direction.
    */
  @js.native
  sealed trait east
    extends StObject
       with Direction
  /* "east" */ val east: typings.mojangMinecraft.mod.Direction.east & String = js.native
  
  /**
    * Represents an object located or facing in the north (z - 1)
    * direction.
    */
  @js.native
  sealed trait north
    extends StObject
       with Direction
  /* "north" */ val north: typings.mojangMinecraft.mod.Direction.north & String = js.native
  
  /**
    * Represents an object located or facing in the south (z + 1)
    * direction.
    */
  @js.native
  sealed trait south
    extends StObject
       with Direction
  /* "south" */ val south: typings.mojangMinecraft.mod.Direction.south & String = js.native
  
  /**
    * Represents an object located or facing in the up (z + 1)
    * direction.
    */
  @js.native
  sealed trait up
    extends StObject
       with Direction
  /* "up" */ val up: typings.mojangMinecraft.mod.Direction.up & String = js.native
  
  /**
    * Represents an object located or facing in the west (x - 1)
    * direction.
    */
  @js.native
  sealed trait west
    extends StObject
       with Direction
  /* "west" */ val west: typings.mojangMinecraft.mod.Direction.west & String = js.native
}
