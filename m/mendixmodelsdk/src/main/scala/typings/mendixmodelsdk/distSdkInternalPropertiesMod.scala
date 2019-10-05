package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalElementsMod.Element
import typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesLocalDashByDashNameDashReferenceMod.INamedElement
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.StructuralUnit
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.ILifeCycle
import typings.mobx.libTypesObservablearrayMod.IArrayWillChange
import typings.mobx.libTypesObservablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesMod extends js.Object {
  @js.native
  abstract class AbstractProperty[T, P] protected ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[T, P] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(declaredOn: IStructureClass, parent: Structure, name: String, initialValue: T, moreArgs: js.Any*) = this()
  }
  
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement */] ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesByDashIdDashReferenceMod.ByIdReferenceProperty[T]
  
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesByDashNameDashReferenceMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesByDashNameDashReferenceMod.ByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @js.native
  class EnumListProperty[T /* <: AbstractEnum */] protected ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @js.native
  class EnumProperty[T /* <: AbstractEnum */] protected ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesLocalDashByDashNameDashReferenceMod.LocalByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @js.native
  class PartListProperty[T /* <: Element */] ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesPartMod.PartListProperty[T]
  
  @js.native
  class PartProperty[T /* <: Element */] ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesPartMod.PartProperty[T]
  
  @js.native
  class PrimitiveListProperty[T] ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveListProperty[T]
  
  @js.native
  class PrimitiveProperty[T] ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveProperty[T]
  
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesStructuralMod.StructuralChildListProperty[T] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: js.Array[T]) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit,
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
  }
  
  @js.native
  class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.distSdkInternalPropertiesStructuralMod.StructuralChildProperty[T] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: T) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: T, targetRefType: String) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit,
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
  }
  
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/local-by-name-reference.INamedElement */ Boolean = js.native
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
  @js.native
  object PrimitiveTypeEnum extends js.Object {
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
    def apply(value: scala.Double): js.UndefOr[
        typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum with scala.Double
      ] = js.native
  }
  
}

