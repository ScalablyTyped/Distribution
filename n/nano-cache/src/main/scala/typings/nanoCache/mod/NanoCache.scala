package typings.nanoCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NanoCache extends js.Object {
  
  def clear(): Unit = js.native
  
  def clearExpired(): Unit = js.native
  
  def delete(key: js.Any): js.Any = js.native
  
  def get(key: js.Any): js.Any = js.native
  
  def info(key: js.Any): Info = js.native
  
  def isLimitReached(key: js.Any): Boolean = js.native
  
  def isTTLExpired(key: js.Any): Boolean = js.native
  
  def set(key: js.Any, value: js.Any): Unit = js.native
  def set(key: js.Any, value: js.Any, options: Options): Unit = js.native
  
  def stats(): Stats = js.native
}
