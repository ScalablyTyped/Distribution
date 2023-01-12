package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkMuteFindingsRequest extends StObject {
  
  /**
    * Expression that identifies findings that should be updated. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are
    * supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those
    * defined in the corresponding resource. The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for
    * strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /** This can be a mute configuration name or any identifier for mute/unmute of findings based on the filter. */
  var muteAnnotation: js.UndefOr[String] = js.undefined
}
object BulkMuteFindingsRequest {
  
  inline def apply(): BulkMuteFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkMuteFindingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkMuteFindingsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMuteAnnotation(value: String): Self = StObject.set(x, "muteAnnotation", value.asInstanceOf[js.Any])
    
    inline def setMuteAnnotationUndefined: Self = StObject.set(x, "muteAnnotation", js.undefined)
  }
}
