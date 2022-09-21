package typings.nivoRecompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setStaticMod {
  
  @JSImport("@nivo/recompose/dist/types/setStatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setStatic(key: String, value: Any): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatic")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
}
