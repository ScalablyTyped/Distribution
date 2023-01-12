package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptionsBase extends StObject {
  
  /**
    * Dereference symlinks
    * @default false
    */
  var dereference: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `force` is `false`, and the destination
    * exists, throw an error.
    * @default false
    */
  var errorOnExist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overwrite existing file or directory. _The copy
    * operation will ignore errors if you set this to false and the destination
    * exists. Use the `errorOnExist` option to change this behavior.
    * @default true
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true` timestamps from `src` will
    * be preserved.
    * @default false
    */
  var preserveTimestamps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Copy directories recursively.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, path resolution for symlinks will be skipped
    * @default false
    */
  var verbatimSymlinks: js.UndefOr[Boolean] = js.undefined
}
object CopyOptionsBase {
  
  inline def apply(): CopyOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptionsBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyOptionsBase] (val x: Self) extends AnyVal {
    
    inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
    
    inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
    
    inline def setErrorOnExist(value: Boolean): Self = StObject.set(x, "errorOnExist", value.asInstanceOf[js.Any])
    
    inline def setErrorOnExistUndefined: Self = StObject.set(x, "errorOnExist", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setPreserveTimestamps(value: Boolean): Self = StObject.set(x, "preserveTimestamps", value.asInstanceOf[js.Any])
    
    inline def setPreserveTimestampsUndefined: Self = StObject.set(x, "preserveTimestamps", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setVerbatimSymlinks(value: Boolean): Self = StObject.set(x, "verbatimSymlinks", value.asInstanceOf[js.Any])
    
    inline def setVerbatimSymlinksUndefined: Self = StObject.set(x, "verbatimSymlinks", js.undefined)
  }
}
