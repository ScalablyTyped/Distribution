package typings.nats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipparserMod {
  
  @JSImport("nats/lib/nats-base-client/ipparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ipV4(a: Double, b: Double, c: Double, d: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ipV4")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def isIP(h: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(h.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseIP(h: String): js.UndefOr[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIP")(h.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.typedarray.Uint8Array]]
}
