package typings.orientjs.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "BasePool")
@js.native
open class BasePool[T] protected () extends EventEmitter {
  def this(config: BasePoolConfig) = this()
  def this(config: BasePoolConfig, params: Any) = this()
  
  def acquire(): js.Promise[ODatabaseSession] = js.native
  
  def available(): Boolean = js.native
  
  def borrowed(): Boolean = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def hasError(): Boolean = js.native
  
  def pending(): Boolean = js.native
  
  def release(resource: Any): Boolean = js.native
  
  def size(): Double = js.native
}
