package typings.page.PageJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * bind to click events (default = true)
    */
  var click: Boolean
  /**
    * remove URL encoding frfrom path components
    */
  var decodeURLComponents: Boolean
  /**
    * perform initial dispatch (default = true)
    */
  var dispatch: Boolean
  /**
    * add #!before urls (default = false)
    */
  var hashbang: Boolean
  /**
    * bind to popstate (default = true)
    */
  var popstate: Boolean
}

object Options {
  @scala.inline
  def apply(
    click: Boolean,
    decodeURLComponents: Boolean,
    dispatch: Boolean,
    hashbang: Boolean,
    popstate: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], decodeURLComponents = decodeURLComponents.asInstanceOf[js.Any], dispatch = dispatch.asInstanceOf[js.Any], hashbang = hashbang.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

