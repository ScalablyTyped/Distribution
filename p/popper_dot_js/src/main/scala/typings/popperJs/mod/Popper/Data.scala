package typings.popperJs.mod.Popper

import typings.popperJs.anon.Arrow
import typings.std.CSSStyleDeclaration
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  var arrowElement: Element = js.native
  var arrowStyles: CSSStyleDeclaration = js.native
  var attributes: Attributes = js.native
  var boundaries: js.Object = js.native
  var flipped: Boolean = js.native
  var hide: Boolean = js.native
  var instance: typings.popperJs.mod.Popper = js.native
  var offsets: Arrow = js.native
  var originalPlacement: Placement = js.native
  var placement: Placement = js.native
  var styles: CSSStyleDeclaration = js.native
}

object Data {
  @scala.inline
  def apply(
    arrowElement: Element,
    arrowStyles: CSSStyleDeclaration,
    attributes: Attributes,
    boundaries: js.Object,
    flipped: Boolean,
    hide: Boolean,
    instance: typings.popperJs.mod.Popper,
    offsets: Arrow,
    originalPlacement: Placement,
    placement: Placement,
    styles: CSSStyleDeclaration
  ): Data = {
    val __obj = js.Dynamic.literal(arrowElement = arrowElement.asInstanceOf[js.Any], arrowStyles = arrowStyles.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], flipped = flipped.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], originalPlacement = originalPlacement.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrowElement(value: Element): Self = this.set("arrowElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowStyles(value: CSSStyleDeclaration): Self = this.set("arrowStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundaries(value: js.Object): Self = this.set("boundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlipped(value: Boolean): Self = this.set("flipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: typings.popperJs.mod.Popper): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsets(value: Arrow): Self = this.set("offsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalPlacement(value: Placement): Self = this.set("originalPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: CSSStyleDeclaration): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

