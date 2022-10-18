package typings.next

import typings.next.nextStrings.nodejs
import typings.next.nextStrings.web_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibDownloadWasmSwcMod {
  
  @JSImport("next/dist/lib/download-wasm-swc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadWasmSwc(version: String, wasmDirectory: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadWasmSwc")(version.asInstanceOf[js.Any], wasmDirectory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def downloadWasmSwc(version: String, wasmDirectory: String, variant: nodejs | web_): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadWasmSwc")(version.asInstanceOf[js.Any], wasmDirectory.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
