package typings
package newDashGithubDashIssueDashUrlLib.newDashGithubDashIssueDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object newGithubIssueUrlNs {
  type Options = XOR[RepoUrlOptions, UserRepoOptions]
  type Without[T, U] = newDashGithubDashIssueDashUrlLib.newDashGithubDashIssueDashUrlLibStrings.Without with js.Any
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
}
