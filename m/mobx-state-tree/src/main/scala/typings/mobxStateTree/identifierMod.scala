package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ISimpleType
import typings.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/identifier", JSImport.Namespace)
@js.native
object identifierMod extends js.Object {
  
  val identifier: ISimpleType[String] = js.native
  
  val identifierNumber: ISimpleType[Double] = js.native
  
  def isIdentifierType(`type`: IType[Double | String, Double | String, Double | String]): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = js.native
  
  type ReferenceIdentifier = String | Double
}
