package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DocumentToObjectOptions extends js.Object {
  /** depopulate any populated paths, replacing them with their original refs (defaults to false) */
  var depopulate: js.UndefOr[scala.Boolean] = js.undefined
  /** apply all getters (path and virtual getters) */
  var getters: js.UndefOr[scala.Boolean] = js.undefined
  /** remove empty objects (defaults to true) */
  var minimize: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A transform function to apply to the resulting document before returning
       * @param doc The mongoose document which is being converted
       * @param ret The plain object representation which has been converted
       * @param options The options in use (either schema options or the options passed inline)
       */
  var transform: js.UndefOr[js.Function3[/* doc */ js.Any, /* ret */ js.Any, /* options */ js.Any, _]] = js.undefined
  /** whether to include the version key (defaults to true) */
  var versionKey: js.UndefOr[scala.Boolean] = js.undefined
  /** apply virtual getters (can override getters option) */
  var virtuals: js.UndefOr[scala.Boolean] = js.undefined
}

