package typings.next.documentMod

import typings.nextDashServer.routerMod.DefaultQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/document", JSImport.Default)
@js.native
class default[P] () extends Document[P]

/* static members */
@JSImport("next/document", JSImport.Default)
@js.native
object default extends js.Object {
  def getInitialProps(context: NextDocumentContext[DefaultQuery, js.Object]): DefaultDocumentIProps | js.Promise[DefaultDocumentIProps] = js.native
}

