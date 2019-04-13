package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateParams extends js.Object {
  /**
    * A descriptive name for this gist.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The filenames and content of each file in the gist. The keys in the `files` object represent the filename and have the type `string`.
    */
  var files: GistsCreateParamsFiles
  /**
    * When `true`, the gist will be public and available for anyone to see.
    */
  var public: js.UndefOr[scala.Boolean] = js.undefined
}

object GistsCreateParams {
  @scala.inline
  def apply(
    files: GistsCreateParamsFiles,
    description: java.lang.String = null,
    public: js.UndefOr[scala.Boolean] = js.undefined
  ): GistsCreateParams = {
    val __obj = js.Dynamic.literal(files = files)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    __obj.asInstanceOf[GistsCreateParams]
  }
}

