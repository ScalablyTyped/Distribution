package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distCommonMod.common.IPoint
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/annotations relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Annotation")
@js.native
class Annotation protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAnnotation: IModel = js.native
  def caption(): String = js.native
  def caption(newValue: String): js.Any = js.native
  def containerAsDomainModel(): DomainModel = js.native
  def location(): IPoint = js.native
  def location(newValue: IPoint): js.Any = js.native
  def width(): Double = js.native
  def width(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Annotation")
@js.native
object Annotation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Annotation = js.native
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * The new Annotation will be automatically stored in the 'annotations' property
    * of the parent DomainModel element passed as argument.
    */
  def createIn(container: DomainModel): Annotation = js.native
}

