package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/on-click-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.MicroflowSettings")
@js.native
class MicroflowSettings protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.MicroflowSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowSettings {
  
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInAssociationWidgetUnderOnChangeMicroflowSettings")
  @js.native
  def createInAssociationWidgetUnderOnChangeMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.AssociationWidget): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInAttributeWidgetUnderOnChangeMicroflowSettings")
  @js.native
  def createInAttributeWidgetUnderOnChangeMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onEnterMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInAttributeWidgetUnderOnEnterMicroflowSettings")
  @js.native
  def createInAttributeWidgetUnderOnEnterMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onLeaveMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInAttributeWidgetUnderOnLeaveMicroflowSettings")
  @js.native
  def createInAttributeWidgetUnderOnLeaveMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowClientAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInMicroflowClientActionUnderMicroflowSettings")
  @js.native
  def createInMicroflowClientActionUnderMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.MicroflowClientAction): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInMicroflowSourceUnderMicroflowSettings")
  @js.native
  def createInMicroflowSourceUnderMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.MicroflowSource): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent OnClickMicroflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInOnClickMicroflowUnderMicroflowSettings")
  @js.native
  def createInOnClickMicroflowUnderMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.OnClickMicroflow): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInReferenceSetSelectorUnderOnChangeMicroflowSettings")
  @js.native
  def createInReferenceSetSelectorUnderOnChangeMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'dataSourceMicroflowSettings' property
    * of the parent SelectorMicroflowSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings")
  @js.native
  def createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.SelectorMicroflowSource): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
