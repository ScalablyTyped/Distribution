package typings.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesheetOption extends js.Object {
  var nameMapping: js.UndefOr[js.Function0[String]] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var spritePath: js.UndefOr[String] = js.native
}

object StylesheetOption {
  @scala.inline
  def apply(): StylesheetOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesheetOption]
  }
  @scala.inline
  implicit class StylesheetOptionOps[Self <: StylesheetOption] (val x: Self) extends AnyVal {
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
    def setNameMapping(value: () => String): Self = this.set("nameMapping", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNameMapping: Self = this.set("nameMapping", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSpritePath(value: String): Self = this.set("spritePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpritePath: Self = this.set("spritePath", js.undefined)
  }
  
}

