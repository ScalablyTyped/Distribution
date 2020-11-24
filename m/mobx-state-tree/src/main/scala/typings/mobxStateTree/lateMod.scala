package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IAnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/late", JSImport.Namespace)
@js.native
object lateMod extends js.Object {
  
  def isLateType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = js.native
  
  def late[T /* <: IAnyType */](name: String, `type`: js.Function0[T]): T = js.native
  def late[T /* <: IAnyType */](`type`: js.Function0[T]): T = js.native
}
