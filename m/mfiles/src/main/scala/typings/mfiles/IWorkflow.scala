package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInDocumentClass
import typings.mfiles.MFiles.MFBuiltInObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkflow extends StObject {
  
  def Clone(): IWorkflow = js.native
  
  def GetAsLookup(): ILookup = js.native
  
  def GetAsTypedValue(): ITypedValue = js.native
  
  var ID: Double = js.native
  
  var Name: String = js.native
  
  var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double = js.native
}
object IWorkflow {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IWorkflowMutableBuilder[Self <: IWorkflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IWorkflow): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAsLookup(value: () => ILookup): Self = StObject.set(x, "GetAsLookup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAsTypedValue(value: () => ITypedValue): Self = StObject.set(x, "GetAsTypedValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectClass(value: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double): Self = StObject.set(x, "ObjectClass", value.asInstanceOf[js.Any])
  }
}
