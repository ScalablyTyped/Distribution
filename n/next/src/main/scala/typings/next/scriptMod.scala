package typings.next

import typings.next.distClientScriptMod.ScriptProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptMod {
  
  @JSImport("next/script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ScriptProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def handleClientScriptLoad(props: ScriptProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleClientScriptLoad")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initScriptLoader(scriptLoaderItems: js.Array[ScriptProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initScriptLoader")(scriptLoaderItems.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
