package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.EntityWidget
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenPagesMod.pages.CreateObjectClientAction
import typings.mendixmodelsdk.srcGenPagesMod.pages.EntityPathSource
import typings.mendixmodelsdk.srcGenPagesMod.pages.NewButton
import typings.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector
import typings.mendixmodelsdk.srcGenPagesMod.pages.SelectorXPathSource
import typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Parameter
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.6.0: added public
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef")
@js.native
open class IndirectEntityRef protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.IndirectEntityRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object IndirectEntityRef {
  
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateObjectClientActionUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.EntityPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityPathSourceUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent documenttemplates.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInEntityWidgetUnderEntityRef(container: EntityWidget): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent MemberRef element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInMemberRefUnderEntityRef(container: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MemberRef): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberRefUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 7.16.0
    */
  /* static member */
  inline def createInNewButtonUnderEntityRef(container: NewButton): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNewButtonUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent workflows.Parameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.6.0 to 9.9.0
    */
  /* static member */
  inline def createInParameterUnderEntityRef(container: Parameter): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInParameterUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderConstrainedByRefs")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.SelectorXPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorXPathSourceUnderConstrainedByRefs")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderEntityRef(container: WidgetValue): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IndirectEntityRef]
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IndirectEntityRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
