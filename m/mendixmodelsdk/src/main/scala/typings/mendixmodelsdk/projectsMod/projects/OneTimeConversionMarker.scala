package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/projects", "projects.OneTimeConversionMarker")
@js.native
open class OneTimeConversionMarker protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsProjectConversion: ProjectConversion = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
}
object OneTimeConversionMarker {
  
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.OneTimeConversionMarker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): OneTimeConversionMarker = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[OneTimeConversionMarker]
  
  /**
    * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
    * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
    * of the parent ProjectConversion element passed as argument.
    */
  /* static member */
  inline def createIn(container: ProjectConversion): OneTimeConversionMarker = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[OneTimeConversionMarker]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.OneTimeConversionMarker.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.OneTimeConversionMarker.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
