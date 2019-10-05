package typings.oauth2orize.oauth2orizeMod.grant

import typings.oauth2orize.oauth2orizeMod.IssueGrantTokenFunction
import typings.oauth2orize.oauth2orizeMod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "grant.token")
@js.native
object token extends js.Object {
  def apply(issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
  def apply(options: Options, issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
}

