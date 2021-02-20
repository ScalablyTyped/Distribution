package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedStyles extends StObject {
  
  /** The named styles. There is an entry for each of the possible named style types. */
  var styles: js.UndefOr[js.Array[NamedStyle]] = js.native
}
object NamedStyles {
  
  @scala.inline
  def apply(): NamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStyles]
  }
  
  @scala.inline
  implicit class NamedStylesMutableBuilder[Self <: NamedStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: js.Array[NamedStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: NamedStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
