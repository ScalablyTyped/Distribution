package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVersionComment extends StObject {
  
  val LastModifiedBy: IPropertyValue
  
  val ObjVer: IObjVer
  
  val StatusChanged: IPropertyValue
  
  val VersionComment: IPropertyValue
}
object IVersionComment {
  
  inline def apply(
    LastModifiedBy: IPropertyValue,
    ObjVer: IObjVer,
    StatusChanged: IPropertyValue,
    VersionComment: IPropertyValue
  ): IVersionComment = {
    val __obj = js.Dynamic.literal(LastModifiedBy = LastModifiedBy.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], StatusChanged = StatusChanged.asInstanceOf[js.Any], VersionComment = VersionComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVersionComment]
  }
  
  extension [Self <: IVersionComment](x: Self) {
    
    inline def setLastModifiedBy(value: IPropertyValue): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setStatusChanged(value: IPropertyValue): Self = StObject.set(x, "StatusChanged", value.asInstanceOf[js.Any])
    
    inline def setVersionComment(value: IPropertyValue): Self = StObject.set(x, "VersionComment", value.asInstanceOf[js.Any])
  }
}
