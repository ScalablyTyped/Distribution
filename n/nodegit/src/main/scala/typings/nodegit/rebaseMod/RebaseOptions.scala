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
    val __obj = js.Dynamic.literal(checkoutOptions = checkoutOptions.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], rewriteNotesRef = rewriteNotesRef.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RebaseOptions]
  }
}

