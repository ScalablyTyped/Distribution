package typings.miniStore

import typings.miniStore.typesMod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  @JSImport("mini-store/cjs/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create[S](initialState: S): Store[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any]).asInstanceOf[Store[S]]
  
  type Listener = js.Function0[Unit]
}
