package typings.pgProtocol

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSGlobal("Connection")
  @js.native
  class Connection protected () extends StObject {
    def this(config: js.Any) = this()
  }
  
  @JSGlobal("END_BUFFER")
  @js.native
  val END_BUFFER: Buffer = js.native
  
  @JSGlobal("EventEmitter")
  @js.native
  def EventEmitter: js.Any = js.native
  inline def EventEmitter_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("EventEmitter")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TEXT_MODE")
  @js.native
  def TEXT_MODE: Double = js.native
  inline def TEXT_MODE_=(x: Double): Unit = js.Dynamic.global.updateDynamic("TEXT_MODE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Writer")
  @js.native
  def Writer: js.Any = js.native
  inline def Writer_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("Writer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("emptyBuffer")
  @js.native
  def emptyBuffer: Buffer = js.native
  inline def emptyBuffer_=(x: Buffer): Unit = js.Dynamic.global.updateDynamic("emptyBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("flushBuffer")
  @js.native
  val flushBuffer: Buffer = js.native
  
  @JSGlobal("net")
  @js.native
  def net: js.Any = js.native
  inline def net_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("net")(x.asInstanceOf[js.Any])
  
  @JSGlobal("parse")
  @js.native
  val parse: js.Any = js.native
  
  @JSGlobal("syncBuffer")
  @js.native
  val syncBuffer: Buffer = js.native
  
  @JSGlobal("util")
  @js.native
  def util: js.Any = js.native
  inline def util_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("util")(x.asInstanceOf[js.Any])
  
  @JSGlobal("warnDeprecation")
  @js.native
  def warnDeprecation: js.Any = js.native
  inline def warnDeprecation_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("warnDeprecation")(x.asInstanceOf[js.Any])
}
