package typings.prettier.anon

import typings.prettier.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndOfLine extends js.Object {
  var endOfLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.native
  var ownLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.native
  var remaining: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.native
}

object EndOfLine {
  @scala.inline
  def apply(): EndOfLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndOfLine]
  }
  @scala.inline
  implicit class EndOfLineOps[Self <: EndOfLine] (val x: Self) extends AnyVal {
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
    def setEndOfLine(
      value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean
    ): Self = this.set("endOfLine", js.Any.fromFunction5(value))
    @scala.inline
    def deleteEndOfLine: Self = this.set("endOfLine", js.undefined)
    @scala.inline
    def setOwnLine(
      value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean
    ): Self = this.set("ownLine", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOwnLine: Self = this.set("ownLine", js.undefined)
    @scala.inline
    def setRemaining(
      value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean
    ): Self = this.set("remaining", js.Any.fromFunction5(value))
    @scala.inline
    def deleteRemaining: Self = this.set("remaining", js.undefined)
  }
  
}

