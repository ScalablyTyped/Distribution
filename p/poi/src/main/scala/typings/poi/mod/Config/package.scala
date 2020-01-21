package typings.poi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Config {
  type ChainWebpack = js.Function2[/* config */ typings.webpackChain.mod.^, /* opts */ typings.poi.mod.Opts, scala.Unit]
  type ConfigureWebpack = typings.webpack.mod.Configuration | (js.Function2[
    /* config */ typings.webpack.mod.Configuration, 
    /* opts */ typings.poi.mod.Opts, 
    scala.Unit | typings.webpack.mod.Configuration
  ])
  type Constants = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Css = typings.poi.mod.Config.Css_
  type Entry = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | typings.webpack.mod.Entry | typings.webpack.mod.EntryFunc
  ]
  type Envs = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Output = typings.poi.mod.Config.Output_
  type Pages = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | (typings.std.Partial[typings.htmlWebpackPlugin.mod.Options] with typings.poi.AnonChunks)
  ]
  type Plugins = js.Array[java.lang.String | typings.poi.mod.Config.PluginOption]
  type PublicFolder = java.lang.String | scala.Boolean
}
