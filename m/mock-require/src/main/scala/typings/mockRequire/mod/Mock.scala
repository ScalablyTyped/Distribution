package typings.mockRequire.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mock extends js.Object {
  
  def apply(path: String, mockExport: String): Unit = js.native
  def apply(path: String, mockExport: Stub): Unit = js.native
  
  def reRequire(path: String): js.Any = js.native
  
  def stop(path: String): Unit = js.native
  
  def stopAll(): Unit = js.native
}
