package typings.mochaSugarFree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestContextWithDone extends TestContextBase {
  
  /**
    * Mark a test as completed.
    */
  def done(): Unit = js.native
  def done(err: js.Any): Unit = js.native
}
