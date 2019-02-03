package typings
package mendixmodelsdkLib.mendixmodelsdkMod

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
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.enumerationsNs.Condition {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
    */
  @js.native
  class Enumeration protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.enumerationsNs.Enumeration {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
    */
  @js.native
  class EnumerationValue protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.enumerationsNs.EnumerationValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* static members */
  @js.native
  object Condition extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenEnumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.Condition = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent documenttemplates.ConditionSettings element passed as argument.
      */
    def createInConditionSettingsUnderConditions(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.ConditionSettings): mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.Condition = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent pages.ConditionalSettings element passed as argument.
      */
    def createInConditionalSettingsUnderConditions(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.Condition = js.native
  }
  
  /* static members */
  @js.native
  object Enumeration extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenEnumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Enumeration unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.Enumeration = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenEnumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.EnumerationValue = js.native
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * The new EnumerationValue will be automatically stored in the 'values' property
      * of the parent Enumeration element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.Enumeration): mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.EnumerationValue = js.native
  }
  
}

