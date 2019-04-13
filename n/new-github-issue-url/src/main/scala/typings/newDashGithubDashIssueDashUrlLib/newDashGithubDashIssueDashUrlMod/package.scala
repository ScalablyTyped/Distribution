package typings
package newDashGithubDashIssueDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object newDashGithubDashIssueDashUrlMod {
  type Options = XOR[RepoUrlOptions, UserRepoOptions]
  type Without[T, U] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    */ newDashGithubDashIssueDashUrlLib.newDashGithubDashIssueDashUrlLibStrings.Without with js.Any
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
}
