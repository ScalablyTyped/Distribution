package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Add
import typings.orbitUiReactComponents.anon.Dispose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDisposablesMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useDisposables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDisposables(): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("createDisposables")().asInstanceOf[Add]
  
  inline def useDisposables(): Dispose = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisposables")().asInstanceOf[Dispose]
  
  type DisposableFunction = js.Function
}
