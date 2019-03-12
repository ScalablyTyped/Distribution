package typings
package n3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object n3Mod {
  type ErrorCallback = js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  type OTerm = rdfDashJsLib.rdfDashJsMod.Term | java.lang.String | scala.Null
  type ParseCallback[Q /* <: BaseQuad */] = js.Function3[
    /* error */ stdLib.Error, 
    /* quad */ Q, 
    /* prefixes */ Prefixes[rdfDashJsLib.rdfDashJsMod.NamedNode], 
    scala.Unit
  ]
  type PrefixedToIri = js.Function1[/* suffix */ java.lang.String, rdfDashJsLib.rdfDashJsMod.NamedNode]
  type QuadCallback[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, scala.Unit]
  type QuadPredicate[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, scala.Boolean]
}
