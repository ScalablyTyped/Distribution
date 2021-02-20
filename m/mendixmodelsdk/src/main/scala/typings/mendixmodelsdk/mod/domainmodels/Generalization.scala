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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.Generalization")
@js.native
class Generalization protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.Generalization {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Generalization {
  
  @JSImport("mendixmodelsdk", "domainmodels.Generalization")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Generalization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.Generalization.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.Generalization = js.native
  
  /**
    * Creates and returns a new Generalization instance in the SDK and on the server.
    * The new Generalization will be automatically stored in the 'generalization' property
    * of the parent Entity element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.Generalization.createIn")
  @js.native
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity): typings.mendixmodelsdk.domainmodelsMod.domainmodels.Generalization = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.Generalization.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.Generalization.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
