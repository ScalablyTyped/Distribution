package typings.pg.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolClient extends ClientBase {
  
  def release(): Unit = js.native
  def release(err: Boolean): Unit = js.native
  def release(err: Error): Unit = js.native
}
