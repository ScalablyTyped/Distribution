package typings
package oauth2orizeLib.oauth2orizeMod

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
    var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def code(issue: oauth2orizeLib.oauth2orizeMod.IssueGrantCodeFunction): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def code(options: Options, issue: oauth2orizeLib.oauth2orizeMod.IssueGrantCodeFunction): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def token(issue: oauth2orizeLib.oauth2orizeMod.IssueGrantTokenFunction): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def token(options: Options, issue: oauth2orizeLib.oauth2orizeMod.IssueGrantTokenFunction): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
}

