package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("newrelic", "startSegment")
@js.native
object startSegment extends js.Object {
  
  def apply[T /* <: js.Thenable[_] */](name: String, record: Boolean, handler: T): T = js.native
  def apply[T, C /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, record: Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T]): T = js.native
  def apply[T, C /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, record: Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T], callback: C): T = js.native
}
