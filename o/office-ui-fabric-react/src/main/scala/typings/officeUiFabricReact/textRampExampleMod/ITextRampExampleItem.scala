package typings.officeUiFabricReact.textRampExampleMod

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextRampExampleItem extends js.Object {
  var example: Element
  var key: String
  var variant: String
}

object ITextRampExampleItem {
  @scala.inline
  def apply(example: Element, key: String, variant: String): ITextRampExampleItem = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITextRampExampleItem]
  }
}

