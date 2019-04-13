package typings
package plottableLib.buildSrcCoreRenderControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/core/renderController", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flush(): scala.Unit = js.native
  def registerToComputeLayout(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def registerToComputeLayoutAndRender(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def registerToRender(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def renderPolicy(): plottableLib.buildSrcCoreRenderPolicyMod.IRenderPolicy = js.native
  def renderPolicy(renderPolicy: Policy): scala.Unit = js.native
}

