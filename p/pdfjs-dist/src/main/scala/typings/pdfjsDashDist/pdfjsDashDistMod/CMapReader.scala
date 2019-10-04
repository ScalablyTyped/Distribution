package typings.pdfjsDashDist.pdfjsDashDistMod

import typings.pdfjsDashDist.Anon_CMapData
import typings.pdfjsDashDist.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMapReader extends js.Object {
  def fetch(params: Anon_Name): js.Promise[Anon_CMapData]
}

object CMapReader {
  @scala.inline
  def apply(fetch: Anon_Name => js.Promise[Anon_CMapData]): CMapReader = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
  
    __obj.asInstanceOf[CMapReader]
  }
}

