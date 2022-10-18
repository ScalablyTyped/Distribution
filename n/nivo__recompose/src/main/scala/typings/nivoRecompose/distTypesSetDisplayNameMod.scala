package typings.nivoRecompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetDisplayNameMod {
  
  @JSImport("@nivo/recompose/dist/types/setDisplayName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setDisplayName(displayName: String): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayName")(displayName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
}
