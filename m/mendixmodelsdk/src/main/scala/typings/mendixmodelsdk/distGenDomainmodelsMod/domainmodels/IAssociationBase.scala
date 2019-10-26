package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
  */
@js.native
trait IAssociationBase
  extends IElement
     with IByNameReferrable {
  val containerAsDomainModel: IDomainModel = js.native
  @JSName("model")
  val model_IAssociationBase: IModel = js.native
  val name: String = js.native
  val owner: AssociationOwner = js.native
  /**
    * This property is required and cannot be set to null.
    */
  val parent: IEntity = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.3.0: introduced
    */
  val remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  val remoteSourceDocumentQualifiedName: String | Null = js.native
  val `type`: AssociationType = js.native
}

