package typings.mobxReact

import typings.mobxReact.distTypesIreactcomponentMod.IReactComponent
import typings.mobxReact.distTypesIstorestopropsMod.IStoresToProps
import typings.mobxReact.distTypesIwrappedcomponentMod.IWrappedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInjectMod {
  
  @JSImport("mobx-react/dist/inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inject(stores: String*): js.Function1[
    /* target */ IReactComponent[Any], 
    IReactComponent[Any] & (/* import warning: importer.ImportType#apply Failed type conversion: mobx-react.mobx-react/dist/types/IReactComponent.IReactComponent<any> extends mobx-react.mobx-react/dist/types/IReactComponent.IReactComponent<infer P> ? mobx-react.mobx-react/dist/types/IWrappedComponent.IWrappedComponent<P> : never */ js.Any)
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(stores.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[
    /* target */ IReactComponent[Any], 
    IReactComponent[Any] & (/* import warning: importer.ImportType#apply Failed type conversion: mobx-react.mobx-react/dist/types/IReactComponent.IReactComponent<any> extends mobx-react.mobx-react/dist/types/IReactComponent.IReactComponent<infer P> ? mobx-react.mobx-react/dist/types/IWrappedComponent.IWrappedComponent<P> : never */ js.Any)
  ]]
  inline def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any] & IWrappedComponent[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any] & IWrappedComponent[P]]]
}
