package typings.mendixmodelsdk.datasetsMod.datasets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDataSet, name */ @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameter")
@js.native
class DataSetParameter protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsDataSet")
  val containerAsDataSet_FDataSetParameter: IDataSet = js.native
  @JSName("model")
  var model_FDataSetParameter: IModel = js.native
  @JSName("name")
  val name_FDataSetParameter: String = js.native
  def constraints: IList[DataSetParameterConstraint] = js.native
  def containerAsDataSet: DataSet = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  /**
    * In version 7.9.0: introduced
    */
  def parameterType: DataType = js.native
  /**
    * In version 7.9.0: introduced
    */
  def parameterTypeIsRange: Boolean = js.native
  def parameterTypeIsRange_=(newValue: Boolean): Unit = js.native
  def parameterType_=(newValue: DataType): Unit = js.native
  @JSName("qualifiedName")
  def qualifiedName_MDataSetParameter: String | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameter")
@js.native
object DataSetParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetParameter = js.native
  /**
    * Creates and returns a new DataSetParameter instance in the SDK and on the server.
    * The new DataSetParameter will be automatically stored in the 'parameters' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: DataSet): DataSetParameter = js.native
}

