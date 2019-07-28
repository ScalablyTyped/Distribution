package typings.next

import typings.nextDashServer.ampMod.WithAmpConfig
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/amp", JSImport.Namespace)
@js.native
object ampMod extends js.Object {
  def useAmp(): Boolean = js.native
  def withAmp(
    Component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NextComponentType */ js.Any
  ): ComponentType[js.Object] = js.native
  def withAmp(
    Component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NextComponentType */ js.Any,
    config: WithAmpConfig
  ): ComponentType[js.Object] = js.native
  def withAmp(Component: ComponentType[js.Object]): ComponentType[js.Object] = js.native
  def withAmp(Component: ComponentType[js.Object], config: WithAmpConfig): ComponentType[js.Object] = js.native
}

