package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.NanoflowCall")
@js.native
class NanoflowCall protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsNanoflowCallAction: NanoflowCallAction = js.native
  
  def nanoflow: INanoflow | Null = js.native
  
  def nanoflowQualifiedName: String | Null = js.native
  
  def nanoflow_=(newValue: INanoflow | Null): Unit = js.native
  
  def parameterMappings: IList[NanoflowCallParameterMapping] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.NanoflowCall")
@js.native
object NanoflowCall extends js.Object {
  
  /**
    * Creates and returns a new NanoflowCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NanoflowCall = js.native
  
  /**
    * Creates and returns a new NanoflowCall instance in the SDK and on the server.
    * The new NanoflowCall will be automatically stored in the 'nanoflowCall' property
    * of the parent NanoflowCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: NanoflowCallAction): NanoflowCall = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
