package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackPack extends StObject {
  
  /** The stack pack advice strings. */
  var descriptions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.StackPack with TopLevel[js.Any]
  ] = js.native
  
  /** The stack pack icon data uri. */
  var iconDataURL: js.UndefOr[String] = js.native
  
  /** The stack pack id. */
  var id: js.UndefOr[String] = js.native
  
  /** The stack pack title. */
  var title: js.UndefOr[String] = js.native
}
object StackPack {
  
  @scala.inline
  def apply(): StackPack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackPack]
  }
  
  @scala.inline
  implicit class StackPackMutableBuilder[Self <: StackPack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.StackPack with TopLevel[js.Any]
    ): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    @scala.inline
    def setIconDataURL(value: String): Self = StObject.set(x, "iconDataURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconDataURLUndefined: Self = StObject.set(x, "iconDataURL", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
