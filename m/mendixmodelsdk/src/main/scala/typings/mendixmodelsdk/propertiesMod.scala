package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.anon.ToRawChangeValue
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.elementsMod.IAbstractElement
import typings.mendixmodelsdk.instancesMod.AbstractEnum
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.localByNameReferencePropertyMod.INamedElement
import typings.mendixmodelsdk.structuresMod.IStructure
import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.unitsMod.IModelUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import typings.mendixmodelsdk.unitsMod.StructuralUnit
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", JSImport.Namespace)
@js.native
object propertiesMod extends js.Object {
  @js.native
  abstract class AbstractProperty[T, P] protected ()
    extends typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[T, P] {
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
    extends typings.mendixmodelsdk.byIdReferencePropertyMod.ByIdReferenceProperty[T]
  
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceListProperty[T] {
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
    extends typings.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceProperty[T] {
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
    extends typings.mendixmodelsdk.enumListPropertyMod.EnumListProperty[T] {
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
    extends typings.mendixmodelsdk.enumPropertyMod.EnumProperty[T] {
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
    extends typings.mendixmodelsdk.localByNameReferencePropertyMod.LocalByNameReferenceProperty[T] {
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
    extends typings.mendixmodelsdk.partListPropertyMod.PartListProperty[T]
  
  @js.native
  class PartProperty[T /* <: Element */] ()
    extends typings.mendixmodelsdk.partPropertyMod.PartProperty[T]
  
  @js.native
  class PrimitiveListProperty[T] ()
    extends typings.mendixmodelsdk.primitiveListPropertyMod.PrimitiveListProperty[T]
  
  @js.native
  class PrimitiveProperty[T] ()
    extends typings.mendixmodelsdk.primitivePropertyMod.PrimitiveProperty[T]
  
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.structuralMod.StructuralChildListProperty[T] {
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
    extends typings.mendixmodelsdk.structuralMod.StructuralChildProperty[T] {
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
  
  def instantiateChildElement(parent: AbstractElement): Element | Null = js.native
  def instantiateChildElement(parent: AbstractElement, value: IAbstractElementJson): Element | Null = js.native
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
  @js.native
  object PrimitiveTypeEnum extends js.Object {
    /* 9 */ val Blob: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Blob with scala.Double = js.native
    /* 2 */ val Boolean: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Boolean with scala.Double = js.native
    /* 8 */ val Color: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Color with scala.Double = js.native
    /* 4 */ val DateTime: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.DateTime with scala.Double = js.native
    /* 3 */ val Double: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Double with scala.Double = js.native
    /* 5 */ val Guid: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Guid with scala.Double = js.native
    /* 0 */ val Integer: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Integer with scala.Double = js.native
    /* 6 */ val Point: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Point with scala.Double = js.native
    /* 7 */ val Size: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Size with scala.Double = js.native
    /* 1 */ val String: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.String with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum with scala.Double] = js.native
  }
  
}

