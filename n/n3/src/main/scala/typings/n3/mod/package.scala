package typings.n3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function2[/* err */ typings.std.Error, /* result */ js.Any, scala.Unit]
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  type OTerm = typings.rdfJs.mod.Term | java.lang.String | scala.Null
  type ParseCallback[Q /* <: typings.n3.mod.BaseQuad */] = js.Function3[
    /* error */ typings.std.Error, 
    /* quad */ Q, 
    /* prefixes */ typings.n3.mod.Prefixes[typings.rdfJs.mod.NamedNode], 
    scala.Unit
  ]
  type PrefixedToIri = js.Function1[/* suffix */ java.lang.String, typings.n3.mod.NamedNode]
  type Prefixes[I] = org.scalablytyped.runtime.StringDictionary[I]
  type QuadCallback[Q /* <: typings.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Unit]
  type QuadPredicate[Q /* <: typings.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Boolean]
}
