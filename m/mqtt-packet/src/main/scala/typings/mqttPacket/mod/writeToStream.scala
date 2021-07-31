package typings.mqttPacket.mod

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeToStream {
  
  @scala.inline
  def apply(`object`: Packet, stream: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(`object`: Packet, stream: WritableStream, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mqtt-packet", "writeToStream")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mqtt-packet", "writeToStream.cacheNumbers")
  @js.native
  def cacheNumbers: Boolean = js.native
  @scala.inline
  def cacheNumbers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheNumbers")(x.asInstanceOf[js.Any])
}
