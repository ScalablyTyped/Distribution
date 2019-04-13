package typings
package parseDashGitDashConfigLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parseDashGitDashConfigMod {
  // TODO: Can this be defined more precisely?
  type Config = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ParseCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* config */ Config, scala.Unit]
}
