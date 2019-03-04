package typings
package nodegitLib.rebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebaseOptions extends js.Object {
  var checkoutOptions: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  var quiet: scala.Double
  var rewriteNotesRef: java.lang.String
  var version: scala.Double
}

object RebaseOptions {
  @scala.inline
  def apply(
    checkoutOptions: nodegitLib.checkoutDashOptionsMod.CheckoutOptions,
    quiet: scala.Double,
    rewriteNotesRef: java.lang.String,
    version: scala.Double
  ): RebaseOptions = {
    val __obj = js.Dynamic.literal(checkoutOptions = checkoutOptions, quiet = quiet, rewriteNotesRef = rewriteNotesRef, version = version)
  
    __obj.asInstanceOf[RebaseOptions]
  }
}

