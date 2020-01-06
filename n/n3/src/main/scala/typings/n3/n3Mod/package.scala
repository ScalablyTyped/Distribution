package typings.n3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object n3Mod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type ErrorCallback = js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  type OTerm = typings.rdfDashJs.rdfDashJsMod.Term | String | Null
  type ParseCallback[Q /* <: BaseQuad */] = js.Function3[
    /* error */ Error, 
    /* quad */ Q, 
    /* prefixes */ Prefixes[typings.rdfDashJs.rdfDashJsMod.NamedNode], 
    Unit
  ]
  type PrefixedToIri = js.Function1[/* suffix */ String, NamedNode]
  type Prefixes[I] = StringDictionary[I]
  type QuadCallback[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Unit]
  type QuadPredicate[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Boolean]
}
