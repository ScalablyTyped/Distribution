package typings
package mendixmodelsdkLib.mendixmodelsdkMod

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
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class ElementType ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.ElementType
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
       */
  @js.native
  abstract class MappingDocument protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.MappingDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.MappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.MappingMicroflowCall {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.MappingMicroflowParameter {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.ObjectHandlingBackupEnum
  
  @js.native
  class ObjectHandlingEnum ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.ObjectHandlingEnum
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.ObjectMappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class ValueMappingElement protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.mappingsNs.ValueMappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
       */
  /**
       * In version 6.6.0: introduced
       */
  @js.native
  object Element extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object ElementType extends js.Object {
    var All: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Array: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Choice: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Inheritance: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var NamedArray: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Object: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Sequence: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Undefined: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Value: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Wrapper: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
       */
  @js.native
  object MappingDocument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object MappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object MappingMicroflowCall extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowCall = js.native
    /**
             * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
             * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
             * of the parent ObjectMappingElement element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectMappingElement): mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowCall = js.native
  }
  
  @js.native
  object MappingMicroflowParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowParameter = js.native
    /**
             * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
             * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
             * of the parent MappingMicroflowCall element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowCall): mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowParameter = js.native
  }
  
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    var Create: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    var Error: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    var Ignore: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
  }
  
  @js.native
  object ObjectHandlingEnum extends js.Object {
    var Create: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Custom: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Find: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Parameter: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
  }
  
  @js.native
  object ObjectMappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object ValueMappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
}

