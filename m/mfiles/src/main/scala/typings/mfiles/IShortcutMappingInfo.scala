package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShortcutMappingInfo extends StObject {
  
  var ObjectTypeGUID: String = js.native
  
  var ObjectTypeID: Double = js.native
  
  var ObjectTypeName: String = js.native
  
  var ObjectTypeSemanticAliases: ISemanticAliases = js.native
}
object IShortcutMappingInfo {
  
  @scala.inline
  def apply(
    ObjectTypeGUID: String,
    ObjectTypeID: Double,
    ObjectTypeName: String,
    ObjectTypeSemanticAliases: ISemanticAliases
  ): IShortcutMappingInfo = {
    val __obj = js.Dynamic.literal(ObjectTypeGUID = ObjectTypeGUID.asInstanceOf[js.Any], ObjectTypeID = ObjectTypeID.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any], ObjectTypeSemanticAliases = ObjectTypeSemanticAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutMappingInfo]
  }
  
  @scala.inline
  implicit class IShortcutMappingInfoMutableBuilder[Self <: IShortcutMappingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectTypeGUID(value: String): Self = StObject.set(x, "ObjectTypeGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeID(value: Double): Self = StObject.set(x, "ObjectTypeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeName(value: String): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "ObjectTypeSemanticAliases", value.asInstanceOf[js.Any])
  }
}
