package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.22.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/workflows", "workflows.AbsoluteAmountUserInput")
@js.native
open class AbsoluteAmountUserInput protected () extends TargetUserInput {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def amount: Double = js.native
  def amount_=(newValue: Double): Unit = js.native
}
object AbsoluteAmountUserInput {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.AbsoluteAmountUserInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AbsoluteAmountUserInput instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): AbsoluteAmountUserInput = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AbsoluteAmountUserInput]
  
  /**
    * Creates and returns a new AbsoluteAmountUserInput instance in the SDK and on the server.
    * The new AbsoluteAmountUserInput will be automatically stored in the 'targetUserInput' property
    * of the parent MultiInputCompletion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 and higher
    */
  /* static member */
  inline def createIn(container: MultiInputCompletion): AbsoluteAmountUserInput = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[AbsoluteAmountUserInput]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.AbsoluteAmountUserInput.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.AbsoluteAmountUserInput.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
