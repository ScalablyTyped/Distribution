package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.ConditionSettings
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ConditionalSettings
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "enumerations")
@js.native
object enumerationsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
    */
  @js.native
  class Condition protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.enumerationsNs.Condition {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
    */
  @js.native
  class Enumeration protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.enumerationsNs.Enumeration {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
    */
  @js.native
  class EnumerationValue protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.enumerationsNs.EnumerationValue {
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
  object Condition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenEnumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.Condition = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent documenttemplates.ConditionSettings element passed as argument.
      */
    def createInConditionSettingsUnderConditions(container: ConditionSettings): typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.Condition = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent pages.ConditionalSettings element passed as argument.
      */
    def createInConditionalSettingsUnderConditions(container: ConditionalSettings): typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.Condition = js.native
  }
  
  /* static members */
  @js.native
  object Enumeration extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenEnumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Enumeration unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.Enumeration = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenEnumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.EnumerationValue = js.native
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * The new EnumerationValue will be automatically stored in the 'values' property
      * of the parent Enumeration element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.Enumeration): typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.EnumerationValue = js.native
  }
  
}

