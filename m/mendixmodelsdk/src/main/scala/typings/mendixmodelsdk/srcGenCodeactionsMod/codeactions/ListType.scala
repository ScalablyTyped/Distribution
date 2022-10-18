package typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IType because Already inherited
- typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IListType because var conflicts: containerAsBasicParameterType, containerAsCodeAction, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined parameter */ @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.ListType")
@js.native
open class ListType protected () extends Type {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MListType: BasicParameterType = js.native
  
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MListType: CodeAction = js.native
  
  def parameter: EntityType = js.native
  def parameter_=(newValue: EntityType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("parameter")
  val parameter_FListType: IEntityType = js.native
}
object ListType {
  
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.ListType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ListType]
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: BasicParameterType): ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[ListType]
  
  /**
    * Creates and returns a new ListType instance in the SDK and on the server.
    * The new ListType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInCodeActionUnderActionReturnType(container: CodeAction): ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[ListType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.ListType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.ListType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
