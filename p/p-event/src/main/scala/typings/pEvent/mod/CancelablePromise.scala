package typings.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelablePromise[ResolveType]
  extends js.Promise[ResolveType] {
  
  def cancel(): Unit = js.native
}
