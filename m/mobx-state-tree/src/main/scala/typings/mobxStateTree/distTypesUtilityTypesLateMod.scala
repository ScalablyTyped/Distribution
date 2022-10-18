package typings.mobxStateTree

import typings.mobxStateTree.distCoreTypeTypeMod.IAnyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityTypesLateMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/late", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLateType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLateType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def late[T /* <: IAnyType */](name: String, `type`: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("late")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def late[T /* <: IAnyType */](`type`: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("late")(`type`.asInstanceOf[js.Any]).asInstanceOf[T]
}
