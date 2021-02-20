package typings.miniStore

import typings.miniStore.typesMod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  @JSImport("mini-store/cjs/create", "create")
  @js.native
  def create[S](initialState: S): Store[S] = js.native
  
  type Listener = js.Function0[Unit]
}
