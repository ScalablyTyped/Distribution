package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mobx.distTypesObservablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesPrimitivePropertyMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/PrimitiveProperty", "PrimitiveProperty")
  @js.native
  open class PrimitiveProperty[T] protected () extends AbstractProperty[T, IObservableValue[T]] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
    
    /* private */ var beforeChange: Any = js.native
    
    def deepCopyInto(clone: Structure[IAbstractModel, IContainer | Null]): Unit = js.native
    
    var defaultValue: T = js.native
    
    /* protected */ def getRawValue(value: T): Any = js.native
    
    def markCurrentValueAsDefault(): Unit = js.native
    
    /* private */ var primitiveType: Any = js.native
    
    def set(newValue: T): Unit = js.native
  }
}
