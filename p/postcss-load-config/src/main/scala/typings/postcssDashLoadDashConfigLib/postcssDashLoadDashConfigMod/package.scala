package typings
package postcssDashLoadDashConfigLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssDashLoadDashConfigMod {
  // The full shape of the ConfigContext.
  type ConfigContext = Context with ProcessOptionsPreload with postcssDashLoadDashConfigLib.RemainingProcessOptions
  // Result of postcssrc is a Promise containing the filename plus the options
  // and plugins that are ready to pass on to postcss.
  type ResultPlugin = postcssLib.postcssMod.Plugin[js.Any] | postcssLib.postcssMod.Transformer | postcssLib.postcssMod.Processor
}
