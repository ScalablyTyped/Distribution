package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.ExpressionSplitCondition")
@js.native
open class ExpressionSplitCondition protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows.ExpressionSplitCondition {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ExpressionSplitCondition {
  
  @JSImport("mendixmodelsdk", "microflows.ExpressionSplitCondition")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ExpressionSplitCondition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExpressionSplitCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExpressionSplitCondition]
  
  /**
    * Creates and returns a new ExpressionSplitCondition instance in the SDK and on the server.
    * The new ExpressionSplitCondition will be automatically stored in the 'splitCondition' property
    * of the parent ExclusiveSplit element passed as argument.
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExclusiveSplit): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExpressionSplitCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExpressionSplitCondition]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ExpressionSplitCondition.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ExpressionSplitCondition.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
