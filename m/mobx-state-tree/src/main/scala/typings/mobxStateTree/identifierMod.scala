package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ISimpleType
import typings.mobxStateTree.typeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifierMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/identifier", "identifier")
  @js.native
  val identifier: ISimpleType[String] = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/identifier", "identifierNumber")
  @js.native
  val identifierNumber: ISimpleType[Double] = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/identifier", "isIdentifierType")
  @js.native
  def isIdentifierType(`type`: IType[Double | String, Double | String, Double | String]): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = js.native
  
  type ReferenceIdentifier = String | Double
}
