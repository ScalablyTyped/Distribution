package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenJavascriptactionsMod.javascriptactions.IJavaScriptAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.4.0: removed experimental
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaScriptActionCallAction")
@js.native
open class JavaScriptActionCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def javaScriptAction: IJavaScriptAction | Null = js.native
  
  def javaScriptActionQualifiedName: String | Null = js.native
  
  def javaScriptAction_=(newValue: IJavaScriptAction | Null): Unit = js.native
  
  def outputVariableName: String = js.native
  def outputVariableName_=(newValue: String): Unit = js.native
  
  def parameterMappings: IList[JavaScriptActionParameterMapping] = js.native
  
  def useReturnVariable: Boolean = js.native
  def useReturnVariable_=(newValue: Boolean): Unit = js.native
}
object JavaScriptActionCallAction {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaScriptActionCallAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaScriptActionCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): JavaScriptActionCallAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[JavaScriptActionCallAction]
  
  /**
    * Creates and returns a new JavaScriptActionCallAction instance in the SDK and on the server.
    * The new JavaScriptActionCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  inline def createIn(container: ActionActivity): JavaScriptActionCallAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[JavaScriptActionCallAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaScriptActionCallAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaScriptActionCallAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
