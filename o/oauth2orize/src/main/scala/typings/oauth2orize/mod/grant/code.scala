package typings.oauth2orize.mod.grant

import typings.oauth2orize.mod.IssueGrantCodeFunction
import typings.oauth2orize.mod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2orize", "grant.code")
@js.native
object code extends js.Object {
  
  def apply(issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
  def apply(options: Options, issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
}
