package typings.mobxStateTree

import typings.mobxStateTree.distCoreTypeTypeMod.ISimpleType
import typings.mobxStateTree.distCoreTypeTypeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityTypesIdentifierMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/identifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/identifier", "identifier")
  @js.native
  val identifier: ISimpleType[String] = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/identifier", "identifierNumber")
  @js.native
  val identifierNumber: ISimpleType[Double] = js.native
  
  inline def isIdentifierType(`type`: IType[Double | String, Double | String, Double | String]): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean]
  
  type ReferenceIdentifier = String | Double
}
