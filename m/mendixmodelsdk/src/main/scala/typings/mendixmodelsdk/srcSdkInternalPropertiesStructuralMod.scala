package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit
import typings.mobx.distTypesObservablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesStructuralMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/structural", "StructuralChildListProperty")
  @js.native
  open class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends AbstractProperty[js.Array[T], IList[T]] {
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T]
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
    
    def deepCopyInto(): Unit = js.native
    
    def detachChild(child: T): Unit = js.native
    
    def processChildAddition(index: Double): Unit = js.native
    
    def processChildRemoval(unit: T): Unit = js.native
    
    def removeChild(child: T): Boolean = js.native
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/structural", "StructuralChildProperty")
  @js.native
  open class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected () extends AbstractProperty[T | Null, IObservableValue[T | Null]] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit[IAbstractModel], name: String) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit[IAbstractModel], name: String, value: T) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: T,
      targetRefType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit[IAbstractModel],
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
    
    def deepCopyInto(): Unit = js.native
    
    def detachValue(): Unit = js.native
    
    def set(): Unit = js.native
    def set(value: T): Unit = js.native
  }
}
