package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseSensitive extends StObject {
  
  @JSName("$caseSensitive")
  var $caseSensitive: js.UndefOr[Boolean] = js.native
  
  @JSName("$diacriticSensitive")
  var $diacriticSensitive: js.UndefOr[Boolean] = js.native
  
  @JSName("$language")
  var $language: js.UndefOr[String] = js.native
  
  @JSName("$search")
  var $search: String = js.native
}
object CaseSensitive {
  
  @scala.inline
  def apply($search: String): CaseSensitive = {
    val __obj = js.Dynamic.literal($search = $search.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
  
  @scala.inline
  implicit class CaseSensitiveMutableBuilder[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$caseSensitive(value: Boolean): Self = StObject.set(x, "$caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$caseSensitiveUndefined: Self = StObject.set(x, "$caseSensitive", js.undefined)
    
    @scala.inline
    def set$diacriticSensitive(value: Boolean): Self = StObject.set(x, "$diacriticSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$diacriticSensitiveUndefined: Self = StObject.set(x, "$diacriticSensitive", js.undefined)
    
    @scala.inline
    def set$language(value: String): Self = StObject.set(x, "$language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$languageUndefined: Self = StObject.set(x, "$language", js.undefined)
    
    @scala.inline
    def set$search(value: String): Self = StObject.set(x, "$search", value.asInstanceOf[js.Any])
  }
}
