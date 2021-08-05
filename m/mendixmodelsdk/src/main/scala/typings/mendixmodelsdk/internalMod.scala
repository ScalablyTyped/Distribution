package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.anon.HandleError
import typings.mendixmodelsdk.anon.ToRawChangeValue
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.deltaManagerMod.IDeltaManager
import typings.mendixmodelsdk.elementsMod.IAbstractElement
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.instancesMod.InstanceConstructor
import typings.mendixmodelsdk.localByNameReferencePropertyMod.INamedElement
import typings.mendixmodelsdk.structuresMod.IStructure
import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.structuresMod.IStructureConstructor
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractUnitJson
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import typings.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import typings.mendixmodelsdk.unitsMod.IModelUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import typings.mendixmodelsdk.utilsMod.utils.IMap
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IModifierValueHistory
import typings.mendixmodelsdk.versionChecksMod.IPropertyVersionInfo
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.IVersionRange
import typings.mendixmodelsdk.versionChecksMod.StructureType
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractElement")
  @js.native
  abstract class AbstractElement[TModel /* <: IAbstractModel */, TContainer /* <: Container */] protected ()
    extends typings.mendixmodelsdk.elementsMod.AbstractElement[TModel, TContainer] {
    def this(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean
    ) = this()
    def this(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IContainer
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractEnum")
  @js.native
  abstract class AbstractEnum protected ()
    extends typings.mendixmodelsdk.instancesMod.AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractModel")
  @js.native
  abstract class AbstractModel protected ()
    extends typings.mendixmodelsdk.abstractModelMod.AbstractModel {
    def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractProperty")
  @js.native
  abstract class AbstractProperty[T, P] protected ()
    extends typings.mendixmodelsdk.propertiesMod.AbstractProperty[T, P] {
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
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractUnit")
  @js.native
  abstract class AbstractUnit[TModel /* <: IAbstractModel */] protected ()
    extends typings.mendixmodelsdk.unitsMod.AbstractUnit[TModel] {
    def this(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ByIdReference")
  @js.native
  class ByIdReference[T /* <: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container] */] protected ()
    extends typings.mendixmodelsdk.byIdReferenceMod.ByIdReference[T] {
    /**
      * Constructs and returns a new reference instance, that is owned (by a property of) an abstract element.
      */
    def this(owner: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ByIdReferenceProperty")
  @js.native
  class ByIdReferenceProperty[T /* <: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container] */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.ByIdReferenceProperty[T] {
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
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ByNameReferenceListProperty")
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.ByNameReferenceListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ByNameReferenceProperty")
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.ByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "DeltaManager")
  @js.native
  class DeltaManager protected ()
    extends typings.mendixmodelsdk.deltasMod.DeltaManager {
    def this(model: typings.mendixmodelsdk.abstractModelMod.AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "Element")
  @js.native
  abstract class Element[TModel /* <: IAbstractModel */] protected ()
    extends typings.mendixmodelsdk.elementsMod.Element[TModel] {
    def this(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "EnumListProperty")
  @js.native
  class EnumListProperty[T /* <: typings.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.EnumListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[
            /* key */ String, 
            /* lifeCycle */ ILifeCycle, 
            typings.mendixmodelsdk.instancesMod.AbstractEnum
          ]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "EnumProperty")
  @js.native
  class EnumProperty[T /* <: typings.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.EnumProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[
            /* key */ String, 
            /* lifeCycle */ ILifeCycle, 
            typings.mendixmodelsdk.instancesMod.AbstractEnum
          ]
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "LifeCycle")
  @js.native
  class LifeCycle ()
    extends typings.mendixmodelsdk.versionChecksMod.LifeCycle {
    def this(info: ILifeCycle) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "LifeCycleState")
  @js.native
  object LifeCycleState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mendixmodelsdk.versionChecksMod.LifeCycleState & Double] = js.native
    
    /* 1 */ val AVAILABLE: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.AVAILABLE & Double = js.native
    
    /* 2 */ val REMOVED: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.REMOVED & Double = js.native
    
    /* 0 */ val UNAVAILABLE: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.UNAVAILABLE & Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "LocalByNameReferenceProperty")
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.LocalByNameReferenceProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ModelEventReceiver")
  @js.native
  class ModelEventReceiver protected ()
    extends typings.mendixmodelsdk.modelEventReceiverMod.ModelEventReceiver {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ModelServerClientImpl")
  @js.native
  class ModelServerClientImpl protected ()
    extends typings.mendixmodelsdk.modelServerClientImplMod.ModelServerClientImpl {
    def this(config: ISdkConfig) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ModelUnit")
  @js.native
  abstract class ModelUnit[TModel /* <: IAbstractModel */] protected ()
    extends typings.mendixmodelsdk.unitsMod.ModelUnit[TModel] {
    def this(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean
    ) = this()
    def this(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "ModifierValueHistory")
  @js.native
  class ModifierValueHistory protected ()
    extends typings.mendixmodelsdk.versionChecksMod.ModifierValueHistory {
    def this(lifecycle: Null, defaultFallback: Boolean) = this()
    def this(lifecycle: Unit, defaultFallback: Boolean) = this()
    /**
      * defaultFallback indiciates whether the absence of a lifecycle yields true or false
      */
    def this(lifecycle: IModifierValueHistory, defaultFallback: Boolean) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PartListProperty")
  @js.native
  class PartListProperty[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.PartListProperty[T] {
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
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PartProperty")
  @js.native
  class PartProperty[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.PartProperty[T] {
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
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PrimitiveListProperty")
  @js.native
  class PrimitiveListProperty[T] protected ()
    extends typings.mendixmodelsdk.propertiesMod.PrimitiveListProperty[T] {
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
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PrimitiveProperty")
  @js.native
  class PrimitiveProperty[T] protected ()
    extends typings.mendixmodelsdk.propertiesMod.PrimitiveProperty[T] {
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
      parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PrimitiveTypeEnum")
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
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "PropertyVersionInfo")
  @js.native
  class PropertyVersionInfo protected ()
    extends typings.mendixmodelsdk.versionChecksMod.PropertyVersionInfo {
    def this(info: Null, publicByDefault: Boolean) = this()
    def this(info: IPropertyVersionInfo, publicByDefault: Boolean) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "RestTransportation")
  @js.native
  class RestTransportation protected ()
    extends typings.mendixmodelsdk.restTransportationMod.RestTransportation {
    def this(config: ISdkConfig) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildListProperty")
  @js.native
  class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.StructuralChildListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T]
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: js.Array[T],
      targetRefType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildProperty")
  @js.native
  class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
    extends typings.mendixmodelsdk.propertiesMod.StructuralChildProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: T
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: T,
      targetRefType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralUnit")
  @js.native
  abstract class StructuralUnit[TModel /* <: IAbstractModel */] protected ()
    extends typings.mendixmodelsdk.unitsMod.StructuralUnit[TModel] {
    def this(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _ignoredIsPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "Structure")
  @js.native
  abstract class Structure[TModel /* <: IAbstractModel */, TContainer /* <: IContainer | Null */] protected ()
    extends typings.mendixmodelsdk.structuresMod.Structure[TModel, TContainer] {
    def this(
      _model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String
    ) = this()
    def this(
      _model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Boolean
    ) = this()
    def this(
      _model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Boolean,
      container: IContainer
    ) = this()
    def this(
      _model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      structureTypeName: String,
      id: String,
      _isPartial: Unit,
      container: IContainer
    ) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructureType")
  @js.native
  object StructureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mendixmodelsdk.versionChecksMod.StructureType & Double] = js.native
    
    /* 2 */ val Element: typings.mendixmodelsdk.versionChecksMod.StructureType.Element & Double = js.native
    
    /* 1 */ val ModelUnit: typings.mendixmodelsdk.versionChecksMod.StructureType.ModelUnit & Double = js.native
    
    /* 0 */ val StructuralUnit: typings.mendixmodelsdk.versionChecksMod.StructureType.StructuralUnit & Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.versionChecksMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "UndoManager")
  @js.native
  class UndoManager protected ()
    extends typings.mendixmodelsdk.undoManagerMod.UndoManager {
    def this(_model: IAbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "UndoState")
  @js.native
  class UndoState protected ()
    extends typings.mendixmodelsdk.undoManagerMod.UndoState {
    def this(deltaManager: IDeltaManager) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "Version")
  @js.native
  class Version protected ()
    extends typings.mendixmodelsdk.versionChecksMod.Version {
    def this(major: Double, minor: Double, patch: Double) = this()
  }
  /* static members */
  object Version {
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "Version")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "Version.memoisMap")
    @js.native
    def memoisMap: js.Any = js.native
    inline def memoisMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoisMap")(x.asInstanceOf[js.Any])
    
    /**
      * Parses and @returns the given string as a Version object.
      *
      * This function is memoised to keep memory and time consumption low,
      * given that only a handful of versions exist at any time anyway.
      */
    inline def parse(versionString: String): typings.mendixmodelsdk.versionChecksMod.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(versionString.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.versionChecksMod.Version]
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal", "VersionInfo")
  @js.native
  abstract class VersionInfo ()
    extends typings.mendixmodelsdk.versionChecksMod.VersionInfo
  
  inline def contains(range: IVersionRange, version: typings.mendixmodelsdk.versionChecksMod.Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(range.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[IAbstractModel]]
  inline def createElementFromJSON(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[
      typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null]
    ]
  ): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], idToStructureMap.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[IAbstractModel]]
  
  inline def createInVersionCheck(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInVersionCheck")(model.asInstanceOf[js.Any], structureTypeName.asInstanceOf[js.Any], versionRange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createModelUnitFromJSON(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): typings.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelUnitFromJSON")(containerUnit.asInstanceOf[js.Any], containmentName.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel]]
  
  object instancehelpers {
    
    @JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given some a (normalized) JSON representation of a unit,
      * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
      * and populates that from the JSON.
      * Should only be called if this unit was not already in memory.
      */
    inline def abstractUnitJsonToInstance(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      json: IAbstractUnitJson,
      isPartial: Boolean
    ): typings.mendixmodelsdk.unitsMod.AbstractUnit[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("abstractUnitJsonToInstance")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.unitsMod.AbstractUnit[IAbstractModel] | Null]
    
    /**
      * Creates a new element for a SDK user.
      */
    inline def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: Unit,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def createElement[T /* <: typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] */](
      owner: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      constructor: IStructureConstructor[T],
      parentPropName: Unit,
      parentPropIsList: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(owner.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any], parentPropName.asInstanceOf[js.Any], parentPropIsList.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def createNewElementInstanceFromJSON(model: typings.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractElementJson): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNewElementInstanceFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[IAbstractModel]]
    
    /**
      * Creates a new unit for a SDK user.
      */
    inline def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnit")(container.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def createUnitFromJSON(model: typings.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractUnitJson): IAbstractUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnitFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[IAbstractUnit]
    inline def createUnitFromJSON(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      json: IAbstractUnitJson,
      resolveByIdReferences: Boolean
    ): IAbstractUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnitFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], resolveByIdReferences.asInstanceOf[js.Any])).asInstanceOf[IAbstractUnit]
    
    /**
      * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
      */
    inline def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupClass")(qualifiedTypeName.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[InstanceConstructor]
    
    inline def modelElementJsonToInstance(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      unit: typings.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      json: Null,
      isPartial: Boolean
    ): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("modelElementJsonToInstance")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], container.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null]
    /**
      * Given some a (normalized) JSON representation of a model element,
      * creates an instance of the corresponding `elements.Element`
      * and populates that from the JSON.
      * Will update existing elements if this element was created before.
      */
    inline def modelElementJsonToInstance(
      model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
      unit: typings.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
      json: IAbstractElementJson,
      isPartial: Boolean
    ): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("modelElementJsonToInstance")(model.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], container.asInstanceOf[js.Any], json.asInstanceOf[js.Any], isPartial.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null]
    
    inline def structureAffectsQualifiedNames(structure: IStructure): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("structureAffectsQualifiedNames")(structure.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/structures.aliases.Container> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("structureIsByNameReferrable")(structure.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement<mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/AbstractModel.IAbstractModel, mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/structures.aliases.Container> */ Boolean]
  }
  
  inline def instantiateChildElement(parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null]
  inline def instantiateChildElement(
    parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    value: IAbstractElementJson
  ): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null]
  
  inline def isAtLeast(versionString: String, model: IAbstractModel): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAtLeast")(versionString.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean]
  
  inline def parseAsNormalizedVersion(versionString: String): typings.mendixmodelsdk.versionChecksMod.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAsNormalizedVersion")(versionString.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.versionChecksMod.Version]
  
  inline def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
