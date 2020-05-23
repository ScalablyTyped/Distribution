package typings.mongoose.anon

import typings.mongoose.mod.ClientSession
import typings.mongoose.mod.CollationOptions
import typings.mongoose.mod.ModelPopulateOptions
import typings.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  lean  :true} & mongoose.mongoose.Omit<mongoose.mongoose.QueryFindBaseOptions, 'lean'> */
trait leantrueOmitQueryFindBase extends js.Object {
  var collation: js.UndefOr[CollationOptions] = js.undefined
  var explain: js.UndefOr[js.Any] = js.undefined
  var lean: `true`
  var populate: js.UndefOr[String | ModelPopulateOptions] = js.undefined
  var projection: js.UndefOr[js.Any] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object leantrueOmitQueryFindBase {
  @scala.inline
  def apply(
    lean: `true`,
    collation: CollationOptions = null,
    explain: js.Any = null,
    populate: String | ModelPopulateOptions = null,
    projection: js.Any = null,
    session: ClientSession = null
  ): leantrueOmitQueryFindBase = {
    val __obj = js.Dynamic.literal(lean = lean.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (explain != null) __obj.updateDynamic("explain")(explain.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[leantrueOmitQueryFindBase]
  }
}

