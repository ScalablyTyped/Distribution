package typings.mobxReact

import typings.react.mod.Component
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposeOnUnmountMod {
  
  @JSImport("mobx-react/dist/disposeOnUnmount", "disposeOnUnmount")
  @js.native
  def disposeOnUnmount(target: Component[_, _, _], propertyKey: PropertyKey): Unit = js.native
  @JSImport("mobx-react/dist/disposeOnUnmount", "disposeOnUnmount")
  @js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: Component[_, _, _], fn: TF): TF = js.native
  
  type Disposer = js.Function0[Unit]
}
