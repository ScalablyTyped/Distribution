package typings.mendixmodelsdk.distGenNavigationMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavigationProfileBase
  extends IElement
     with IByNameReferrable {
  val containerAsNavigationDocument: INavigationDocument = js.native
  @JSName("model")
  val model_INavigationProfileBase: IModel = js.native
  /**
    * In version 7.2.0: introduced
    */
  val name: String = js.native
}

