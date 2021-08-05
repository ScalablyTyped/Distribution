package typings.mobxReact

import typings.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerClassMod {
  
  @JSImport("mobx-react/dist/observerClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeClassComponentObserver(componentClass: ComponentClass[js.Any, js.Any]): ComponentClass[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClassComponentObserver")(componentClass.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, js.Any]]
}
