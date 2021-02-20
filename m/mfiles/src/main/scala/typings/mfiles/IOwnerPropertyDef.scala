package typings.mfiles

import typings.mfiles.MFiles.MFDependencyRelation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOwnerPropertyDef extends StObject {
  
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
  implicit class IOwnerPropertyDefMutableBuilder[Self <: IOwnerPropertyDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencyRelation(value: MFDependencyRelation): Self = StObject.set(x, "DependencyRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexForAutomaticFilling(value: Double): Self = StObject.set(x, "IndexForAutomaticFilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRelationFiltering(value: Boolean): Self = StObject.set(x, "IsRelationFiltering", value.asInstanceOf[js.Any])
  }
}
