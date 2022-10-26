package typings.next

import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibServerInsertedHtmlMod {
  
  @JSImport("next/dist/shared/lib/server-inserted-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/shared/lib/server-inserted-html", "ServerInsertedHTMLContext")
  @js.native
  val ServerInsertedHTMLContext: Context[ServerInsertedHTMLHook | Null] = js.native
  
  inline def useServerInsertedHTML(callback: js.Function0[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useServerInsertedHTML")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ServerInsertedHTMLHook = js.Function1[/* callbacks */ js.Function0[ReactNode], Unit]
}
