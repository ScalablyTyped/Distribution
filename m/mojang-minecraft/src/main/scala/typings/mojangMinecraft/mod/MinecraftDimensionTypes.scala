package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "MinecraftDimensionTypes")
@js.native
/* protected */ open class MinecraftDimensionTypes () extends StObject
/* static members */
object MinecraftDimensionTypes {
  
  /**
    * The Nether is a collection of biomes separate from the
    * Overworld, including Soul Sand Valleys and Crimson forests.
    * Nether fortresses contain exclusive resources. Mobs such as
    * Blaze, Hoglins, Piglins, and Ghasts congregate here.
    */
  @JSImport("mojang-minecraft", "MinecraftDimensionTypes.nether")
  @js.native
  val nether: /* "minecraft:nether" */ String = js.native
  
  /**
    * The overworld is a collection of biomes, including forests,
    * plains, jungles, mountains, deserts, taiga, and more. This
    * is the default starter dimension for Minecraft. Mobs such as
    * Axolotl, Cows, Creepers, and Zombies congregate here.
    */
  @JSImport("mojang-minecraft", "MinecraftDimensionTypes.overworld")
  @js.native
  val overworld: /* "minecraft:overworld" */ String = js.native
  
  /**
    * The End is separate from the Overworld and the Nether and is
    * generated whenever you create an End portal. Here, a giant
    * center island is surrounded by several smaller areas and
    * islands. You can find Endermen here. End midlands are larger
    * areas that transition you from the center to the outer edges
    * of the End. They contain Shulkers, Endermen, End gateway
    * portals, and End cities. End gateway portals are commonly
    * found at the outermost edge of the void. You usually find
    * End barrens toward the edges of the main areas or land in
    * the End.
    */
  @JSImport("mojang-minecraft", "MinecraftDimensionTypes.theEnd")
  @js.native
  val theEnd: /* "minecraft:the_end" */ String = js.native
}
