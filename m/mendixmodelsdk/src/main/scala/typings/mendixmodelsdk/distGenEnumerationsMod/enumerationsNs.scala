package typings.mendixmodelsdk.distGenEnumerationsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.ConditionSettings
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.Condition
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.Enumeration
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.EnumerationValue
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumeration
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumerationValue
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ConditionalSettings
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  class Condition protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attributeValue: String = js.native
    val containerAsConditionSettings: ConditionSettings = js.native
    val containerAsConditionalSettings: ConditionalSettings = js.native
    var editableVisible: Boolean = js.native
    @JSName("model")
    var model_Condition: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumeration because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined values */ @js.native
  class Enumeration protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    val values: IList[EnumerationValue | IEnumerationValue] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumerationValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEnumeration, name */ @js.native
  class EnumerationValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: Text = js.native
    val containerAsEnumeration: Enumeration | IEnumeration = js.native
    var image: IImage | Null = js.native
    val imageQualifiedName: String | Null = js.native
    @JSName("model")
    var model_EnumerationValue: IModel = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
    */
  @js.native
  trait IEnumeration extends IDocument {
    val values: IList[IEnumerationValue] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
    */
  @js.native
  trait IEnumerationValue
    extends IElement
       with IByNameReferrable {
    val containerAsEnumeration: IEnumeration = js.native
    @JSName("model")
    val model_IEnumerationValue: IModel = js.native
    val name: String = js.native
  }
  
  /* static members */
  @js.native
  object Condition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Condition = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent documenttemplates.ConditionSettings element passed as argument.
      */
    def createInConditionSettingsUnderConditions(container: ConditionSettings): Condition = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent pages.ConditionalSettings element passed as argument.
      */
    def createInConditionalSettingsUnderConditions(container: ConditionalSettings): Condition = js.native
  }
  
  /* static members */
  @js.native
  object Enumeration extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new Enumeration unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): Enumeration = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EnumerationValue = js.native
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * The new EnumerationValue will be automatically stored in the 'values' property
      * of the parent Enumeration element passed as argument.
      */
    def createIn(container: Enumeration): EnumerationValue = js.native
  }
  
}

