package typings
package mochaDashPhantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def mochaPhantomJS(): MochaPhantomJsWindowOptions
}

object Window {
  @scala.inline
  def apply(mochaPhantomJS: js.Function0[MochaPhantomJsWindowOptions]): Window = {
    val __obj = js.Dynamic.literal(mochaPhantomJS = mochaPhantomJS)
  
    __obj.asInstanceOf[Window]
  }
}

