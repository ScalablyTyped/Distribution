package typings.prettier.anon

import typings.prettier.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  var ownLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.undefined
  var remaining: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.undefined
}

object EndOfLine {
  @scala.inline
  def apply(
    endOfLine: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean = null,
    ownLine: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean = null,
    remaining: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean = null
  ): EndOfLine = {
    val __obj = js.Dynamic.literal()
    if (endOfLine != null) __obj.updateDynamic("endOfLine")(js.Any.fromFunction5(endOfLine))
    if (ownLine != null) __obj.updateDynamic("ownLine")(js.Any.fromFunction5(ownLine))
    if (remaining != null) __obj.updateDynamic("remaining")(js.Any.fromFunction5(remaining))
    __obj.asInstanceOf[EndOfLine]
  }
}

