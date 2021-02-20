package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectTypeColumnMapping extends StObject {
  
  def Clone(): IObjectTypeColumnMapping = js.native
  
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  var Ordinal: Double = js.native
  
  var PartOfInsert: Boolean = js.native
  
  var PartOfUpdate: Boolean = js.native
  
  var SourceField: String = js.native
  
  var TargetPropertyDef: Double = js.native
  
  var Type: Double = js.native
}
object IObjectTypeColumnMapping {
  
  @scala.inline
  def apply(
    Clone: () => IObjectTypeColumnMapping,
    ObjectType: MFBuiltInObjectType | Double,
    Ordinal: Double,
    PartOfInsert: Boolean,
    PartOfUpdate: Boolean,
    SourceField: String,
    TargetPropertyDef: Double,
    Type: Double
  ): IObjectTypeColumnMapping = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjectType = ObjectType.asInstanceOf[js.Any], Ordinal = Ordinal.asInstanceOf[js.Any], PartOfInsert = PartOfInsert.asInstanceOf[js.Any], PartOfUpdate = PartOfUpdate.asInstanceOf[js.Any], SourceField = SourceField.asInstanceOf[js.Any], TargetPropertyDef = TargetPropertyDef.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeColumnMapping]
  }
  
  @scala.inline
  implicit class IObjectTypeColumnMappingMutableBuilder[Self <: IObjectTypeColumnMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IObjectTypeColumnMapping): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinal(value: Double): Self = StObject.set(x, "Ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfInsert(value: Boolean): Self = StObject.set(x, "PartOfInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUpdate(value: Boolean): Self = StObject.set(x, "PartOfUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceField(value: String): Self = StObject.set(x, "SourceField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPropertyDef(value: Double): Self = StObject.set(x, "TargetPropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
