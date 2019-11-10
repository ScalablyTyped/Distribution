package typings.pgDashPromise

import org.scalablytyped.runtime.Instantiable1
import typings.pgDashPromise.typescriptPgDashSubsetMod.IClient
import typings.pgDashPromise.typescriptPgDashSubsetMod.IConnectionParameters
import typings.pgDashPromise.typescriptPgDashSubsetMod.IDefaults
import typings.pgDashPromise.typescriptPgDashSubsetMod.ITypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpg extends js.Object {
  val Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient]
  val defaults: IDefaults
  val types: ITypes
}

object Typeofpg {
  @scala.inline
  def apply(
    Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient],
    defaults: IDefaults,
    types: ITypes
  ): Typeofpg = {
    val __obj = js.Dynamic.literal(Client = Client, defaults = defaults, types = types)
  
    __obj.asInstanceOf[Typeofpg]
  }
}

