package typings.pako.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/inflate.js
@JSImport("pako", "Inflate")
@js.native
open class Inflate_ () extends StObject {
  def this(options: InflateOptions) = this()
  
  var err: ReturnCodes = js.native
  
  var header: js.UndefOr[Header] = js.native
  
  var msg: String = js.native
  
  def onData(chunk: Data): Unit = js.native
  
  def onEnd(status: Double): Unit = js.native
  
  def push(data: Data): Boolean = js.native
  def push(data: Data, mode: Boolean): Boolean = js.native
  def push(data: Data, mode: FlushValues): Boolean = js.native
  
  var result: js.typedarray.Uint8Array | String = js.native
}
