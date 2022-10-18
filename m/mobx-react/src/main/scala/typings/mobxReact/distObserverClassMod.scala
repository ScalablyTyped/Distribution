package typings.mobxReact

import typings.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distObserverClassMod {
  
  @JSImport("mobx-react/dist/observerClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeClassComponentObserver(componentClass: ComponentClass[Any, Any]): ComponentClass[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClassComponentObserver")(componentClass.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, Any]]
}
