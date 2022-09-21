package typings.nats

import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.ServerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("nats/lib/nats-base-client/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkOptions(info: ServerInfo, options: ConnectionOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkOptions")(info.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkUnsupportedOption(prop: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUnsupportedOption")(prop.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkUnsupportedOption(prop: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUnsupportedOption")(prop.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defaultOptions(): ConnectionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[ConnectionOptions]
  
  inline def parseOptions(): ConnectionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")().asInstanceOf[ConnectionOptions]
  inline def parseOptions(opts: ConnectionOptions): ConnectionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[ConnectionOptions]
}
