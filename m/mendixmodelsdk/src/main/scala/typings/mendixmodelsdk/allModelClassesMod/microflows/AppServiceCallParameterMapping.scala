package typings.mendixmodelsdk.allModelClassesMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.AppServiceCallParameterMapping")
@js.native
class AppServiceCallParameterMapping protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AppServiceCallParameterMapping {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.AppServiceCallParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.AppServiceCallParameterMapping.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping = js.native
  
  /**
    * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
    * The new AppServiceCallParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent AppServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.AppServiceCallParameterMapping.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.AppServiceCallAction): typings.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.AppServiceCallParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.AppServiceCallParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
