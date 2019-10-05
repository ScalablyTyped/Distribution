package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "mappings")
@js.native
object mappings extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  abstract class Element protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.Element {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ElementType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ElementType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  abstract class MappingDocument protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.MappingDocument {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.MappingElement {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.MappingMicroflowCall {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.MappingMicroflowParameter {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ObjectHandlingBackupEnum
  
  @js.native
  class ObjectHandlingEnum ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ObjectHandlingEnum
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ObjectMappingElement {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class ValueMappingElement protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappings.ValueMappingElement {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object Element extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ElementType extends js.Object {
    var All: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Array: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Choice: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Inheritance: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var NamedArray: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Object: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Sequence: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Undefined: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Value: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
    var Wrapper: typings.mendixmodelsdk.distGenMappingsMod.mappings.ElementType = js.native
  }
  
  /* static members */
  @js.native
  object MappingDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowCall extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowCall = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectMappingElement): typings.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowCall = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowParameter = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowCall): typings.mendixmodelsdk.distGenMappingsMod.mappings.MappingMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    var Create: typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    var Error: typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    var Ignore: typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    var Create: typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    var Custom: typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    var Find: typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum = js.native
    var Parameter: typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValueMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
}

