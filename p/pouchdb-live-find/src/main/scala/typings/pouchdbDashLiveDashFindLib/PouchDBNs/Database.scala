package typings
package pouchdbDashLiveDashFindLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database[Content /* <: js.Object */] extends js.Object {
  def liveFind(requestDef: pouchdbDashLiveDashFindLib.PouchDBNs.LiveFindNs.RequestDef[Content]): pouchdbDashLiveDashFindLib.PouchDBNs.LiveFindNs.LiveFeed[Content]
}

object Database {
  @scala.inline
  def apply[Content /* <: js.Object */](
    liveFind: pouchdbDashLiveDashFindLib.PouchDBNs.LiveFindNs.RequestDef[Content] => pouchdbDashLiveDashFindLib.PouchDBNs.LiveFindNs.LiveFeed[Content]
  ): Database[Content] = {
    val __obj = js.Dynamic.literal(liveFind = js.Any.fromFunction1(liveFind))
  
    __obj.asInstanceOf[Database[Content]]
  }
}

