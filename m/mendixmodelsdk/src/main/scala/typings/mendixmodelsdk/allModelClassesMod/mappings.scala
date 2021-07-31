package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
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
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.Element")
  @js.native
  abstract class Element protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Element {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.Element")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.Element.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.Element.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType")
  @js.native
  class ElementType protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.ElementType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ElementType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.All")
    @js.native
    def All: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def All_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.Array")
    @js.native
    def Array: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Array_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.Choice")
    @js.native
    def Choice: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Choice_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Choice")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.Inheritance")
    @js.native
    def Inheritance: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Inheritance_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Inheritance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.NamedArray")
    @js.native
    def NamedArray: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def NamedArray_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedArray")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.Object")
    @js.native
    def Object: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Object_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.Sequence")
    @js.native
    def Sequence: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Sequence_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.Undefined")
    @js.native
    def Undefined: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Undefined_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Undefined")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.Value")
    @js.native
    def Value: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Value_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Value")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ElementType.Wrapper")
    @js.native
    def Wrapper: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    @scala.inline
    def Wrapper_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wrapper")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/mapping-documents relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingDocument")
  @js.native
  abstract class MappingDocument protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.MappingDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MappingDocument {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingDocument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingElement")
  @js.native
  abstract class MappingElement protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.MappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingElement {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingMicroflowCall")
  @js.native
  class MappingMicroflowCall protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingMicroflowCall {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingMicroflowCall")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall]
    
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement): typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingMicroflowCall.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingMicroflowCall.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingMicroflowParameter")
  @js.native
  class MappingMicroflowParameter protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MappingMicroflowParameter {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingMicroflowParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter]
    
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall): typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingMicroflowParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.MappingMicroflowParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingBackupEnum")
  @js.native
  class ObjectHandlingBackupEnum protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ObjectHandlingBackupEnum {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingBackupEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingBackupEnum.Create")
    @js.native
    def Create: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    @scala.inline
    def Create_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingBackupEnum.Error")
    @js.native
    def Error: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    @scala.inline
    def Error_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingBackupEnum.Ignore")
    @js.native
    def Ignore: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    @scala.inline
    def Ignore_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ignore")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingEnum")
  @js.native
  class ObjectHandlingEnum protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ObjectHandlingEnum {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingEnum.Create")
    @js.native
    def Create: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    @scala.inline
    def Create_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingEnum.Custom")
    @js.native
    def Custom: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    @scala.inline
    def Custom_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingEnum.Find")
    @js.native
    def Find: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    @scala.inline
    def Find_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Find")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectHandlingEnum.Parameter")
    @js.native
    def Parameter: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    @scala.inline
    def Parameter_=(x: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectMappingElement")
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ObjectMappingElement {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ValueMappingElement")
  @js.native
  abstract class ValueMappingElement protected ()
    extends typings.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ValueMappingElement {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ValueMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "mappings.ValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
