package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

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

/**
  * See: {@link https://docs.mendix.com/refguide/metrics-counter relevant section in reference guide}
  *
  * In version 9.7.0: removed experimental
  * In version 9.5.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.CounterMeterAction")
@js.native
open class CounterMeterAction protected () extends MeterAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def value: String = js.native
  def value_=(newValue: String): Unit = js.native
}
object CounterMeterAction {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.CounterMeterAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CounterMeterAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): CounterMeterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CounterMeterAction]
  
  /**
    * Creates and returns a new CounterMeterAction instance in the SDK and on the server.
    * The new CounterMeterAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.5.0 and higher
    */
  /* static member */
  inline def createIn(container: ActionActivity): CounterMeterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CounterMeterAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.CounterMeterAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.CounterMeterAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
