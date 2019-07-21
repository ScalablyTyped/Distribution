package typings
package newDashGithubDashReleaseDashUrlLib.newDashGithubDashReleaseDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("new-github-release-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Generate a URL for opening a new GitHub release with prefilled tag, body, and other fields.
  @returns A URL string.
  @example
  ```
  import newGithubReleaseUrl = require('new-github-release-url');
  import open = require('open');
  const url = newGithubReleaseUrl({
  	user: 'sindresorhus',
  	repo: 'new-github-release-url',
  	body: '\n\n\n---\nI\'m a human. Please be nice.'
  });
  //=> 'https://github.com/sindresorhus/new-github-release-url/releases/new?body=%0A%0A%0A---%0AI%27m+a+human.+Please+be+nice.'
  // Then open it
  open(url);
  ```
  */
  def apply(options: Options): java.lang.String = js.native
}

