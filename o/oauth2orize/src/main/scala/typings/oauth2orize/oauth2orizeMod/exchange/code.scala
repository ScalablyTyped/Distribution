package typings.oauth2orize.oauth2orizeMod.exchange

import typings.oauth2orize.oauth2orizeMod.IssueExchangeCodeFunction
import typings.oauth2orize.oauth2orizeMod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "exchange.code")
@js.native
object code extends js.Object {
  def apply(issue: IssueExchangeCodeFunction): MiddlewareFunction = js.native
  def apply(options: Options, issue: IssueExchangeCodeFunction): MiddlewareFunction = js.native
}

