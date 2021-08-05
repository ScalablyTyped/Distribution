package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInDocumentClass
import typings.mfiles.MFiles.MFBuiltInObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkflow extends StObject {
  
  def Clone(): IWorkflow
  
  def GetAsLookup(): ILookup
  
  def GetAsTypedValue(): ITypedValue
  
  var ID: Double
  
  var Name: String
  
  var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
}
object IWorkflow {
  
  inline def apply(
    Clone: () => IWorkflow,
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: Double,
    Name: String,
    ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  ): IWorkflow = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectClass = ObjectClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflow]
  }
  
  extension [Self <: IWorkflow](x: Self) {
    
    inline def setClone(value: () => IWorkflow): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setGetAsLookup(value: () => ILookup): Self = StObject.set(x, "GetAsLookup", js.Any.fromFunction0(value))
    
    inline def setGetAsTypedValue(value: () => ITypedValue): Self = StObject.set(x, "GetAsTypedValue", js.Any.fromFunction0(value))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectClass(value: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double): Self = StObject.set(x, "ObjectClass", value.asInstanceOf[js.Any])
  }
}
