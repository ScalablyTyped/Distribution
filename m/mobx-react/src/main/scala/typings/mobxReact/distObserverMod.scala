package typings.mobxReact

import typings.mobxReact.distTypesIreactcomponentMod.IReactComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distObserverMod {
  
  @JSImport("mobx-react/dist/observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observer[T /* <: IReactComponent[Any] */](component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(component.asInstanceOf[js.Any]).asInstanceOf[T]
}
