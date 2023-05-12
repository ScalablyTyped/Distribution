package typings.multiformatsMultiaddr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIpMod {
  
  @JSImport("@multiformats/multiaddr/dist/src/ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isIP(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@multiformats/multiaddr/dist/src/ip", "isV4")
  @js.native
  val isV4: js.Function1[/* input */ String, Boolean] = js.native
  
  @JSImport("@multiformats/multiaddr/dist/src/ip", "isV6")
  @js.native
  val isV6: js.Function1[/* input */ String, Boolean] = js.native
  
  inline def toBytes(ip: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toBytes")(ip.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toString_(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(buf: js.typedarray.Uint8Array, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(buf: js.typedarray.Uint8Array, offset: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(buf: js.typedarray.Uint8Array, offset: Unit, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
}
