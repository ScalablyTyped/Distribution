package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "WorldInitializeEvent")
@js.native
/* protected */ open class WorldInitializeEvent () extends StObject {
  
  /**
    * Contains methods for scripts to initialize and register
    * dynamic properties they may wish to use within a world.
    * @example propertyRegistration.js
    * ```typescript
    *        import { DynamicPropertiesDefinition, MinecraftEntityTypes, world } from "mojang-minecraft";
    *
    *        world.events.worldInitialize.subscribe((e) => {
    *          let def = new DynamicPropertiesDefinition();
    *
    *          def.defineNumber("rpgStrength");
    *          def.defineString("rpgRole", 16);
    *          def.defineBoolean("rpgIsHero");
    *
    *          e.propertyRegistry.registerEntityTypeDynamicProperties(def, MinecraftEntityTypes.skeleton);
    *        });
    *
    * ```
    */
  val propertyRegistry: PropertyRegistry = js.native
}
