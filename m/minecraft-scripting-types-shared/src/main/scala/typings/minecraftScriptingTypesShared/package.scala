package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object minecraftScriptingTypesShared {
  
  type Dimension = typings.minecraftScriptingTypesShared.MinecraftDimension | java.lang.String
  
  type EntityId = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.minecraftScriptingTypesShared.IEventData[js.Any]
    - typings.minecraftScriptingTypesShared.IEntity
    - typings.minecraftScriptingTypesShared.ILevel
    - typings.minecraftScriptingTypesShared.IComponent[js.Any]
    - typings.minecraftScriptingTypesShared.IQuery
    - typings.minecraftScriptingTypesShared.IItemStack
    - typings.minecraftScriptingTypesShared.IBlock
    - typings.minecraftScriptingTypesShared.ITickingArea
  */
  type IMinecraftObject = typings.minecraftScriptingTypesShared._IMinecraftObject | typings.minecraftScriptingTypesShared.IEventData[js.Any] | typings.minecraftScriptingTypesShared.IComponent[js.Any]
  
  type ParticleEffect = typings.minecraftScriptingTypesShared.MinecraftParticleEffect | java.lang.String
  
  type VectorArray = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
