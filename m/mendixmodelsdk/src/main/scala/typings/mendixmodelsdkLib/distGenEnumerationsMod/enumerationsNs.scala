package typings
package mendixmodelsdkLib.distGenEnumerationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations")
@js.native
object enumerationsNs extends js.Object {
  /**
       * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
       */
  @js.native
  class Condition protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attributeValue: java.lang.String = js.native
    val containerAsConditionSettings: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.ConditionSettings = js.native
    val containerAsConditionalSettings: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings = js.native
    var editableVisible: scala.Boolean = js.native
    @JSName("model")
    var model_Condition: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class Enumeration protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val values: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[EnumerationValue] = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumerationValue because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class EnumerationValue protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    val containerAsEnumeration: Enumeration = js.native
    var image: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val imageQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_EnumerationValue: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
       */
  @js.native
  trait IEnumeration
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument {
    val values: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IEnumerationValue] = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
       */
  @js.native
  trait IEnumerationValue
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsEnumeration: IEnumeration = js.native
    @JSName("model")
    val model_IEnumerationValue: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
       * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
       */
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
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
       */
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
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
       */
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

