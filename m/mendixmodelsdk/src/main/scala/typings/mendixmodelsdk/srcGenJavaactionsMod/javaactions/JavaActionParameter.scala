package typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.CodeAction
import typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.CodeActionParameter
import typings.mendixmodelsdk.srcGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.ICodeActionParameter because Already inherited
- typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IJavaActionParameter because var conflicts: actionParameterType, containerAsCodeAction, containerAsJavaAction, description, id, isLoaded, isRequired, model, name, qualifiedName, structureTypeName, unit. Inlined `type`, javaType, parameterType */ @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.JavaActionParameter")
@js.native
open class JavaActionParameter protected () extends CodeActionParameter {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MJavaActionParameter: CodeAction = js.native
  
  @JSName("containerAsJavaAction")
  def containerAsJavaAction_MJavaActionParameter: JavaAction = js.native
  
  /**
    * In version 6.7.0: deleted
    * In version 6.6.0: introduced
    */
  def javaType: Type = js.native
  def javaType_=(newValue: Type): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.7.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("javaType")
  val javaType_FJavaActionParameter: IType = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  def parameterType: ParameterType = js.native
  def parameterType_=(newValue: ParameterType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @JSName("parameterType")
  val parameterType_FJavaActionParameter: IParameterType = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  @JSName("type")
  val type_FJavaActionParameter: String | Null = js.native
}
object JavaActionParameter {
  
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.JavaActionParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): JavaActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[JavaActionParameter]
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'actionParameters' property
    * of the parent codeactions.CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createInCodeActionUnderActionParameters(container: CodeAction): JavaActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCodeActionUnderActionParameters")(container.asInstanceOf[js.Any]).asInstanceOf[JavaActionParameter]
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'parameters' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.20.0
    */
  /* static member */
  inline def createInJavaActionUnderParameters(container: JavaAction): JavaActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[JavaActionParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.JavaActionParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.JavaActionParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
