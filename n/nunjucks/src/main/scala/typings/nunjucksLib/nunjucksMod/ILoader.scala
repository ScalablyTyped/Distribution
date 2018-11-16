package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoader extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.native
  var extend: js.UndefOr[js.Function1[/* extender */ this.type, this.type]] = js.native
  def getSource(name: java.lang.String): LoaderSource = js.native
  def getSource(
    name: java.lang.String,
    callback: js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[LoaderSource], scala.Unit]
  ): scala.Unit = js.native
}

