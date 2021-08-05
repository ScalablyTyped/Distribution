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
  inline def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAssociationWidgetUnderOnChangeMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.AssociationWidget): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnChangeMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onEnterMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnEnterMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onLeaveMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnLeaveMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowClientAction element passed as argument.
    */
  /* static member */
  inline def createInMicroflowClientActionUnderMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.MicroflowClientAction): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowClientActionUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowSource element passed as argument.
    */
  /* static member */
  inline def createInMicroflowSourceUnderMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.MicroflowSource): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSourceUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent OnClickMicroflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  /* static member */
  inline def createInOnClickMicroflowUnderMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.OnClickMicroflow): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOnClickMicroflowUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderOnChangeMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'dataSourceMicroflowSettings' property
    * of the parent SelectorMicroflowSource element passed as argument.
    */
  /* static member */
  inline def createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings(container: typings.mendixmodelsdk.pagesMod.pages.SelectorMicroflowSource): typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
