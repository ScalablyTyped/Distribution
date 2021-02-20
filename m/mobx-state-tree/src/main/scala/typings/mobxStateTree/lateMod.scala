package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IAnyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lateMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/late", "isLateType")
  @js.native
  def isLateType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/late", "late")
  @js.native
  def late[T /* <: IAnyType */](name: String, `type`: js.Function0[T]): T = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/late", "late")
  @js.native
  def late[T /* <: IAnyType */](`type`: js.Function0[T]): T = js.native
}
