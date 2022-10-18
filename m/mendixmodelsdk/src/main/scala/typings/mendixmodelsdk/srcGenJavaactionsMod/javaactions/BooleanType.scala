package typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IType because Already inherited
- typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IPrimitiveType because Already inherited
- typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IBooleanType because var conflicts: containerAsBasicParameterType, containerAsJavaAction, containerAsJavaActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.BooleanType")
@js.native
open class BooleanType protected () extends PrimitiveType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MBooleanType: BasicParameterType = js.native
  
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MBooleanType: JavaActionParameter = js.native
  
  @JSName("containerAsJavaAction")
  def containerAsJavaAction_MBooleanType: JavaAction = js.native
}
object BooleanType {
  
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.BooleanType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[BooleanType]
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: BasicParameterType): BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[BooleanType]
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  /* static member */
  inline def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionParameterUnderJavaType")(container.asInstanceOf[js.Any]).asInstanceOf[BooleanType]
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  inline def createInJavaActionUnderJavaReturnType(container: JavaAction): BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionUnderJavaReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[BooleanType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.BooleanType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.BooleanType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
