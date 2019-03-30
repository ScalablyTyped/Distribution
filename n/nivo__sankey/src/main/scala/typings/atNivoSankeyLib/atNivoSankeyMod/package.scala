package typings
package atNivoSankeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoSankeyMod {
  type SankeyProps = stdLib.Partial[atNivoSankeyLib.Anon_Align]
  type SankeySortFunction = js.Function2[/* nodeA */ SankeyDataNode, /* nodeB */ SankeyDataNode, scala.Double]
}
