package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mockDashRequireLib {
  type Stub = js.Object | StubFunction
  type StubFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
