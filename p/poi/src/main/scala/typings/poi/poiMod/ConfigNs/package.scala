package typings.poi.poiMod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.Options
import typings.poi.Anon_Chunks
import typings.poi.poiMod.Opts
import typings.std.Partial
import typings.webpack.webpackMod.Configuration
import typings.webpack.webpackMod.EntryFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ConfigNs {
  type ChainWebpack = js.Function2[/* config */ typings.webpackDashChain.webpackDashChainMod.^, /* opts */ Opts, Unit]
  type ConfigureWebpack = Configuration | (js.Function2[/* config */ Configuration, /* opts */ Opts, Unit | Configuration])
  type Constants = StringDictionary[String]
  type Entry = js.UndefOr[String | js.Array[String] | typings.webpack.webpackMod.Entry | EntryFunc]
  type Envs = StringDictionary[String]
  type Pages = StringDictionary[String | (Partial[Options] with Anon_Chunks)]
  type Plugins = js.Array[String | PluginOption]
  type PublicFolder = String | Boolean
}
