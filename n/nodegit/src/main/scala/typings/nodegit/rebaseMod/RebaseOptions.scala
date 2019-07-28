package typings.nodegit.rebaseMod

import typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebaseOptions extends js.Object {
  var checkoutOptions: CheckoutOptions
  var quiet: Double
  var rewriteNotesRef: String
  var version: Double
}

object RebaseOptions {
  @scala.inline
  def apply(checkoutOptions: CheckoutOptions, quiet: Double, rewriteNotesRef: String, version: Double): RebaseOptions = {
    val __obj = js.Dynamic.literal(checkoutOptions = checkoutOptions, quiet = quiet, rewriteNotesRef = rewriteNotesRef, version = version)
  
    __obj.asInstanceOf[RebaseOptions]
  }
}

