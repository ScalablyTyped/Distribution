package typings.mdastZone

import typings.mdastZone.libMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-zone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zone(node: Node, name: String, handler: typings.mdastZone.libMod.Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zone")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Handler = typings.mdastZone.libMod.Handler
  
  type Info = typings.mdastZone.libMod.Info
  
  type ZoneInfo = Info
}
