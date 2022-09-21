package typings.pino.mod.pino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiStreamRes extends StObject {
  
  def add(dest: DestinationStream): MultiStreamRes = js.native
  def add(dest: StreamEntry): MultiStreamRes = js.native
  
  def clone(level: Level): MultiStreamRes = js.native
  
  def flushSync(): Unit = js.native
  
  var minLevel: Double = js.native
  
  var streams: js.Array[StreamEntry] = js.native
  
  def write(data: Any): Unit = js.native
}
