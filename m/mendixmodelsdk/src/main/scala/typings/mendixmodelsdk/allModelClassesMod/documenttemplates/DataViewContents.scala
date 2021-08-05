package typings.mendixmodelsdk.allModelClassesMod.documenttemplates

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataViewContents")
@js.native
class DataViewContents protected ()
  extends typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataViewContents {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DataViewContents {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataViewContents")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataViewContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataViewContents = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataViewContents]
  
  /**
    * Creates and returns a new DataViewContents instance in the SDK and on the server.
    * The new DataViewContents will be automatically stored in the 'contents' property
    * of the parent DataView element passed as argument.
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataView): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataViewContents = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataViewContents]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataViewContents.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataViewContents.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
