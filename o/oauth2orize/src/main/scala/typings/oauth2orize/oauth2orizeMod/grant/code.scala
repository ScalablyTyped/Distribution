package typings.oauth2orize.oauth2orizeMod.grant

import typings.oauth2orize.oauth2orizeMod.IssueGrantCodeFunction
import typings.oauth2orize.oauth2orizeMod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "grant.code")
@js.native
object code extends js.Object {
  def apply(issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
  def apply(options: Options, issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
}

