package typings
package mochaccinoLib.mochaccinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  var exposedProperties: js.Tuple3[
    mochaccinoLib.mochaccinoLibStrings.window, 
    mochaccinoLib.mochaccinoLibStrings.navigator, 
    mochaccinoLib.mochaccinoLibStrings.document
  ]
  def clear(): scala.Unit
  def create(): scala.Unit
  def destroy(): scala.Unit
}

