package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.11.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.AssociationCapabilities")
@js.native
class AssociationCapabilities protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.AssociationCapabilities {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AssociationCapabilities {
  
  @JSImport("mendixmodelsdk", "domainmodels.AssociationCapabilities")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AssociationCapabilities instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationCapabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationCapabilities]
  
  /**
    * Creates and returns a new AssociationCapabilities instance in the SDK and on the server.
    * The new AssociationCapabilities will be automatically stored in the 'capabilities' property
    * of the parent AssociationBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  /* static member */
  @scala.inline
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationBase): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationCapabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationCapabilities]
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationCapabilities.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationCapabilities.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
