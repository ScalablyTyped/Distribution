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

