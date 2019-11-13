package typings.next

import typings.next.distLibDataMod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/lib/data", JSImport.Namespace)
@js.native
object distLibDataMod extends js.Object {
  def createHook(fetcher: js.Function1[/* repeated */ Args, js.Promise[_]], options: Anon_Key): js.Function1[/* repeated */ String | Double, _] = js.native
  type Args = String | Double | (js.Array[String | Double])
}

