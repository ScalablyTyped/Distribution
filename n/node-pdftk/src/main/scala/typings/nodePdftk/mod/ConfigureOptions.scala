package typings.nodePdftk.mod

import typings.nodePdftk.nodePdftkBooleans.`true`
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  var Promise: PromiseConstructor
  var bin: String
  var ignoreWarnings: `true`
  var tempDir: String
}

object ConfigureOptions {
  @scala.inline
  def apply(Promise: PromiseConstructor, bin: String, ignoreWarnings: `true`, tempDir: String): ConfigureOptions = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], ignoreWarnings = ignoreWarnings.asInstanceOf[js.Any], tempDir = tempDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureOptions]
  }
}

