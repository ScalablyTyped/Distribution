package typings.mobx

import typings.mobx.coreObservableMod.IDepTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/type-utils", JSImport.Namespace)
@js.native
object typeUtilsMod extends js.Object {
  
  def getAdministration(thing: js.Any): js.Any = js.native
  def getAdministration(thing: js.Any, property: String): js.Any = js.native
  
  def getAtom(thing: js.Any): IDepTreeNode = js.native
  def getAtom(thing: js.Any, property: String): IDepTreeNode = js.native
  
  def getDebugName(thing: js.Any): String = js.native
  def getDebugName(thing: js.Any, property: String): String = js.native
}
