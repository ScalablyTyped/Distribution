package typings.mobx.internalMod

import typings.mobx.coreObservableMod.IDepTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "getAtom")
@js.native
object getAtom extends js.Object {
  def apply(thing: js.Any): IDepTreeNode = js.native
  def apply(thing: js.Any, property: String): IDepTreeNode = js.native
}

