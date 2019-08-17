package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pouchdbDashCore {
  import typings.std.Request
  import typings.std.RequestInit
  import typings.std.Response

  type Fetch = js.Function2[/* url */ String | Request, /* opts */ js.UndefOr[RequestInit], js.Promise[Response]]
}
