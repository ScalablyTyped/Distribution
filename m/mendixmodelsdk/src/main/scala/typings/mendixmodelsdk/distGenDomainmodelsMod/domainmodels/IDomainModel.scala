package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
  */
@js.native
trait IDomainModel extends IModuleDocument {
  val associations: IList[IAssociation] = js.native
  val crossAssociations: IList[ICrossAssociation] = js.native
  val entities: IList[IEntity] = js.native
}

