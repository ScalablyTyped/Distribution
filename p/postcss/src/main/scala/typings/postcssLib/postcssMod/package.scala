package typings
package postcssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssMod {
  /* Rewritten from type alias, can be one of: 
    - Plugin[js.Any]
    - Transformer
    - postcssLib.Anon_Postcss
    - Processor
  */
  type AcceptedPlugin = _AcceptedPlugin | Plugin[js.Any]
  type Builder = js.Function3[
    /* part */ java.lang.String, 
    /* node */ js.UndefOr[Node], 
    /* type */ js.UndefOr[postcssLib.postcssLibStrings.start | postcssLib.postcssLibStrings.end], 
    scala.Unit
  ]
  type JsonComment = JsonNode
  type JsonRoot = JsonContainer
  type Parser = js.Function2[
    /* css */ ParserInput, 
    /* opts */ js.UndefOr[
      stdLib.Pick[
        ProcessOptions, 
        postcssLib.postcssLibStrings.map | postcssLib.postcssLibStrings.from
      ]
    ], 
    Root
  ]
  type ParserInput = java.lang.String | postcssLib.Anon_ToString
  type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], Transformer]
  type RootNewProps = ContainerNewProps
  type Stringifier = js.Function2[/* node */ Node, /* builder */ Builder, scala.Unit]
  type TransformCallback = js.Function2[/* root */ Root, /* result */ Result, js.Promise[js.Any] | js.Any]
}
