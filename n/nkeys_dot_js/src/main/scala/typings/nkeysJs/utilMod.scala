package typings.nkeysJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("nkeys.js/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(b64str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(b64str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def dump(buf: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dump(buf: js.typedarray.Uint8Array, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(buf.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encode(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
}
