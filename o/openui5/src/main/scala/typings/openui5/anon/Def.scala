package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Def extends StObject {
  
  /**
    * The default variant key
    */
  var `def`: js.UndefOr[String] = js.undefined
  
  /**
    * List of deleted variant keys
    */
  var deleted: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of variant keys and the associated Execute on Selection indicator
    */
  var exe: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * List of changed variants. Each entry contains a 'key' - the variant key and a 'name' - the new title
    * of the variant
    */
  var renamed: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object Def {
  
  inline def apply(): Def = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Def]
  }
  
  extension [Self <: Def](x: Self) {
    
    inline def setDef(value: String): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    inline def setDeleted(value: js.Array[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDeletedVarargs(value: String*): Self = StObject.set(x, "deleted", js.Array(value*))
    
    inline def setExe(value: js.Array[js.Object]): Self = StObject.set(x, "exe", value.asInstanceOf[js.Any])
    
    inline def setExeUndefined: Self = StObject.set(x, "exe", js.undefined)
    
    inline def setExeVarargs(value: js.Object*): Self = StObject.set(x, "exe", js.Array(value*))
    
    inline def setRenamed(value: js.Array[js.Object]): Self = StObject.set(x, "renamed", value.asInstanceOf[js.Any])
    
    inline def setRenamedUndefined: Self = StObject.set(x, "renamed", js.undefined)
    
    inline def setRenamedVarargs(value: js.Object*): Self = StObject.set(x, "renamed", js.Array(value*))
  }
}
