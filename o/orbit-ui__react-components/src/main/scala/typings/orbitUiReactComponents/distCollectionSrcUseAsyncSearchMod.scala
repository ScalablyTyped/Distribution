package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.IsLoading
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionSrcUseAsyncSearchMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/useAsyncSearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAsyncSearch[T](load: js.Function2[/* query */ String, /* signal */ AbortSignal, js.Promise[js.Array[T]]]): IsLoading[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncSearch")(load.asInstanceOf[js.Any]).asInstanceOf[IsLoading[T]]
}
