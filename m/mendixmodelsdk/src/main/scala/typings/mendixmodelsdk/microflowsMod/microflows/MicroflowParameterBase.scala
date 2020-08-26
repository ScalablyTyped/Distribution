package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.datatypesMod.datatypes.IDataType
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameterBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsMicroflow, containerAsRule, name, `type`, parameterType */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowParameterBase")
@js.native
abstract class MicroflowParameterBase protected ()
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
  @JSName("containerAsMicroflow")
  val containerAsMicroflow_FMicroflowParameterBase: IMicroflow = js.native
  @JSName("containerAsRule")
  val containerAsRule_FMicroflowParameterBase: IRule = js.native
  @JSName("model")
  var model_FMicroflowParameterBase: IModel = js.native
  @JSName("name")
  val name_FMicroflowParameterBase: String = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  @JSName("parameterType")
  val parameterType_FMicroflowParameterBase: IDataType = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  @JSName("type")
  val type_FMicroflowParameterBase: String | Null = js.native
  def containerAsMicroflow: Microflow = js.native
  def containerAsRule: Rule = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  /**
    * In version 7.9.0: introduced
    */
  def parameterType: DataType = js.native
  def parameterType_=(newValue: DataType): Unit = js.native
  @JSName("qualifiedName")
  def qualifiedName_MMicroflowParameterBase: String | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowParameterBase")
@js.native
object MicroflowParameterBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

