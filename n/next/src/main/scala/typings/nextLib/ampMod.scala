package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/amp", JSImport.Namespace)
@js.native
object ampMod extends js.Object {
  def useAmp(): scala.Boolean = js.native
  def withAmp(
    Component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NextComponentType */ js.Any
  ): reactLib.reactMod.ComponentType[js.Object] = js.native
  def withAmp(
    Component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NextComponentType */ js.Any,
    config: nextDashServerLib.ampMod.WithAmpConfig
  ): reactLib.reactMod.ComponentType[js.Object] = js.native
  def withAmp(Component: reactLib.reactMod.ComponentType[js.Object]): reactLib.reactMod.ComponentType[js.Object] = js.native
  def withAmp(
    Component: reactLib.reactMod.ComponentType[js.Object],
    config: nextDashServerLib.ampMod.WithAmpConfig
  ): reactLib.reactMod.ComponentType[js.Object] = js.native
}

