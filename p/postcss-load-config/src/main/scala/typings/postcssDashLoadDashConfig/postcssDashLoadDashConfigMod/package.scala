package typings.postcssDashLoadDashConfig

import typings.postcss.postcssMod.Plugin
import typings.postcss.postcssMod.Processor
import typings.postcss.postcssMod.Transformer
import typings.postcssDashLoadDashConfig.RemainingProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssDashLoadDashConfigMod {
  // The full shape of the ConfigContext.
  type ConfigContext = Context with ProcessOptionsPreload with RemainingProcessOptions
  // Result of postcssrc is a Promise containing the filename plus the options
  // and plugins that are ready to pass on to postcss.
  type ResultPlugin = Plugin[js.Any] | Transformer | Processor
}
