package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssNs {
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
    /* css */ java.lang.String, 
    /* opts */ js.UndefOr[
      stdLib.Pick[
        ProcessOptions, 
        postcssLib.postcssLibStrings.map | postcssLib.postcssLibStrings.from
      ]
    ], 
    Root
  ]
  type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], Transformer]
  type RootNewProps = ContainerNewProps
  type TransformCallback = js.Function2[/* root */ Root, /* result */ Result, js.Promise[js.Any] | js.Any]
}
