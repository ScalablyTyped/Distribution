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
- typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IEntityType because Already inherited
- typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IParameterizedEntityType because var conflicts: containerAsBasicParameterType, containerAsCodeAction, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.ParameterizedEntityType")
@js.native
open class ParameterizedEntityType protected () extends EntityType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MParameterizedEntityType: BasicParameterType = js.native
  
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MParameterizedEntityType: CodeAction = js.native
  
  @JSName("containerAsListType")
  def containerAsListType_MParameterizedEntityType: ListType = js.native
  
  def typeParameter: TypeParameter = js.native
  def typeParameter_=(newValue: TypeParameter): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("typeParameter")
  val typeParameter_FParameterizedEntityType: ITypeParameter = js.native
}
object ParameterizedEntityType {
  
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.ParameterizedEntityType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ParameterizedEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ParameterizedEntityType]
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: BasicParameterType): ParameterizedEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[ParameterizedEntityType]
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInCodeActionUnderActionReturnType(container: CodeAction): ParameterizedEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[ParameterizedEntityType]
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
    * of the parent ListType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInListTypeUnderParameter(container: ListType): ParameterizedEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListTypeUnderParameter")(container.asInstanceOf[js.Any]).asInstanceOf[ParameterizedEntityType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.ParameterizedEntityType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.ParameterizedEntityType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
