package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  /** The ID of the list. */
  var listId: js.UndefOr[String] = js.native
  
  /**
    * A map of nesting levels to the properties of bullets at the associated level. A list has at most nine levels of nesting, so the possible values for the keys of this map are 0
    * through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.slides.gapi.client.slides.NestingLevel}
    */ typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.List with TopLevel[js.Any]
  ] = js.native
}
object List {
  
  @scala.inline
  def apply(): List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setNestingLevel(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.slides.gapi.client.slides.NestingLevel}
      */ typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.List with TopLevel[js.Any]
    ): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
  }
}
