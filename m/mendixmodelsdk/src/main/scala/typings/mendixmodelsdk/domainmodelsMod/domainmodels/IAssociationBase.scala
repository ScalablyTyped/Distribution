package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/associations relevant section in reference guide}
  */
@js.native
trait IAssociationBase
  extends IElement
     with IByNameReferrable {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.11.0: introduced
    */
  val capabilities: IAssociationCapabilities = js.native
  
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
    * @ignore
    *
    * In version 8.10.0: deleted
    * In version 8.3.0: introduced
    */
  val remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  
  val remoteSourceDocumentQualifiedName: String | Null = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  val source: IAssociationSource | Null = js.native
  
  val `type`: AssociationType = js.native
}
