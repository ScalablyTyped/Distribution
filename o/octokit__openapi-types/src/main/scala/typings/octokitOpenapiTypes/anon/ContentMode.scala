package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`040000`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`100644`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`100755`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`120000`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`160000`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.blob
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.commit
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentMode extends StObject {
  
  /**
    * @description The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use either this, or `tree.sha`.
    *
    * **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * @description The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree), `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
    * @enum {string}
    */
  var mode: js.UndefOr[`100644` | `100755` | `040000` | `160000` | `120000`] = js.undefined
  
  /** @description The file referenced in the tree. */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * @description The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will be deleted.
    *
    * **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
    */
  var sha: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Either `blob`, `tree`, or `commit`.
    * @enum {string}
    */
  var `type`: js.UndefOr[blob | tree | commit] = js.undefined
}
object ContentMode {
  
  inline def apply(): ContentMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentMode]
  }
  
  extension [Self <: ContentMode](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMode(value: `100644` | `100755` | `040000` | `160000` | `120000`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaNull: Self = StObject.set(x, "sha", null)
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setType(value: blob | tree | commit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
