package typings.mqttPacket.mod

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeToStream {
  
  inline def apply(`object`: Packet, stream: WritableStream): Boolean = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(`object`: Packet, stream: WritableStream, opts: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("mqtt-packet", "writeToStream")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mqtt-packet", "writeToStream.cacheNumbers")
  @js.native
  def cacheNumbers: Boolean = js.native
  inline def cacheNumbers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheNumbers")(x.asInstanceOf[js.Any])
}
