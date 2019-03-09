package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait External extends js.Object {
  /** @deprecated */
  def AddSearchProvider(): scala.Unit
  /** @deprecated */
  def IsSearchProviderInstalled(): scala.Unit
}

object External {
  @scala.inline
  def apply(AddSearchProvider: js.Function0[scala.Unit], IsSearchProviderInstalled: js.Function0[scala.Unit]): External = {
    val __obj = js.Dynamic.literal(AddSearchProvider = AddSearchProvider, IsSearchProviderInstalled = IsSearchProviderInstalled)
  
    __obj.asInstanceOf[External]
  }
}

