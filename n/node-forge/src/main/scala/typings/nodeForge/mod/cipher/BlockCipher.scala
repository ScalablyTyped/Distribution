package typings.nodeForge.mod.cipher

import typings.nodeForge.mod.util.ByteBuffer
import typings.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockCipher extends js.Object {
  
  def finish(): Boolean = js.native
  
  var mode: Mode = js.native
  
  var output: ByteStringBuffer = js.native
  
  def start(): Unit = js.native
  def start(options: StartOptions): Unit = js.native
  
  def update(payload: ByteBuffer): Unit = js.native
}
