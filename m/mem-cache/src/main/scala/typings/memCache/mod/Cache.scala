package typings.memCache.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends EventEmitter {
  
  def clean(): Unit = js.native
  
  def get(key: String): js.Any = js.native
  
  var keys: js.Array[String] = js.native
  
  var length: Double = js.native
  
  def remove(key: String): Unit = js.native
  
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: String, value: js.Any, timeout: Double): Unit = js.native
}
