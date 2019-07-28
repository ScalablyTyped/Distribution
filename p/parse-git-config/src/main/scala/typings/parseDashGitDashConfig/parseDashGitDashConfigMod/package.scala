package typings.parseDashGitDashConfig

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parseDashGitDashConfigMod {
  // TODO: Can this be defined more precisely?
  type Config = StringDictionary[js.Any]
  type ParseCallback = js.Function2[/* err */ Error | Null, /* config */ Config, Unit]
}
