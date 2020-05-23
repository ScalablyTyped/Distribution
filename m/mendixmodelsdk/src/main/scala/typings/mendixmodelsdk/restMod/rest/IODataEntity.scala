package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.9.0: added public
  * In version 7.18.0: introduced
  */
@js.native
trait IODataEntity
  extends IElement
     with IByNameReferrable {
  val containerAsConsumedODataService: IConsumedODataService = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.9.0: introduced
    */
  val key: IODataKey | Null = js.native
  @JSName("model")
  val model_IODataEntity: IModel = js.native
  /**
    * In version 8.10.0: added public
    */
  val name: String = js.native
}

