package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is Enum
  */
@js.native
trait EnumProperty[EnumType] extends js.Object {
  
  var raw: EnumType = js.native
  
  var `type`: String = js.native
}
object EnumProperty {
  
  @scala.inline
  def apply[EnumType](raw: EnumType, `type`: String): EnumProperty[EnumType] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumProperty[EnumType]]
  }
  
  @scala.inline
  implicit class EnumPropertyOps[Self <: EnumProperty[_], EnumType] (val x: Self with EnumProperty[EnumType]) extends AnyVal {
    
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
    def setRaw(value: EnumType): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
