package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumerations {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Condition")
  @js.native
  class Condition protected ()
    extends typings.mendixmodelsdk.enumerationsMod.enumerations.Condition {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Condition {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Condition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Condition.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent documenttemplates.ConditionSettings element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Condition.createInConditionSettingsUnderConditions")
    @js.native
    def createInConditionSettingsUnderConditions(container: ConditionSettings): typings.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent pages.ConditionalSettings element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Condition.createInConditionalSettingsUnderConditions")
    @js.native
    def createInConditionalSettingsUnderConditions(container: ConditionalSettings): typings.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Condition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Condition.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.enumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Enumeration")
  @js.native
  class Enumeration protected ()
    extends typings.mendixmodelsdk.enumerationsMod.enumerations.Enumeration {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Enumeration {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Enumeration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Enumeration unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Enumeration.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.enumerationsMod.enumerations.Enumeration = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Enumeration.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.Enumeration.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.enumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.EnumerationValue")
  @js.native
  class EnumerationValue protected ()
    extends typings.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EnumerationValue {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.EnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.EnumerationValue.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue = js.native
    
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * The new EnumerationValue will be automatically stored in the 'values' property
      * of the parent Enumeration element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.EnumerationValue.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.enumerationsMod.enumerations.Enumeration): typings.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.EnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "enumerations.EnumerationValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.enumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
