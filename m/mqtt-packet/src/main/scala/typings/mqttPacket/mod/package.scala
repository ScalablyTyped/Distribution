package typings.mqttPacket.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mqttPacket.mod.^
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def generate(packet: Packet): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(packet.asInstanceOf[js.Any]).asInstanceOf[Buffer]
inline def generate(packet: Packet, opts: js.Object): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(packet.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def parser(): Parser_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")().asInstanceOf[Parser_]
inline def parser(opts: js.Object): Parser_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")(opts.asInstanceOf[js.Any]).asInstanceOf[Parser_]

type UserProperties = StringDictionary[String | js.Array[String]]
