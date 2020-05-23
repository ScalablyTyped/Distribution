package typings.pdfjsDist.mod

import typings.pdfjsDist.anon.CMapData
import typings.pdfjsDist.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMapReader extends js.Object {
  def fetch(params: Name): js.Promise[CMapData]
}

object CMapReader {
  @scala.inline
  def apply(fetch: Name => js.Promise[CMapData]): CMapReader = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[CMapReader]
  }
}

