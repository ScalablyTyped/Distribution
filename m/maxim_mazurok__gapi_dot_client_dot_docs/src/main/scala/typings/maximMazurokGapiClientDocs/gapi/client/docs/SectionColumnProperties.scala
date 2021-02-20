package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionColumnProperties extends StObject {
  
  /** The padding at the end of the column. */
  var paddingEnd: js.UndefOr[Dimension] = js.native
  
  /** Output only. The width of the column. */
  var width: js.UndefOr[Dimension] = js.native
}
object SectionColumnProperties {
  
  @scala.inline
  def apply(): SectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionColumnProperties]
  }
  
  @scala.inline
  implicit class SectionColumnPropertiesMutableBuilder[Self <: SectionColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingEnd(value: Dimension): Self = StObject.set(x, "paddingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingEndUndefined: Self = StObject.set(x, "paddingEnd", js.undefined)
    
    @scala.inline
    def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
