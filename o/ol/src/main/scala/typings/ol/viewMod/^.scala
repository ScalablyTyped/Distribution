package typings.ol.viewMod

import typings.ol.centerconstraintMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/View", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createCenterConstraint(options: ViewOptions): Type = js.native
  def createResolutionConstraint(options: ViewOptions): js.Any = js.native
  def createRotationConstraint(options: ViewOptions): typings.ol.rotationconstraintMod.Type = js.native
  def isNoopAnimation(animation: Animation): Boolean = js.native
}

