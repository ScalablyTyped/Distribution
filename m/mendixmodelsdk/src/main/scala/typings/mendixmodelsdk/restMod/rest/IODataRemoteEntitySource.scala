package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IQueryBasedRemoteEntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.10.0: introduced
  */
@js.native
trait IODataRemoteEntitySource extends IQueryBasedRemoteEntitySource {
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  val key: IODataKey | Null = js.native
}

