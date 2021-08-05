package typings.mfiles

import typings.mfiles.MFiles.MFDependencyRelation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOwnerPropertyDef extends StObject {
  
  var DependencyRelation: MFDependencyRelation
  
  var ID: Double
  
  var IndexForAutomaticFilling: Double
  
  val IsRelationFiltering: Boolean
}
object IOwnerPropertyDef {
  
  inline def apply(
    DependencyRelation: MFDependencyRelation,
    ID: Double,
    IndexForAutomaticFilling: Double,
    IsRelationFiltering: Boolean
  ): IOwnerPropertyDef = {
    val __obj = js.Dynamic.literal(DependencyRelation = DependencyRelation.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IndexForAutomaticFilling = IndexForAutomaticFilling.asInstanceOf[js.Any], IsRelationFiltering = IsRelationFiltering.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOwnerPropertyDef]
  }
  
  extension [Self <: IOwnerPropertyDef](x: Self) {
    
    inline def setDependencyRelation(value: MFDependencyRelation): Self = StObject.set(x, "DependencyRelation", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIndexForAutomaticFilling(value: Double): Self = StObject.set(x, "IndexForAutomaticFilling", value.asInstanceOf[js.Any])
    
    inline def setIsRelationFiltering(value: Boolean): Self = StObject.set(x, "IsRelationFiltering", value.asInstanceOf[js.Any])
  }
}
