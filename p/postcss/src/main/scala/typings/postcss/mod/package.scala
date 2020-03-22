package typings.postcss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.postcss.mod.Plugin_[js.Any]
    - typings.postcss.mod.Transformer
    - typings.postcss.AnonPostcss
    - typings.postcss.mod.Processor
  */
  type AcceptedPlugin = typings.postcss.mod._AcceptedPlugin | typings.postcss.mod.Plugin_[js.Any]
  type Builder = js.Function3[
    /* part */ java.lang.String, 
    /* node */ js.UndefOr[typings.postcss.mod.Node], 
    /* type */ js.UndefOr[typings.postcss.postcssStrings.start | typings.postcss.postcssStrings.end], 
    scala.Unit
  ]
  type JsonComment = typings.postcss.mod.JsonNode
  type JsonRoot = typings.postcss.mod.JsonContainer
  type Parser = js.Function2[
    /* css */ typings.postcss.mod.ParserInput, 
    /* opts */ js.UndefOr[typings.postcss.PickProcessOptionsmapfrom], 
    typings.postcss.mod.Root_
  ]
  type ParserInput = java.lang.String | typings.postcss.AnonToString
  type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], typings.postcss.mod.Transformer]
  type RootNewProps = typings.postcss.mod.ContainerNewProps
  type Stringifier = js.Function2[
    /* node */ typings.postcss.mod.Node, 
    /* builder */ typings.postcss.mod.Builder, 
    scala.Unit
  ]
  type TransformCallback = js.Function2[
    /* root */ typings.postcss.mod.Root_, 
    /* result */ typings.postcss.mod.Result, 
    js.Promise[js.Any] | js.Any
  ]
}
