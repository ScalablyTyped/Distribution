package typings.mdnDashBrowserDashCompatDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CompatData = CompatDataBrowsers with CompatDataIdentifiers
  type Identifier = PrimaryIdentifier with IdentifierMeta
  type SupportStatement = SimpleSupportStatement | js.Array[SimpleSupportStatement]
  type VersionValue = String | Boolean | Null
}
