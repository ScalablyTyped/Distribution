package typings.networkInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("network-interfaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromIp(ip: String, options: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIp")(ip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getInterface(options: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterface")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getInterfaces(options: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterfaces")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def toIp(interfaceName: String, options: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toIp")(interfaceName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toIps(interfaceName: String, options: js.Object): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIps")(interfaceName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
