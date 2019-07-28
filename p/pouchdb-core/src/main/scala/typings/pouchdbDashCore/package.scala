package typings

import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pouchdbDashCore {
  type Fetch = js.Function2[/* url */ String | Request, /* opts */ js.UndefOr[RequestInit], js.Promise[Response]]
}
