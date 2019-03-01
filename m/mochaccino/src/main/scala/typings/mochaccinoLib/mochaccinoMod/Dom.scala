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

object Dom {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    create: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    exposedProperties: js.Tuple3[
      mochaccinoLib.mochaccinoLibStrings.window, 
      mochaccinoLib.mochaccinoLibStrings.navigator, 
      mochaccinoLib.mochaccinoLibStrings.document
    ]
  ): Dom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("exposedProperties")(exposedProperties)
    __obj.asInstanceOf[Dom]
  }
}

