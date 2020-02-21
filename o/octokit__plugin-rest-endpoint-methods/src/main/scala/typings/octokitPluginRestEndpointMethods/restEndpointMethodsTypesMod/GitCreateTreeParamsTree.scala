package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`040000`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`100644`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`100755`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`120000`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`160000`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.blob
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.commit
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeParamsTree extends js.Object {
  /**
    * The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use either this, or `tree.sha`.
    *
    * **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree), `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
    */
  var mode: js.UndefOr[`100644` | `100755` | `040000` | `160000` | `120000`] = js.undefined
  /**
    * The file referenced in the tree.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will be deleted.
    *
    * **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
    */
  var sha: js.UndefOr[String | Null] = js.undefined
  /**
    * Either `blob`, `tree`, or `commit`.
    */
  var `type`: js.UndefOr[blob | tree | commit] = js.undefined
}

object GitCreateTreeParamsTree {
  @scala.inline
  def apply(
    content: String = null,
    mode: `100644` | `100755` | `040000` | `160000` | `120000` = null,
    path: String = null,
    sha: String = null,
    `type`: blob | tree | commit = null
  ): GitCreateTreeParamsTree = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeParamsTree]
  }
}

