package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suffix extends StObject {
  
  /** Only applies to Option.CUSTOM. */
  var customSuffix: js.UndefOr[String] = js.undefined
  
  /** Suffix option. */
  var option: js.UndefOr[String] = js.undefined
}
object Suffix {
  
  @scala.inline
  def apply(): Suffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suffix]
  }
  
  @scala.inline
  implicit class SuffixMutableBuilder[Self <: Suffix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSuffix(value: String): Self = StObject.set(x, "customSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSuffixUndefined: Self = StObject.set(x, "customSuffix", js.undefined)
    
    @scala.inline
    def setOption(value: String): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
  }
}
