package typings.nes.mod

import typings.nes.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NesClassExports extends js.Object {
  var Client: AnonInstantiable
}

object NesClassExports {
  @scala.inline
  def apply(Client: AnonInstantiable): NesClassExports = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[NesClassExports]
  }
}

