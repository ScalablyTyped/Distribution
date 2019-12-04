package typings.postcssDashLoadDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssDashLoadDashConfigMod {
  import typings.postcss.postcssMod.Plugin
  import typings.postcss.postcssMod.ProcessOptions
  import typings.postcss.postcssMod.Processor
  import typings.postcss.postcssMod.Transformer
  import typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.from
  import typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.map
  import typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.parser
  import typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.stringifier
  import typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.syntax
  import typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.to
  import typings.std.Exclude
  import typings.std.Pick

  // The full shape of the ConfigContext.
  type ConfigContext = Context with ProcessOptionsPreload with RemainingProcessOptions
  // The remaining ProcessOptions, sans the three above.
  type RemainingProcessOptions = Pick[
    ProcessOptions, 
    Exclude[from | to | parser | stringifier | syntax | map, parser | stringifier | syntax]
  ]
  // Result of postcssrc is a Promise containing the filename plus the options
  // and plugins that are ready to pass on to postcss.
  type ResultPlugin = Plugin[js.Any] | Transformer | Processor
}
