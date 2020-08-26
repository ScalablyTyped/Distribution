package typings.postcss.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Syntax extends js.Object {
  /**
    * Function to generate AST by string.
    */
  var parse: js.UndefOr[Parser] = js.native
  /**
    * Class to generate string by AST.
    */
  var stringify: js.UndefOr[Stringifier] = js.native
}

object Syntax {
  @scala.inline
  def apply(): Syntax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Syntax]
  }
  @scala.inline
  implicit class SyntaxOps[Self <: Syntax] (val x: Self) extends AnyVal {
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
    def setParse(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = this.set("parse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setStringify(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = this.set("stringify", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
  }
  
}

