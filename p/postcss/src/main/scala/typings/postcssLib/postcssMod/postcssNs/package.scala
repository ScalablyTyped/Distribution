package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssNs {
  /* Rewritten from type alias, can be one of: 
    - Plugin[js.Any]
    - Transformer
    - postcssLib.Anon_Postcss
    - Processor
  */
  type AcceptedPlugin = _AcceptedPlugin | Plugin[js.Any]
  type JsonComment = JsonNode
  type JsonRoot = JsonContainer
  type Parse = js.Function2[
    /* css */ js.UndefOr[java.lang.String], 
    /* opts */ js.UndefOr[SourceMapOptions], 
    Root
  ]
  type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], Transformer]
  type RootNewProps = ContainerNewProps
  type Stringify = js.Function2[/* node */ js.UndefOr[Node], /* builder */ js.UndefOr[js.Any], Result | scala.Unit]
  type TransformCallback = js.Function2[/* root */ Root, /* result */ js.UndefOr[Result], scala.Unit | js.Function | js.Any]
}
