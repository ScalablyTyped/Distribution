package typings.mendixmodelsdk.allModelClassesMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.12.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EntityCapabilities")
@js.native
class EntityCapabilities protected ()
  extends typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityCapabilities {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object EntityCapabilities {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EntityCapabilities")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EntityCapabilities instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EntityCapabilities.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityCapabilities = js.native
  
  /**
    * Creates and returns a new EntityCapabilities instance in the SDK and on the server.
    * The new EntityCapabilities will be automatically stored in the 'capabilities' property
    * of the parent Entity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EntityCapabilities.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity): typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityCapabilities = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EntityCapabilities.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EntityCapabilities.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
