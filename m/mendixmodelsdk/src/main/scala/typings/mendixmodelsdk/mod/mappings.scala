package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.Element {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object Element extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class ElementType ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.ElementType
  /* static members */
  @js.native
  object ElementType extends js.Object {
    
    var All: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var Array: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var Choice: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var Inheritance: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var NamedArray: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var Object: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var Sequence: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var Undefined: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var Value: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    
    var Wrapper: typings.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/mapping-documents relevant section in reference guide}
    */
  @js.native
  abstract class MappingDocument protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.MappingDocument {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object MappingDocument extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.MappingElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object MappingElement extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.MappingMicroflowCall {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object MappingMicroflowCall extends js.Object {
    
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = js.native
    
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement): typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.MappingMicroflowParameter {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object MappingMicroflowParameter extends js.Object {
    
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = js.native
    
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall): typings.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.ObjectHandlingBackupEnum
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    
    var Create: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    
    var Error: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    
    var Ignore: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
  }
  
  @js.native
  class ObjectHandlingEnum ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.ObjectHandlingEnum
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    
    var Create: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    
    var Custom: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    
    var Find: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    
    var Parameter: typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
  }
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.ObjectMappingElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object ObjectMappingElement extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  abstract class ValueMappingElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.mappings.ValueMappingElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object ValueMappingElement extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
}
