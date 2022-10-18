package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.18.0: introduced
  */
@js.native
trait IRemoteEntitySourceDocument
  extends StObject
     with IDocument {
  
  /**
    * In version 8.12.0: added public
    * In version 8.11.0: introduced
    */
  val applicationId: String = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  val endpointId: String = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  val environmentType: EnvironmentType = js.native
  
  /**
    * In version 8.11.0: added public
    * In version 8.10.0: introduced
    */
  val icon: String | Null = js.native
  
  /**
    * In version 8.16.0: introduced
    */
  val metadataHash: String = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  val minimumMxVersion: String = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  val recommendedMxVersion: String = js.native
  
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  val serviceName: String = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  val validated: Boolean = js.native
  
  /**
    * In version 9.8.0: introduced
    */
  val validatedEntities: IList[String] = js.native
  
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  val version: String = js.native
}
