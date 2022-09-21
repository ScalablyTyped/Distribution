package typings.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Dimension = MinecraftDimension | String

type EntityId = Double

/* Rewritten from type alias, can be one of: 
  - typings.minecraftScriptingTypesShared.IEventData[scala.Any]
  - typings.minecraftScriptingTypesShared.IEntity
  - typings.minecraftScriptingTypesShared.ILevel
  - typings.minecraftScriptingTypesShared.IComponent[scala.Any]
  - typings.minecraftScriptingTypesShared.IQuery
  - typings.minecraftScriptingTypesShared.IItemStack
  - typings.minecraftScriptingTypesShared.IBlock
  - typings.minecraftScriptingTypesShared.ITickingArea
*/
type IMinecraftObject = _IMinecraftObject | IEventData[Any] | IComponent[Any]

type ParticleEffect = MinecraftParticleEffect | String

type VectorArray = js.Tuple3[Double, Double, Double]
