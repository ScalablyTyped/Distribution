package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypeColumnMapping extends StObject {
  
  def Clone(): IObjectTypeColumnMapping
  
  var ObjectType: MFBuiltInObjectType | Double
  
  var Ordinal: Double
  
  var PartOfInsert: Boolean
  
  var PartOfUpdate: Boolean
  
  var SourceField: String
  
  var TargetPropertyDef: Double
  
  var Type: Double
}
object IObjectTypeColumnMapping {
  
  inline def apply(
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
  
  extension [Self <: IObjectTypeColumnMapping](x: Self) {
    
    inline def setClone(value: () => IObjectTypeColumnMapping): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "Ordinal", value.asInstanceOf[js.Any])
    
    inline def setPartOfInsert(value: Boolean): Self = StObject.set(x, "PartOfInsert", value.asInstanceOf[js.Any])
    
    inline def setPartOfUpdate(value: Boolean): Self = StObject.set(x, "PartOfUpdate", value.asInstanceOf[js.Any])
    
    inline def setSourceField(value: String): Self = StObject.set(x, "SourceField", value.asInstanceOf[js.Any])
    
    inline def setTargetPropertyDef(value: Double): Self = StObject.set(x, "TargetPropertyDef", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
