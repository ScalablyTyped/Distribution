package typings.mendixmodelsdk.datasetsMod.datasets

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterAccess")
@js.native
class DataSetParameterAccess protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def constraintAccessList: IList[DataSetConstraintAccess] = js.native
  
  def containerAsDataSetModuleRoleAccess: DataSetModuleRoleAccess = js.native
  
  def parameterName: String = js.native
  def parameterName_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterAccess")
@js.native
object DataSetParameterAccess extends js.Object {
  
  /**
    * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetParameterAccess = js.native
  
  /**
    * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
    * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
    * of the parent DataSetModuleRoleAccess element passed as argument.
    */
  def createIn(container: DataSetModuleRoleAccess): DataSetParameterAccess = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
