package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type NightwatchPage = {[name: string] : (): nightwatch.nightwatch.EnhancedPageObject<any, any, any>, [name: string] : nightwatch.nightwatch.NightwatchPage}
}}}
to avoid circular code involving: 
- nightwatch.nightwatch.NightwatchPage
*/
trait NightwatchPage
  extends StObject
     with /* name */ StringDictionary[(js.Function0[EnhancedPageObject[Any, Any, Any]]) & NightwatchPage]
object NightwatchPage {
  
  inline def apply(): NightwatchPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchPage]
  }
}
