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
- typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IPrimitiveType because Already inherited
- typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IIntegerType because var conflicts: containerAsBasicParameterType, containerAsCodeAction, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.IntegerType")
@js.native
open class IntegerType protected () extends PrimitiveType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MIntegerType: BasicParameterType = js.native
  
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MIntegerType: CodeAction = js.native
}
object IntegerType {
  
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.IntegerType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IntegerType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[IntegerType]
  
  /**
    * Creates and returns a new IntegerType instance in the SDK and on the server.
    * The new IntegerType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInBasicParameterTypeUnderType(container: BasicParameterType): IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicParameterTypeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[IntegerType]
  
  /**
    * Creates and returns a new IntegerType instance in the SDK and on the server.
    * The new IntegerType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInCodeActionUnderActionReturnType(container: CodeAction): IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[IntegerType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.IntegerType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.IntegerType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
