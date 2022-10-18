package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.anon.ToRawChangeValue
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalElementsMod.Element
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalPropertiesLocalByNameReferencePropertyMod.INamedElement
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typings.mobx.distTypesObservablearrayMod.IArrayWillChange
import typings.mobx.distTypesObservablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal/properties", "AbstractProperty")
  @js.native
  open class AbstractProperty[T, P] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[T, P] {
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
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "ByIdReferenceProperty")
  @js.native
  open class ByIdReferenceProperty[T /* <: AbstractElement[IAbstractModel, Container] */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesByIdReferencePropertyMod.ByIdReferenceProperty[T] {
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
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "ByNameReferenceListProperty")
  @js.native
  open class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesByNameReferencePropertyMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "ByNameReferenceProperty")
  @js.native
  open class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesByNameReferencePropertyMod.ByNameReferenceProperty[T] {
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
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "EnumListProperty")
  @js.native
  open class EnumListProperty[T /* <: AbstractEnum */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesEnumListPropertyMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "EnumProperty")
  @js.native
  open class EnumProperty[T /* <: AbstractEnum */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesEnumPropertyMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "LocalByNameReferenceProperty")
  @js.native
  open class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesLocalByNameReferencePropertyMod.LocalByNameReferenceProperty[T] {
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
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PartListProperty")
  @js.native
  open class PartListProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesPartListPropertyMod.PartListProperty[T] {
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
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PartProperty")
  @js.native
  open class PartProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesPartPropertyMod.PartProperty[T] {
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
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PrimitiveListProperty")
  @js.native
  open class PrimitiveListProperty[T] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveListPropertyMod.PrimitiveListProperty[T] {
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
      moreArgs: Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PrimitiveProperty")
  @js.native
  open class PrimitiveProperty[T] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitivePropertyMod.PrimitiveProperty[T] {
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
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "PrimitiveTypeEnum")
  @js.native
  object PrimitiveTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum & scala.Double
      ] = js.native
    
    /* 9 */ val Blob: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Blob & scala.Double = js.native
    
    /* 2 */ val Boolean: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Boolean & scala.Double = js.native
    
    /* 8 */ val Color: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Color & scala.Double = js.native
    
    /* 4 */ val DateTime: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.DateTime & scala.Double = js.native
    
    /* 3 */ val Double: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Double & scala.Double = js.native
    
    /* 5 */ val Guid: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Guid & scala.Double = js.native
    
    /* 0 */ val Integer: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Integer & scala.Double = js.native
    
    /* 6 */ val Point: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Point & scala.Double = js.native
    
    /* 7 */ val Size: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Size & scala.Double = js.native
    
    /* 1 */ val String: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.String & scala.Double = js.native
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "StructuralChildListProperty")
  @js.native
  open class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesStructuralMod.StructuralChildListProperty[T] {
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
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties", "StructuralChildProperty")
  @js.native
  open class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.srcSdkInternalPropertiesStructuralMod.StructuralChildProperty[T] {
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
  
  inline def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container]): Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[Element[IAbstractModel] | Null]
  inline def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container], value: IAbstractElementJson): Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel] | Null]
  
  inline def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean]
  
  inline def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
