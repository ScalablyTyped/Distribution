package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.opt_in
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.opt_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uselfs extends StObject {
  
  /**
    * @description Whether to store large files during the import. `opt_in` means large files will be stored using Git LFS. `opt_out` means large files will be removed during the import.
    * @enum {string}
    */
  var use_lfs: opt_in | opt_out
}
object Uselfs {
  
  inline def apply(use_lfs: opt_in | opt_out): Uselfs = {
    val __obj = js.Dynamic.literal(use_lfs = use_lfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uselfs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Uselfs] (val x: Self) extends AnyVal {
    
    inline def setUse_lfs(value: opt_in | opt_out): Self = StObject.set(x, "use_lfs", value.asInstanceOf[js.Any])
  }
}
