package typings.officeUiFabricReact.documentCardTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCard extends js.Object {
  /**
    * Sets focus to the DocumentCard.
    */
  def focus(): Unit
}

object IDocumentCard {
  @scala.inline
  def apply(focus: () => Unit): IDocumentCard = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[IDocumentCard]
  }
}

