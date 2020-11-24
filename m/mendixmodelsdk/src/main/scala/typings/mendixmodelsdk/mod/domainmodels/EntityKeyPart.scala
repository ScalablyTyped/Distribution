package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.9.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.EntityKeyPart")
@js.native
class EntityKeyPart protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.EntityKeyPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "domainmodels.EntityKeyPart")
@js.native
object EntityKeyPart extends js.Object {
  
  /**
    * Creates and returns a new EntityKeyPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityKeyPart = js.native
  
  /**
    * Creates and returns a new EntityKeyPart instance in the SDK and on the server.
    * The new EntityKeyPart will be automatically stored in the 'parts' property
    * of the parent EntityKey element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityKey): typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityKeyPart = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
