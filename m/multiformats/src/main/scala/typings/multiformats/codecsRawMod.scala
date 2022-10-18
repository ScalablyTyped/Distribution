package typings.multiformats

import typings.multiformats.distTypesSrcCodecsRawMod.ByteView
import typings.multiformats.multiformatsInts.`85`
import typings.multiformats.multiformatsStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object codecsRawMod {
  
  @JSImport("multiformats/codecs/raw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/codecs/raw", "code")
  @js.native
  val code: `85` = js.native
  
  inline def decode(data: ByteView[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode(node: js.typedarray.Uint8Array): ByteView[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[ByteView[js.typedarray.Uint8Array]]
  
  @JSImport("multiformats/codecs/raw", "name")
  @js.native
  val name: raw = js.native
}
