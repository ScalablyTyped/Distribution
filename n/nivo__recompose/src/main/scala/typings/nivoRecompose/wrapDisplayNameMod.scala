package typings.nivoRecompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapDisplayNameMod {
  
  @JSImport("@nivo/recompose/dist/types/wrapDisplayName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapDisplayName(BaseComponent: ComponentType[Any], hocName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapDisplayName")(BaseComponent.asInstanceOf[js.Any], hocName.asInstanceOf[js.Any])).asInstanceOf[String]
}
