package typings.parse5SaxParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAXParserOptions extends js.Object {
  /**
    * Enables source code location information for the tokens.
    * When enabled, each token event handler will receive {@link Location} (or {@link StartTagLocation})
    * object as its last argument.
    */
  var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined
}

object SAXParserOptions {
  @scala.inline
  def apply(sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined): SAXParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sourceCodeLocationInfo)) __obj.updateDynamic("sourceCodeLocationInfo")(sourceCodeLocationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXParserOptions]
  }
}

