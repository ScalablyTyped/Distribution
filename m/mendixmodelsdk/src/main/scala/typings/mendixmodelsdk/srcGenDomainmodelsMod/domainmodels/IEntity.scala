package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcCommonMod.common.IPoint
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/entities relevant section in reference guide}
  */
@js.native
trait IEntity
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val attributes: IList[IAttribute] = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.0.1: deleted
    * In version 8.12.0: introduced
    */
  val capabilities: IEntityCapabilities = js.native
  
  val containerAsDomainModel: IDomainModel = js.native
  
  /**
    * In version 9.10.0: added public
    */
  val documentation: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val generalization: IGeneralizationBase = js.native
  
  /**
    * In version 8.10.0: deleted
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  val isRemote: Boolean = js.native
  
  /**
    * In version 9.10.0: added public
    */
  val location: IPoint = js.native
  
  @JSName("model")
  val model_IEntity: IModel = js.native
  
  val name: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.10.0: deleted
    * In version 8.2.0: introduced
    */
  val remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  
  val remoteSourceDocumentQualifiedName: String | Null = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  val source: IEntitySource | Null = js.native
}
