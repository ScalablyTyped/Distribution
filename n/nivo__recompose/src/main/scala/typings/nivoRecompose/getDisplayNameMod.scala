package typings.nivoRecompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDisplayNameMod {
  
  @JSImport("@nivo/recompose/dist/types/getDisplayName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDisplayName(component: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(component.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getDisplayName(component: ComponentType[Any]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(component.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
