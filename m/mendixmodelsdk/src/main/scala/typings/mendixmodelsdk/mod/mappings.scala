package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappings {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
    */
  /**
    * In version 6.6.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "mappings.Element")
  @js.native
  open class Element protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.Element {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Element {
    
    @JSImport("mendixmodelsdk", "mappings.Element")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.Element.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.Element.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.ElementType")
  @js.native
  open class ElementType protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.ElementType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ElementType {
    
    @JSImport("mendixmodelsdk", "mappings.ElementType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.All")
    @js.native
    def All: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def All_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Array")
    @js.native
    def Array: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def Array_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Choice")
    @js.native
    def Choice: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def Choice_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Choice")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Inheritance")
    @js.native
    def Inheritance: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def Inheritance_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Inheritance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.NamedArray")
    @js.native
    def NamedArray: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def NamedArray_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedArray")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Object")
    @js.native
    def Object: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def Object_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Sequence")
    @js.native
    def Sequence: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def Sequence_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Undefined")
    @js.native
    def Undefined: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def Undefined_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Undefined")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Value")
    @js.native
    def Value: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def Value_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ElementType.Wrapper")
    @js.native
    def Wrapper: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType = js.native
    inline def Wrapper_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wrapper")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/mapping-documents relevant section in reference guide}
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "mappings.MappingDocument")
  @js.native
  open class MappingDocument protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.MappingDocument {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MappingDocument {
    
    @JSImport("mendixmodelsdk", "mappings.MappingDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingDocument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk", "mappings.MappingElement")
  @js.native
  open class MappingElement protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.MappingElement {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingElement {
    
    @JSImport("mendixmodelsdk", "mappings.MappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall")
  @js.native
  open class MappingMicroflowCall protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.MappingMicroflowCall {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingMicroflowCall {
    
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowCall]
    
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectMappingElement): typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowCall]
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowCall.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter")
  @js.native
  open class MappingMicroflowParameter protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.MappingMicroflowParameter {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingMicroflowParameter {
    
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowParameter]
    
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowCall): typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingMicroflowParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.MappingMicroflowParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum")
  @js.native
  open class ObjectHandlingBackupEnum protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.ObjectHandlingBackupEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ObjectHandlingBackupEnum {
    
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum.Create")
    @js.native
    def Create: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    inline def Create_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum.Error")
    @js.native
    def Error: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    inline def Error_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingBackupEnum.Ignore")
    @js.native
    def Ignore: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    inline def Ignore_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ignore")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum")
  @js.native
  open class ObjectHandlingEnum protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.ObjectHandlingEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ObjectHandlingEnum {
    
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum.Create")
    @js.native
    def Create: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    inline def Create_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum.Custom")
    @js.native
    def Custom: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    inline def Custom_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum.Find")
    @js.native
    def Find: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    inline def Find_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Find")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectHandlingEnum.Parameter")
    @js.native
    def Parameter: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    inline def Parameter_=(x: typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk", "mappings.ObjectMappingElement")
  @js.native
  open class ObjectMappingElement protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.ObjectMappingElement {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ObjectMappingElement {
    
    @JSImport("mendixmodelsdk", "mappings.ObjectMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk", "mappings.ValueMappingElement")
  @js.native
  open class ValueMappingElement protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.mappings.ValueMappingElement {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ValueMappingElement {
    
    @JSImport("mendixmodelsdk", "mappings.ValueMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "mappings.ValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenMappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
