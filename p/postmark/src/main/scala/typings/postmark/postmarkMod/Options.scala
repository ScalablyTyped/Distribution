package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends SimpleOptions {
  def requestFactory(options: SimpleOptions): js.Function4[
    /* path */ js.UndefOr[String], 
    /* type */ js.UndefOr[String], 
    /* content */ js.UndefOr[PostmarkMessage], 
    /* callback */ js.UndefOr[PostmarkCallback[_]], 
    _
  ]
}

object Options {
  @scala.inline
  def apply(
    requestFactory: SimpleOptions => js.Function4[
      /* path */ js.UndefOr[String], 
      /* type */ js.UndefOr[String], 
      /* content */ js.UndefOr[PostmarkMessage], 
      /* callback */ js.UndefOr[PostmarkCallback[_]], 
      _
    ],
    requestHost: String,
    ssl: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(requestFactory = js.Any.fromFunction1(requestFactory), requestHost = requestHost, ssl = ssl)
  
    __obj.asInstanceOf[Options]
  }
}

