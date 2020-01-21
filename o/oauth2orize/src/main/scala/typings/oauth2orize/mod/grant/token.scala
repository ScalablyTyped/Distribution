package typings.oauth2orize.mod.grant

import typings.oauth2orize.mod.IssueGrantTokenFunction
import typings.oauth2orize.mod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "grant.token")
@js.native
object token extends js.Object {
  def apply(issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
  def apply(options: Options, issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
}

