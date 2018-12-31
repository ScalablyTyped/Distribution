package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Test` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Test.html
  */
@JSGlobal("Mocha.Test")
@js.native
class Test () extends Runnable {
   // added by reporters
  var err: js.UndefOr[nodeLib.Error] = js.native
  var speed: js.UndefOr[
    mochaLib.mochaLibStrings.slow | mochaLib.mochaLibStrings.medium | mochaLib.mochaLibStrings.fast
  ] = js.native
  var `type`: mochaLib.mochaLibStrings.test = js.native
}

