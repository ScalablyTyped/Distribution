package typings.mochaPhantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def mochaPhantomJS(): MochaPhantomJsWindowOptions
}

object Window {
  @scala.inline
  def apply(mochaPhantomJS: () => MochaPhantomJsWindowOptions): Window = {
    val __obj = js.Dynamic.literal(mochaPhantomJS = js.Any.fromFunction0(mochaPhantomJS))
  
    __obj.asInstanceOf[Window]
  }
}

