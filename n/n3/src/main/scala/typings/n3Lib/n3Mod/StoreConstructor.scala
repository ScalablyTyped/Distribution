package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreConstructor
  extends ScalablyTyped.runtime.Instantiable0[N3Store[rdfDashJsLib.rdfDashJsMod.BaseQuad, BaseQuad]]
     with ScalablyTyped.runtime.Instantiable1[
      /* triples */ js.Array[rdfDashJsLib.rdfDashJsMod.BaseQuad], 
      N3Store[rdfDashJsLib.rdfDashJsMod.BaseQuad, BaseQuad]
    ]
     with ScalablyTyped.runtime.Instantiable2[
      /* triples */ js.Array[rdfDashJsLib.rdfDashJsMod.BaseQuad], 
      /* options */ StoreOptions, 
      N3Store[rdfDashJsLib.rdfDashJsMod.BaseQuad, BaseQuad]
    ] {
  def apply[Q_RDF /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */](): N3Store[Q_RDF, Q_N3] = js.native
  def apply[Q_RDF /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */](triples: js.Array[Q_RDF]): N3Store[Q_RDF, Q_N3] = js.native
  def apply[Q_RDF /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */](triples: js.Array[Q_RDF], options: StoreOptions): N3Store[Q_RDF, Q_N3] = js.native
}

