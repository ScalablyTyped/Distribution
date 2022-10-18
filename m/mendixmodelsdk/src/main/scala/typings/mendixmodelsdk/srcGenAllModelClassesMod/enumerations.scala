package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.ConditionSettings
import typings.mendixmodelsdk.srcGenPagesMod.pages.ConditionalSettings
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumerations {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.Condition")
  @js.native
  open class Condition protected ()
    extends typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Condition {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.Condition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Condition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Condition]
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent documenttemplates.ConditionSettings element passed as argument.
      */
    /* static member */
    inline def createInConditionSettingsUnderConditions(container: ConditionSettings): typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Condition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionSettingsUnderConditions")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Condition]
    
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent pages.ConditionalSettings element passed as argument.
      */
    /* static member */
    inline def createInConditionalSettingsUnderConditions(container: ConditionalSettings): typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Condition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionalSettingsUnderConditions")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Condition]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.Condition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.Condition.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenEnumerationsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenEnumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.Enumeration")
  @js.native
  open class Enumeration protected ()
    extends typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Enumeration {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Enumeration {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.Enumeration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Enumeration unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Enumeration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Enumeration]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.Enumeration.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.Enumeration.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenEnumerationsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenEnumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.EnumerationValue")
  @js.native
  open class EnumerationValue protected ()
    extends typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.EnumerationValue {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.EnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.EnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.EnumerationValue]
    
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * The new EnumerationValue will be automatically stored in the 'values' property
      * of the parent Enumeration element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Enumeration): typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.EnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.EnumerationValue]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.EnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "enumerations.EnumerationValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenEnumerationsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenEnumerationsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
