package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/associations relevant section in reference guide}
  */
@js.native
trait IAssociationBase
  extends StObject
     with IElement
     with IByNameReferrable {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.0.1: deleted
    * In version 8.11.0: introduced
    */
  val capabilities: IAssociationCapabilities = js.native
  
  val containerAsDomainModel: IDomainModel = js.native
  
  /**
    * In version 9.10.0: added public
    */
  val documentation: String = js.native
  
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
