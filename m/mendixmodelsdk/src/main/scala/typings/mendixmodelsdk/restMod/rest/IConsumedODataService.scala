package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Rest`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.18.0: introduced
  */
@js.native
trait IConsumedODataService extends IRemoteEntitySourceDocument {
  /**
    * In version 8.12.0: added public
    * In version 8.11.0: introduced
    */
  val applicationId: String = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  val serviceName: String = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  val version: String = js.native
}

