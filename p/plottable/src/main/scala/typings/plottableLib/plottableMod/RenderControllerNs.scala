package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "RenderController")
@js.native
object RenderControllerNs extends js.Object {
  def flush(): scala.Unit = js.native
  def registerToComputeLayout(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def registerToComputeLayoutAndRender(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def registerToRender(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def renderPolicy(): plottableLib.buildSrcCoreRenderPolicyMod.IRenderPolicy = js.native
  def renderPolicy(renderPolicy: plottableLib.buildSrcCoreRenderControllerMod.Policy): scala.Unit = js.native
  @js.native
  object Policy extends js.Object {
    var animationFrame: plottableLib.plottableLibStrings.animationFrame = js.native
    var immediate: plottableLib.plottableLibStrings.immediate = js.native
    var timeout: plottableLib.plottableLibStrings.timeout = js.native
  }
  
}

