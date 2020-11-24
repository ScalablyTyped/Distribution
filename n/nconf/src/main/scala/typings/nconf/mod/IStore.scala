package typings.nconf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStore extends js.Object {
  
  def clear(key: String): Boolean = js.native
  
  def get(key: String): js.Any = js.native
  
  def merge(key: String, value: js.Any): Boolean = js.native
  
  def reset(): Boolean = js.native
  def reset(callback: ICallbackFunction): Boolean = js.native
  
  def set(key: String, value: js.Any): Boolean = js.native
  
  var `type`: String = js.native
}
