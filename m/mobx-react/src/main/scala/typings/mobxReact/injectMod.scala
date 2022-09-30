package typings.mobxReact

import typings.mobxReact.ireactcomponentMod.IReactComponent
import typings.mobxReact.istorestopropsMod.IStoresToProps
import typings.mobxReact.iwrappedcomponentMod.IWrappedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectMod {
  
  @JSImport("mobx-react/dist/inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inject(stores: String*): js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any] & IWrappedComponent[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(stores.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any] & IWrappedComponent[Any]]]
  inline def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any] & IWrappedComponent[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any] & IWrappedComponent[P]]]
}
