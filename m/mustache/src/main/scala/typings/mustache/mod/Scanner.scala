package typings.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple string scanner that is used by the template parser to find tokens in template strings.
  */
@JSImport("mustache", "Scanner")
@js.native
class Scanner protected () extends MustacheScanner {
  /**
    * Initializes a new instance of the `MustacheScanner` class.
    */
  def this(string: String) = this()
}

