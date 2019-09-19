package typings.orientjs.orientjsMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "BasePool")
@js.native
class BasePool protected () extends EventEmitter {
  def this(config: BasePoolConfig) = this()
  def this(config: BasePoolConfig, params: js.Any) = this()
  def acquire(): js.Promise[BasePool] = js.native
  def available(): Boolean = js.native
  def borrowed(): Boolean = js.native
  def close(): js.Promise[Unit] = js.native
  def createError(err: String): Error = js.native
  def createError(err: Error): Error = js.native
  def createPool(config: BasePoolConfig): BasePool = js.native
  def createPool(config: BasePoolConfig, params: js.Any): BasePool = js.native
  def hasError(): Boolean = js.native
  def pending(): Boolean = js.native
  def release(resource: js.Any): Boolean = js.native
  def size(): Double = js.native
}

