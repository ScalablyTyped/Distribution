package typings.n3.n3Mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreConstructor
  extends Instantiable0[N3Store[typings.rdfDashJs.rdfDashJsMod.BaseQuad, BaseQuad]]
     with Instantiable1[
      /* triples */ js.Array[typings.rdfDashJs.rdfDashJsMod.BaseQuad], 
      N3Store[typings.rdfDashJs.rdfDashJsMod.BaseQuad, BaseQuad]
    ]
     with Instantiable2[
      /* triples */ js.Array[typings.rdfDashJs.rdfDashJsMod.BaseQuad], 
      /* options */ StoreOptions, 
      N3Store[typings.rdfDashJs.rdfDashJsMod.BaseQuad, BaseQuad]
    ] {
  def apply[Q_RDF /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */](): N3Store[Q_RDF, Q_N3] = js.native
  def apply[Q_RDF /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */](triples: js.Array[Q_RDF]): N3Store[Q_RDF, Q_N3] = js.native
  def apply[Q_RDF /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */](triples: js.Array[Q_RDF], options: StoreOptions): N3Store[Q_RDF, Q_N3] = js.native
}

