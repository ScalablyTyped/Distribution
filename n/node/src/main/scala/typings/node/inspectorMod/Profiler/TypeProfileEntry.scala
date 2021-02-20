package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source offset and types for a parameter or return value.
  * @experimental
  */
@js.native
trait TypeProfileEntry extends StObject {
  
  /**
    * Source offset of the parameter or end of function for return values.
    */
  var offset: Double = js.native
  
  /**
    * The types for this parameter or return value.
    */
  var types: js.Array[TypeObject] = js.native
}
object TypeProfileEntry {
  
  @scala.inline
  def apply(offset: Double, types: js.Array[TypeObject]): TypeProfileEntry = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeProfileEntry]
  }
  
  @scala.inline
  implicit class TypeProfileEntryMutableBuilder[Self <: TypeProfileEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[TypeObject]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TypeObject*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
