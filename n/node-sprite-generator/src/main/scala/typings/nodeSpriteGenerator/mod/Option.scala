package typings.nodeSpriteGenerator.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var compositor: js.UndefOr[BuiltinCompositors | Compositor] = js.native
  var compositorOptions: js.UndefOr[CompositorOption] = js.native
  var layout: js.UndefOr[BuiltinLayouts | LayoutFunc] = js.native
  var layoutOptions: js.UndefOr[LayoutOption] = js.native
  var spritePath: js.UndefOr[String] = js.native
  var src: js.UndefOr[js.Array[String]] = js.native
  var stylesheet: js.UndefOr[BuiltinStylesheetFormats | StylesheetFunc | String] = js.native
  var stylesheetOptions: js.UndefOr[StylesheetOption] = js.native
  var stylesheetPath: js.UndefOr[String] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
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
    def setCompositor(value: BuiltinCompositors | Compositor): Self = this.set("compositor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositor: Self = this.set("compositor", js.undefined)
    @scala.inline
    def setCompositorOptions(value: CompositorOption): Self = this.set("compositorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositorOptions: Self = this.set("compositorOptions", js.undefined)
    @scala.inline
    def setLayoutFunction3(
      value: (/* images */ js.Array[Image], /* options */ LayoutOption, /* callback */ js.Function2[/* error */ Error, /* layout */ Layout, Unit]) => Unit
    ): Self = this.set("layout", js.Any.fromFunction3(value))
    @scala.inline
    def setLayout(value: BuiltinLayouts | LayoutFunc): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLayoutOptions(value: LayoutOption): Self = this.set("layoutOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutOptions: Self = this.set("layoutOptions", js.undefined)
    @scala.inline
    def setSpritePath(value: String): Self = this.set("spritePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpritePath: Self = this.set("spritePath", js.undefined)
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    @scala.inline
    def setSrc(value: js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStylesheetFunction5(
      value: (/* layout */ Layout, /* stylesheetPath */ String, /* spritePath */ String, /* options */ StylesheetOption, /* callback */ js.Function1[/* error */ Error, Unit]) => Unit
    ): Self = this.set("stylesheet", js.Any.fromFunction5(value))
    @scala.inline
    def setStylesheet(value: BuiltinStylesheetFormats | StylesheetFunc | String): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
    @scala.inline
    def setStylesheetOptions(value: StylesheetOption): Self = this.set("stylesheetOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesheetOptions: Self = this.set("stylesheetOptions", js.undefined)
    @scala.inline
    def setStylesheetPath(value: String): Self = this.set("stylesheetPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesheetPath: Self = this.set("stylesheetPath", js.undefined)
  }
  
}

