package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveListProperty
import typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveProperty
import typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.ILifeCycle
import typings.mobx.libTypesObservablearrayMod.IArrayWillChange
import typings.mobx.libTypesObservablearrayMod.IArrayWillSplice
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/primitives", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesPrimitivesMod extends js.Object {
  @js.native
  class EnumListProperty[T /* <: AbstractEnum */] protected () extends PrimitiveListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
    var enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum] = js.native
    var initialValue: js.Any = js.native
  }
  
  @js.native
  class EnumProperty[T /* <: AbstractEnum */] protected () extends PrimitiveProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
    var enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum] = js.native
    var initialValue: js.Any = js.native
  }
  
  @js.native
  class PrimitiveListProperty[T] ()
    extends AbstractProperty[js.Array[T], IList[T]] {
    var primitiveType: js.Any = js.native
    def deepCopyInto(clone: Structure): Unit = js.native
    def updateWithRawValue(value: js.Array[T]): Unit = js.native
  }
  
  @js.native
  class PrimitiveProperty[T] () extends AbstractProperty[T, IObservableValue[T]] {
    var beforeChange: js.Any = js.native
    var defaultValue: T = js.native
    var primitiveType: js.Any = js.native
    def deepCopyInto(clone: Structure): Unit = js.native
    /* protected */ def getRawValue(value: T): js.Any = js.native
    def markCurrentValueAsDefault(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def updateWithRawValue(value: T): Unit = js.native
  }
  
  @js.native
  sealed trait PrimitiveTypeEnum extends js.Object
  
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
  @js.native
  object PrimitiveTypeEnum extends js.Object {
    @js.native
    sealed trait Blob extends PrimitiveTypeEnum
    
    @js.native
    sealed trait Boolean extends PrimitiveTypeEnum
    
    @js.native
    sealed trait Color extends PrimitiveTypeEnum
    
    @js.native
    sealed trait DateTime extends PrimitiveTypeEnum
    
    @js.native
    sealed trait Double extends PrimitiveTypeEnum
    
    @js.native
    sealed trait Guid extends PrimitiveTypeEnum
    
    @js.native
    sealed trait Integer extends PrimitiveTypeEnum
    
    @js.native
    sealed trait Point extends PrimitiveTypeEnum
    
    @js.native
    sealed trait Size extends PrimitiveTypeEnum
    
    @js.native
    sealed trait String extends PrimitiveTypeEnum
    
    /* 9 */ val Blob: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.Blob with scala.Double = js.native
    /* 2 */ val Boolean: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.Boolean with scala.Double = js.native
    /* 8 */ val Color: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.Color with scala.Double = js.native
    /* 4 */ val DateTime: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.DateTime with scala.Double = js.native
    /* 3 */ val Double: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.Double with scala.Double = js.native
    /* 5 */ val Guid: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.Guid with scala.Double = js.native
    /* 0 */ val Integer: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.Integer with scala.Double = js.native
    /* 6 */ val Point: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.Point with scala.Double = js.native
    /* 7 */ val Size: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.Size with scala.Double = js.native
    /* 1 */ val String: typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum.String with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[PrimitiveTypeEnum with scala.Double] = js.native
  }
  
}

