package typings.next.anon

import typings.node.querystringMod.ParsedUrlQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale[P /* <: ParsedUrlQuery */] extends StObject {
  
  var locale: js.UndefOr[String] = js.native
  
  var params: P = js.native
}
object Locale {
  
  @scala.inline
  def apply[P /* <: ParsedUrlQuery */](params: P): Locale[P] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale[P]]
  }
  
  @scala.inline
  implicit class LocaleMutableBuilder[Self <: Locale[_], P /* <: ParsedUrlQuery */] (val x: Self with Locale[P]) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
