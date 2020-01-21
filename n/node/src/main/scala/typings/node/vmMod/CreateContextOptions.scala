package typings.node.vmMod

import typings.node.AnonStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContextOptions extends js.Object {
  var codeGeneration: js.UndefOr[AnonStrings] = js.undefined
  /**
    * Human-readable name of the newly created context.
    * @default 'VM Context i' Where i is an ascending numerical index of the created context.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Corresponds to the newly created context for display purposes.
    * The origin should be formatted like a `URL`, but with only the scheme, host, and port (if necessary),
    * like the value of the `url.origin` property of a URL object.
    * Most notably, this string should omit the trailing slash, as that denotes a path.
    * @default ''
    */
  var origin: js.UndefOr[String] = js.undefined
}

object CreateContextOptions {
  @scala.inline
  def apply(codeGeneration: AnonStrings = null, name: String = null, origin: String = null): CreateContextOptions = {
    val __obj = js.Dynamic.literal()
    if (codeGeneration != null) __obj.updateDynamic("codeGeneration")(codeGeneration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContextOptions]
  }
}

