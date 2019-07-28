package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "mappings")
@js.native
object mappingsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  abstract class Element protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.Element {
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
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.ElementType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  abstract class MappingDocument protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.MappingDocument {
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
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.MappingElement {
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
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.MappingMicroflowCall {
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
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.MappingMicroflowParameter {
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
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.ObjectHandlingBackupEnum
  
  @js.native
  class ObjectHandlingEnum ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.ObjectHandlingEnum
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.ObjectMappingElement {
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
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.mappingsNs.ValueMappingElement {
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
    var All: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Array: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Choice: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Inheritance: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var NamedArray: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Object: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Sequence: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Undefined: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Value: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Wrapper: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType = js.native
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
    def create(model: IModel): typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingMicroflowCall = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectMappingElement): typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingMicroflowCall = js.native
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
    def create(model: IModel): typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingMicroflowParameter = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingMicroflowCall): typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    var Create: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    var Error: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    var Ignore: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    var Create: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Custom: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Find: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Parameter: typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
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

