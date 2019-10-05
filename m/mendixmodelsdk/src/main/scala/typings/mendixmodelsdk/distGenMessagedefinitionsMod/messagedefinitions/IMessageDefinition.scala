package typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
@js.native
trait IMessageDefinition
  extends IElement
     with IByNameReferrable {
  val containerAsMessageDefinitionCollection: IMessageDefinitionCollection = js.native
  @JSName("model")
  val model_IMessageDefinition: IModel = js.native
  val name: String = js.native
}

