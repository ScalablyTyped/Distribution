package typings.plottable

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcCoreRenderControllerMod.Policy
import typings.plottable.buildSrcCoreRenderPolicyMod.IRenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/core/renderController", JSImport.Namespace)
@js.native
object buildSrcCoreRenderControllerMod extends js.Object {
  def flush(): Unit = js.native
  def registerToComputeLayout(component: Component): Unit = js.native
  def registerToComputeLayoutAndRender(component: Component): Unit = js.native
  def registerToRender(component: Component): Unit = js.native
  def renderPolicy(): IRenderPolicy = js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
  @js.native
  object Policy extends js.Object {
    var animationFrame: typings.plottable.plottableStrings.animationFrame = js.native
    var immediate: typings.plottable.plottableStrings.immediate = js.native
    var timeout: typings.plottable.plottableStrings.timeout = js.native
  }
  
  type Policy = String
}

