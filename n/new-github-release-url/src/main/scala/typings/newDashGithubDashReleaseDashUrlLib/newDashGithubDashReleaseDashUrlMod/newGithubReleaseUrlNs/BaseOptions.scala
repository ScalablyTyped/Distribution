package typings
package newDashGithubDashReleaseDashUrlLib.newDashGithubDashReleaseDashUrlMod.newGithubReleaseUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * The description text of the release.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the release should be marked as a pre-release.
    * @default false
    */
  var isPrerelease: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The tag name of the release.
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The branch name or commit SHA to point the release's tag at, if the tag doesn't already exist.
    * @default The default branch
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the release.
    * GitHub shows the `tag` name when not specified.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

