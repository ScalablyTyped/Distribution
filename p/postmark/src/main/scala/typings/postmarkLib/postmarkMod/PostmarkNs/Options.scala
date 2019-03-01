package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends SimpleOptions {
  def requestFactory(options: SimpleOptions): js.Function4[
    /* path */ js.UndefOr[java.lang.String], 
    /* type */ js.UndefOr[java.lang.String], 
    /* content */ js.UndefOr[PostmarkMessage], 
    /* callback */ js.UndefOr[PostmarkCallback[_]], 
    _
  ]
}

object Options {
  @scala.inline
  def apply(
    requestFactory: js.Function1[
      SimpleOptions, 
      js.Function4[
        /* path */ js.UndefOr[java.lang.String], 
        /* type */ js.UndefOr[java.lang.String], 
        /* content */ js.UndefOr[PostmarkMessage], 
        /* callback */ js.UndefOr[PostmarkCallback[_]], 
        _
      ]
    ],
    requestHost: java.lang.String,
    ssl: scala.Boolean
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestFactory")(requestFactory)
    __obj.updateDynamic("requestHost")(requestHost)
    __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[Options]
  }
}

