package typings.mfiles

import typings.mfiles.MFiles.MFDependencyRelation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOwnerPropertyDef extends js.Object {
  
  var DependencyRelation: MFDependencyRelation = js.native
  
  var ID: Double = js.native
  
  var IndexForAutomaticFilling: Double = js.native
  
  val IsRelationFiltering: Boolean = js.native
}
object IOwnerPropertyDef {
  
  @scala.inline
  def apply(
    DependencyRelation: MFDependencyRelation,
    ID: Double,
    IndexForAutomaticFilling: Double,
    IsRelationFiltering: Boolean
  ): IOwnerPropertyDef = {
    val __obj = js.Dynamic.literal(DependencyRelation = DependencyRelation.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IndexForAutomaticFilling = IndexForAutomaticFilling.asInstanceOf[js.Any], IsRelationFiltering = IsRelationFiltering.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOwnerPropertyDef]
  }
  
  @scala.inline
  implicit class IOwnerPropertyDefOps[Self <: IOwnerPropertyDef] (val x: Self) extends AnyVal {
    
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
    def setDependencyRelation(value: MFDependencyRelation): Self = this.set("DependencyRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexForAutomaticFilling(value: Double): Self = this.set("IndexForAutomaticFilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRelationFiltering(value: Boolean): Self = this.set("IsRelationFiltering", value.asInstanceOf[js.Any])
  }
}
