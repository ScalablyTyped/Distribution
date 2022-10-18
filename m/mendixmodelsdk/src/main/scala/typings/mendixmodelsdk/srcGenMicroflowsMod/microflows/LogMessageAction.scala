package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/log-message relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LogMessageAction")
@js.native
open class LogMessageAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def includeLatestStackTrace: Boolean = js.native
  def includeLatestStackTrace_=(newValue: Boolean): Unit = js.native
  
  def level: LogLevel = js.native
  def level_=(newValue: LogLevel): Unit = js.native
  
  def messageTemplate: StringTemplate = js.native
  def messageTemplate_=(newValue: StringTemplate): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def node: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.8.0: deleted
    * In version 7.9.0: introduced
    */
  def nodeModel: Expression = js.native
  def nodeModel_=(newValue: Expression): Unit = js.native
  
  def node_=(newValue: String): Unit = js.native
}
object LogMessageAction {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LogMessageAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LogMessageAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): LogMessageAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[LogMessageAction]
  
  /**
    * Creates and returns a new LogMessageAction instance in the SDK and on the server.
    * The new LogMessageAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  /* static member */
  inline def createIn(container: ActionActivity): LogMessageAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[LogMessageAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LogMessageAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LogMessageAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
