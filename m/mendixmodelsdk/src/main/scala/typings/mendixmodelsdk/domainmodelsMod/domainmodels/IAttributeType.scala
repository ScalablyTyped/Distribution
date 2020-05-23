package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.restMod.rest.IODataKeyPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAttributeType extends IElement {
  val containerAsAttribute: IAttribute = js.native
  val containerAsEntityKeyPart: IEntityKeyPart = js.native
  val containerAsODataKeyPart: IODataKeyPart = js.native
  @JSName("model")
  val model_IAttributeType: IModel = js.native
}

