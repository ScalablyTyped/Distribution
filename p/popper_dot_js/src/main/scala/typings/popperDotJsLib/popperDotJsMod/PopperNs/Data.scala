package typings
package popperDotJsLib.popperDotJsMod.PopperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var arrowElement: stdLib.Element
  var arrowStyles: stdLib.CSSStyleDeclaration
  var attributes: Attributes
  var boundaries: js.Object
  var flipped: scala.Boolean
  var hide: scala.Boolean
  var instance: popperDotJsLib.popperDotJsMod.Popper
  var offsets: popperDotJsLib.Anon_Arrow
  var originalPlacement: Placement
  var placement: Placement
  var styles: stdLib.CSSStyleDeclaration
}

object Data {
  @scala.inline
  def apply(
    arrowElement: stdLib.Element,
    arrowStyles: stdLib.CSSStyleDeclaration,
    attributes: Attributes,
    boundaries: js.Object,
    flipped: scala.Boolean,
    hide: scala.Boolean,
    instance: popperDotJsLib.popperDotJsMod.Popper,
    offsets: popperDotJsLib.Anon_Arrow,
    originalPlacement: Placement,
    placement: Placement,
    styles: stdLib.CSSStyleDeclaration
  ): Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrowElement")(arrowElement)
    __obj.updateDynamic("arrowStyles")(arrowStyles)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("boundaries")(boundaries)
    __obj.updateDynamic("flipped")(flipped)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("offsets")(offsets)
    __obj.updateDynamic("originalPlacement")(originalPlacement)
    __obj.updateDynamic("placement")(placement)
    __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Data]
  }
}

