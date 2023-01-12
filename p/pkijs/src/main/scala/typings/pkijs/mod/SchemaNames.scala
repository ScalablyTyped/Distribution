package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNames extends StObject {
  
  var blockName: js.UndefOr[String] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
}
object SchemaNames {
  
  inline def apply(): SchemaNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaNames] (val x: Self) extends AnyVal {
    
    inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setBlockNameUndefined: Self = StObject.set(x, "blockName", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
