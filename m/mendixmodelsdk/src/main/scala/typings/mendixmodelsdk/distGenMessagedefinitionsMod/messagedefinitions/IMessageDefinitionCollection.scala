package typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions

import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
@js.native
trait IMessageDefinitionCollection extends IDocument {
  val messageDefinitions: IList[IMessageDefinition] = js.native
}

