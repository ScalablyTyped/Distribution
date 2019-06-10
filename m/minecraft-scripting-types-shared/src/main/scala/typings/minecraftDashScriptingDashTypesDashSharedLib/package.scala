package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object minecraftDashScriptingDashTypesDashSharedLib {
  type Dimension = MinecraftDimension | java.lang.String
  type EntityId = scala.Double
  /* Rewritten from type alias, can be one of: 
    - IEventData[js.Any]
    - IEntity
    - ILevel
    - IComponent[js.Any]
    - IQuery
    - IItemStack
    - IBlock
    - ITickingArea
  */
  type IMinecraftObject = _IMinecraftObject | IEventData[js.Any] | IComponent[js.Any]
  type ParticleEffect = MinecraftParticleEffect | java.lang.String
  type VectorArray = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
