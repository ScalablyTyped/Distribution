package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object minecraftDashScriptingDashTypesDashShared {
  type Dimension = MinecraftDimension | String
  type EntityId = Double
  /* Rewritten from type alias, can be one of: 
    - typings.minecraftDashScriptingDashTypesDashShared.IEventData[js.Any]
    - typings.minecraftDashScriptingDashTypesDashShared.IEntity
    - typings.minecraftDashScriptingDashTypesDashShared.ILevel
    - typings.minecraftDashScriptingDashTypesDashShared.IComponent[js.Any]
    - typings.minecraftDashScriptingDashTypesDashShared.IQuery
    - typings.minecraftDashScriptingDashTypesDashShared.IItemStack
    - typings.minecraftDashScriptingDashTypesDashShared.IBlock
    - typings.minecraftDashScriptingDashTypesDashShared.ITickingArea
  */
  type IMinecraftObject = _IMinecraftObject | IEventData[js.Any] | IComponent[js.Any]
  type ParticleEffect = MinecraftParticleEffect | String
  type VectorArray = js.Tuple3[Double, Double, Double]
}
