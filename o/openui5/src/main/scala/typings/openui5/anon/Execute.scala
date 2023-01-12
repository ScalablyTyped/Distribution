package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Execute extends StObject {
  
  /**
    * The default variant indicator
    */
  var `def`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Apply Automatically indicator
    */
  var execute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Variant key
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Variant title
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if an existing variant is overwritten or if a new variant is created.
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the check box state for 'Public'.
    */
  var public: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the check box state for 'Create Tile'.
    * Note:
    * This event parameter is used only internally.
    */
  var tile: js.UndefOr[Boolean] = js.undefined
}
object Execute {
  
  inline def apply(): Execute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Execute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Execute] (val x: Self) extends AnyVal {
    
    inline def setDef(value: Boolean): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
