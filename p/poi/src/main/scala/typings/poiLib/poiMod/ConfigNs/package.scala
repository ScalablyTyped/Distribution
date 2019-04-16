package typings
package poiLib.poiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ConfigNs {
  type ChainWebpack = js.Function2[
    /* config */ webpackDashChainLib.webpackDashChainMod.^, 
    /* opts */ poiLib.poiMod.Opts, 
    scala.Unit
  ]
  type ConfigureWebpack = webpackLib.webpackMod.Configuration | (js.Function2[
    /* config */ webpackLib.webpackMod.Configuration, 
    /* opts */ poiLib.poiMod.Opts, 
    scala.Unit | webpackLib.webpackMod.Configuration
  ])
  type Constants = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Entry = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | webpackLib.webpackMod.Entry | webpackLib.webpackMod.EntryFunc
  ]
  type Envs = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Pages = org.scalablytyped.runtime.StringDictionary[
    (java.lang.String | stdLib.Partial[htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.Options]) with poiLib.Anon_Chunks
  ]
  type Plugins = js.Array[java.lang.String | PluginOption]
  type PublicFolder = java.lang.String | scala.Boolean
}
