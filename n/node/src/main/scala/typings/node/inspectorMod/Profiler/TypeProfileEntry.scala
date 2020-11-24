package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source offset and types for a parameter or return value.
  * @experimental
  */
@js.native
trait TypeProfileEntry extends js.Object {
  
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
  implicit class TypeProfileEntryOps[Self <: TypeProfileEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TypeObject*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[TypeObject]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
