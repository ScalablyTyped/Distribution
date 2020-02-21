package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateParams extends js.Object {
  /**
    * A descriptive name for this gist.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The filenames and content of each file in the gist. The keys in the `files` object represent the filename and have the type `string`.
    */
  var files: GistsCreateParamsFiles
  /**
    * When `true`, the gist will be public and available for anyone to see.
    */
  var public: js.UndefOr[Boolean] = js.undefined
}

object GistsCreateParams {
  @scala.inline
  def apply(
    files: GistsCreateParamsFiles,
    description: String = null,
    public: js.UndefOr[Boolean] = js.undefined
  ): GistsCreateParams = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateParams]
  }
}

