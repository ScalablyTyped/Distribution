package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesEncodingMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `TextDecoder` class is a global reference for `require('util').TextDecoder`
    * https://nodejs.org/api/globals.html#textdecoder
    * @since v11.0.0
    */
  /* was `typeof TextDecoder` */
  @JSImport("next/dist/compiled/@edge-runtime/primitives/encoding", "TextDecoder")
  @js.native
  def TextDecoder: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   TextDecoder :infer TextDecoder} ? TextDecoder : new (encoding : string | undefined, options : {  fatal :boolean | undefined,   ignoreBOM :boolean | undefined} | undefined): node.util.TextDecoder */ js.Any = js.native
  inline def TextDecoder_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   TextDecoder :infer TextDecoder} ? TextDecoder : new (encoding : string | undefined, options : {  fatal :boolean | undefined,   ignoreBOM :boolean | undefined} | undefined): node.util.TextDecoder */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextDecoder")(x.asInstanceOf[js.Any])
  
  /**
    * `TextEncoder` class is a global reference for `require('util').TextEncoder`
    * https://nodejs.org/api/globals.html#textencoder
    * @since v11.0.0
    */
  /* was `typeof TextEncoder` */
  @JSImport("next/dist/compiled/@edge-runtime/primitives/encoding", "TextEncoder")
  @js.native
  def TextEncoder: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   TextEncoder :infer TextEncoder} ? TextEncoder : new (): node.util.TextEncoder */ js.Any = js.native
  inline def TextEncoder_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   TextEncoder :infer TextEncoder} ? TextEncoder : new (): node.util.TextEncoder */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextEncoder")(x.asInstanceOf[js.Any])
  
  inline def atob(encoded: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(encoded.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def btoa(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
