package typings.mobxReact

import typings.mobxReact.ireactcomponentMod.IReactComponent
import typings.mobxReact.istorestopropsMod.IStoresToProps
import typings.mobxReact.iwrappedcomponentMod.IWrappedComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react/dist/inject", JSImport.Namespace)
@js.native
object injectMod extends js.Object {
  def inject(stores: String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
}

