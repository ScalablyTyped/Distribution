package typings.pouchdbDashLiveDashFind.PouchDBNs.LiveFindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof pouchdb-find.PouchDB.Find.FindRequest<Content>, 'use_index'> ]: pouchdb-find.PouchDB.Find.FindRequest<Content>[P]} */ trait RequestDef[Content /* <: js.Object */] extends js.Object {
  var aggregate: js.UndefOr[Boolean] = js.undefined
}

object RequestDef {
  @scala.inline
  def apply[Content /* <: js.Object */](aggregate: js.UndefOr[Boolean] = js.undefined): RequestDef[Content] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregate)) __obj.updateDynamic("aggregate")(aggregate)
    __obj.asInstanceOf[RequestDef[Content]]
  }
}

