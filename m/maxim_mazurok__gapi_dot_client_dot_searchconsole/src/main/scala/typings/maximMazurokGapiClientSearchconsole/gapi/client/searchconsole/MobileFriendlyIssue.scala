package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileFriendlyIssue extends StObject {
  
  /** Rule violated. */
  var rule: js.UndefOr[String] = js.native
}
object MobileFriendlyIssue {
  
  @scala.inline
  def apply(): MobileFriendlyIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileFriendlyIssue]
  }
  
  @scala.inline
  implicit class MobileFriendlyIssueMutableBuilder[Self <: MobileFriendlyIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
