package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/document", JSImport.Default)
@js.native
class default[P] () extends Document[P]

@JSImport("next/document", JSImport.Default)
@js.native
object default extends js.Object {
  def getInitialProps(context: nextLib.documentMod.NextDocumentContext[nextDashServerLib.routerMod.DefaultQuery]): nextLib.documentMod.DefaultDocumentIProps | js.Promise[nextLib.documentMod.DefaultDocumentIProps] = js.native
}

