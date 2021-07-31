package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains the collection of {@link Word.CustomXmlPart} objects.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CustomXmlPartCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the custom XML part. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the namespace URI of the custom XML part. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var namespaceUri: js.UndefOr[Boolean] = js.undefined
}
object CustomXmlPartCollectionLoadOptions {
  
  @scala.inline
  def apply(): CustomXmlPartCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class CustomXmlPartCollectionLoadOptionsMutableBuilder[Self <: CustomXmlPartCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNamespaceUri(value: Boolean): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUriUndefined: Self = StObject.set(x, "namespaceUri", js.undefined)
  }
}
