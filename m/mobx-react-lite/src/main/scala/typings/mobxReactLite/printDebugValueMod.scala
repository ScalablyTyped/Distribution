package typings.mobxReactLite

import typings.mobx.extrasMod.IDependencyTree
import typings.mobx.mod.Reaction_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printDebugValueMod {
  
  @JSImport("mobx-react-lite/dist/utils/printDebugValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def printDebugValue(v: Reaction_): IDependencyTree = ^.asInstanceOf[js.Dynamic].applyDynamic("printDebugValue")(v.asInstanceOf[js.Any]).asInstanceOf[IDependencyTree]
}
