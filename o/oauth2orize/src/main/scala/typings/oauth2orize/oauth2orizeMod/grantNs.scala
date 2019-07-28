package typings.oauth2orize.oauth2orizeMod

import typings.oauth2orize.oauth2orizeMod.grantNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "grant")
@js.native
object grantNs extends js.Object {
  trait Options extends js.Object {
    // For maximum flexibility, multiple scope spearators can optionally be
    // allowed.  This allows the server to accept clients that separate scope
    // with either space or comma (' ', ',').  This violates the specification,
    // but achieves compatibility with existing client libraries that are already
    // deployed.
    var scopeSeparator: js.UndefOr[String] = js.undefined
  }
  
  def code(issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
  def code(options: Options, issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
  def token(issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
  def token(options: Options, issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
}

