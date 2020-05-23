package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.instancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.9.0: introduced
  */
@js.native
trait IEntityKey extends IElement {
  @JSName("model")
  val model_IEntityKey: IModel = js.native
  val parts: IList[IEntityKeyPart] = js.native
}

