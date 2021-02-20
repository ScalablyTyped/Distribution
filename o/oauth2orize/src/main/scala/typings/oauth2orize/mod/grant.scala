package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grant {
  
  @JSImport("oauth2orize", "grant.code")
  @js.native
  def code(issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
  @JSImport("oauth2orize", "grant.code")
  @js.native
  def code(options: Options, issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
  
  @JSImport("oauth2orize", "grant.token")
  @js.native
  def token(issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
  @JSImport("oauth2orize", "grant.token")
  @js.native
  def token(options: Options, issue: IssueGrantTokenFunction): MiddlewareFunction = js.native
  
  @js.native
  trait Options extends StObject {
    
    // For maximum flexibility, multiple scope spearators can optionally be
    // allowed.  This allows the server to accept clients that separate scope
    // with either space or comma (' ', ',').  This violates the specification,
    // but achieves compatibility with existing client libraries that are already
    // deployed.
    var scopeSeparator: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
    }
  }
}
