package typings.openui5.anon

import typings.openui5.sapUiCoreLibraryMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionName extends StObject {
  
  /**
    * a collection name for the font, if not specified the font face will be used
    */
  var collectionName: js.UndefOr[String] = js.undefined
  
  /**
    * the file name of the font face
    */
  var fontFamily: String
  
  /**
    * the location where the font files are physically located
    */
  var fontURI: URI
  
  /**
    * load the icon font metadata only when an icon is requested with {@link #.getIconInfo} if not specified
    * a JSON file with the name oConfig.fontFamily will be loaded from the location specified in oConfig.fontURI
    */
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a configuration object mapping the icon name to the hexadecimal icon address in the font
    */
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  /**
    * an URI to a file containing the configuration object specified with oConfig.metadata
    */
  var metadataURI: js.UndefOr[js.Object] = js.undefined
}
object CollectionName {
  
  inline def apply(fontFamily: String, fontURI: URI): CollectionName = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontURI = fontURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionName] (val x: Self) extends AnyVal {
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontURI(value: URI): Self = StObject.set(x, "fontURI", value.asInstanceOf[js.Any])
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataURI(value: js.Object): Self = StObject.set(x, "metadataURI", value.asInstanceOf[js.Any])
    
    inline def setMetadataURIUndefined: Self = StObject.set(x, "metadataURI", js.undefined)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
