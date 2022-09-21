package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayifyMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/arrayify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayify[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
