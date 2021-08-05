package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IType because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IEntityType because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IParameterizedEntityType because var conflicts: containerAsBasicParameterType, containerAsJavaAction, containerAsJavaActionParameter, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ParameterizedEntityType")
@js.native
class ParameterizedEntityType protected () extends EntityType {
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
  
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MParameterizedEntityType: JavaActionParameter = js.native
  
  @JSName("containerAsJavaAction")
  def containerAsJavaAction_MParameterizedEntityType: JavaAction = js.native
  
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
  
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ParameterizedEntityType")
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
    *  6.7.0 to 7.20.0
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: BasicParameterType): ParameterizedEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[ParameterizedEntityType]
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  /* static member */
  inline def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): ParameterizedEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionParameterUnderJavaType")(container.asInstanceOf[js.Any]).asInstanceOf[ParameterizedEntityType]
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  inline def createInJavaActionUnderJavaReturnType(container: JavaAction): ParameterizedEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionUnderJavaReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[ParameterizedEntityType]
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
    * of the parent ListType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  inline def createInListTypeUnderParameter(container: ListType): ParameterizedEntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListTypeUnderParameter")(container.asInstanceOf[js.Any]).asInstanceOf[ParameterizedEntityType]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ParameterizedEntityType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ParameterizedEntityType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
