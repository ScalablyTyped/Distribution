package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import typings.mendixmodelsdk.instancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Rest`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-odata-services relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.18.0: introduced
  */
@js.native
trait IConsumedODataService extends IRemoteEntitySourceDocument {
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.9.0: added public
    */
  val entities: IList[IODataEntity] = js.native
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

