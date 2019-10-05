package typings.mendixmodelsdk.distGenMappingsMod.mappings

import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement")
@js.native
abstract class ObjectMappingElement protected () extends MappingElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var association: IAssociationBase | Null = js.native
  val associationQualifiedName: String | Null = js.native
  val children: IList[MappingElement] = js.native
  var entity: IEntity | Null = js.native
  val entityQualifiedName: String | Null = js.native
  /**
    * In version 6.4.0: introduced
    */
  var isDefaultType: Boolean = js.native
  var mappingMicroflowCall: MappingMicroflowCall | Null = js.native
  var objectHandling: ObjectHandlingEnum = js.native
  var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
  /**
    * In version 7.17.0: introduced
    */
  var objectHandlingBackupAllowOverride: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement")
@js.native
object ObjectMappingElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

