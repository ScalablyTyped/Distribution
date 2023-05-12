package typings.multiformatsMultiaddr

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConvertMod {
  
  @JSImport("@multiformats/multiaddr/dist/src/convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(proto: String, a: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(proto.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def convert(proto: String, a: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(proto.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convertToBytes(proto: String, str: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToBytes")(proto.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def convertToBytes(proto: Double, str: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToBytes")(proto.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def convertToIpNet(multiaddr: Multiaddr_): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToIpNet")(multiaddr.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def convertToString(proto: String, buf: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToString")(proto.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToString(proto: Double, buf: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToString")(proto.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String]
}
