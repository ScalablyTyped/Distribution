package typings.postcssLoadConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // The full shape of the ConfigContext.
  type ConfigContext = typings.postcssLoadConfig.mod.Context with typings.postcssLoadConfig.mod.ProcessOptionsPreload with typings.postcssLoadConfig.mod.RemainingProcessOptions
  // The remaining ProcessOptions, sans the three above.
  type RemainingProcessOptions = typings.std.Pick[
    typings.postcss.mod.ProcessOptions, 
    typings.std.Exclude[
      typings.postcssLoadConfig.postcssLoadConfigStrings.from | typings.postcssLoadConfig.postcssLoadConfigStrings.to | typings.postcssLoadConfig.postcssLoadConfigStrings.parser | typings.postcssLoadConfig.postcssLoadConfigStrings.stringifier | typings.postcssLoadConfig.postcssLoadConfigStrings.syntax | typings.postcssLoadConfig.postcssLoadConfigStrings.map, 
      typings.postcssLoadConfig.postcssLoadConfigStrings.parser | typings.postcssLoadConfig.postcssLoadConfigStrings.stringifier | typings.postcssLoadConfig.postcssLoadConfigStrings.syntax
    ]
  ]
  // Result of postcssrc is a Promise containing the filename plus the options
  // and plugins that are ready to pass on to postcss.
  type ResultPlugin = typings.std.Plugin | (typings.std.Transformer[js.Any, js.Any]) | typings.postcss.mod.Processor
}
