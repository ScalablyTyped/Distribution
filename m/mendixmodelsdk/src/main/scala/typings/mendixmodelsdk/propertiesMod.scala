package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
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
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.unitsMod.IModelUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import typings.mendixmodelsdk.unitsMod.StructuralUnit
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertiesMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "AbstractProperty")
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
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "ByIdReferenceProperty")
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement[IAbstractModel, Container] */] protected ()
    extends typings.mendixmodelsdk.byIdReferencePropertyMod.ByIdReferenceProperty[T] {
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
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "ByNameReferenceListProperty")
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "ByNameReferenceProperty")
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.byNameReferencePropertyMod.ByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "EnumListProperty")
  @js.native
  class EnumListProperty[T /* <: AbstractEnum */] protected ()
    extends typings.mendixmodelsdk.enumListPropertyMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "EnumProperty")
  @js.native
  class EnumProperty[T /* <: AbstractEnum */] protected ()
    extends typings.mendixmodelsdk.enumPropertyMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "LocalByNameReferenceProperty")
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typings.mendixmodelsdk.localByNameReferencePropertyMod.LocalByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PartListProperty")
  @js.native
  class PartListProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends typings.mendixmodelsdk.partListPropertyMod.PartListProperty[T] {
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
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PartProperty")
  @js.native
  class PartProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends typings.mendixmodelsdk.partPropertyMod.PartProperty[T] {
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
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PrimitiveListProperty")
  @js.native
  class PrimitiveListProperty[T] protected ()
    extends typings.mendixmodelsdk.primitiveListPropertyMod.PrimitiveListProperty[T] {
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
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PrimitiveProperty")
  @js.native
  class PrimitiveProperty[T] protected ()
    extends typings.mendixmodelsdk.primitivePropertyMod.PrimitiveProperty[T] {
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
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "PrimitiveTypeEnum")
  @js.native
  object PrimitiveTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum & scala.Double] = js.native
    
    /* 9 */ val Blob: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Blob & scala.Double = js.native
    
    /* 2 */ val Boolean: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Boolean & scala.Double = js.native
    
    /* 8 */ val Color: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Color & scala.Double = js.native
    
    /* 4 */ val DateTime: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.DateTime & scala.Double = js.native
    
    /* 3 */ val Double: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Double & scala.Double = js.native
    
    /* 5 */ val Guid: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Guid & scala.Double = js.native
    
    /* 0 */ val Integer: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Integer & scala.Double = js.native
    
    /* 6 */ val Point: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Point & scala.Double = js.native
    
    /* 7 */ val Size: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Size & scala.Double = js.native
    
    /* 1 */ val String: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.String & scala.Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "StructuralChildListProperty")
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.structuralMod.StructuralChildListProperty[T] {
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
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties", "StructuralChildProperty")
  @js.native
  class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.structuralMod.StructuralChildProperty[T] {
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
  }
  
  @scala.inline
  def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container]): Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[Element[IAbstractModel] | Null]
  @scala.inline
  def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container], value: IAbstractElementJson): Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel] | Null]
  
  @scala.inline
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean]
  
  @scala.inline
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
