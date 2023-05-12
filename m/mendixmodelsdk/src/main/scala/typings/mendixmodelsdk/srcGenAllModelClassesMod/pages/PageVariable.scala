package typings.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageVariable")
@js.native
open class PageVariable protected ()
  extends typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PageVariable {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageVariable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInAssociationWidgetUnderSourceVariable(container: typings.mendixmodelsdk.srcGenPagesMod.pages.AssociationWidget): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderSourceVariable(container: typings.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInClientTemplateParameterUnderSourceVariable(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplateParameter): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateParameterUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.24.0 and higher
    */
  /* static member */
  inline def createInConditionalSettingsUnderSourceVariable(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ConditionalSettings): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionalSettingsUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent MicroflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterMappingUnderVariable(container: typings.mendixmodelsdk.srcGenPagesMod.pages.MicroflowParameterMapping): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent NanoflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  inline def createInNanoflowParameterMappingUnderVariable(container: typings.mendixmodelsdk.srcGenPagesMod.pages.NanoflowParameterMapping): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent PageParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.7.0 and higher
    */
  /* static member */
  inline def createInPageParameterMappingUnderVariable(container: typings.mendixmodelsdk.srcGenPagesMod.pages.PageParameterMapping): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent SnippetParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.21.0 and higher
    */
  /* static member */
  inline def createInSnippetParameterMappingUnderVariable(container: typings.mendixmodelsdk.srcGenPagesMod.pages.SnippetParameterMapping): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderSourceVariable(container: WidgetValue): typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageVariable.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.PageVariable.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
