package typings.multiaddr

import typings.multiaddr.multiaddrInts.`4`
import typings.multiaddr.multiaddrInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIpMod {
  
  @JSImport("multiaddr/dist/src/ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object isIP {
    
    inline def apply(string: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("multiaddr/dist/src/ip", "isIP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def v4(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def v6(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("v6")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def version(string: String): js.UndefOr[`4` | `6`] = ^.asInstanceOf[js.Dynamic].applyDynamic("version")(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`4` | `6`]]
  }
  
  inline def isV4(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV4")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isV6(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV6")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toBytes(ip: Any, buff: Any, offset: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toBytes")(ip.asInstanceOf[js.Any], buff.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toString_(buff: Any, offset: Any, length: Any): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buff.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
