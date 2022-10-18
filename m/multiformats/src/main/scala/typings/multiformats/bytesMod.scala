package typings.multiformats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object bytesMod {
  
  @JSImport("multiformats/bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coerce(o: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def coerce(o: js.typedarray.ArrayBufferView): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def coerce(o: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("multiformats/bytes", "empty")
  @js.native
  val empty: js.typedarray.Uint8Array = js.native
  
  inline def equals_(aa: js.typedarray.Uint8Array, bb: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(aa.asInstanceOf[js.Any], bb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromHex(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromString(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def isBinary(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toHex(d: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toString_(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(b.asInstanceOf[js.Any]).asInstanceOf[String]
}
