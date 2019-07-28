package typings.n3.n3Mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamWriterConstructor
  extends Instantiable0[N3StreamWriter[typings.rdfDashJs.rdfDashJsMod.BaseQuad]]
     with Instantiable2[
      /* fd */ js.Any, 
      /* options */ WriterOptions, 
      N3StreamWriter[typings.rdfDashJs.rdfDashJsMod.BaseQuad]
    ]
     with Instantiable1[
      (/* fd */ js.Any) | (/* options */ WriterOptions), 
      N3StreamWriter[typings.rdfDashJs.rdfDashJsMod.BaseQuad]
    ] {
  def apply[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */](): N3StreamWriter[Q] = js.native
  def apply[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */](fd: js.Any): N3StreamWriter[Q] = js.native
  def apply[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */](fd: js.Any, options: WriterOptions): N3StreamWriter[Q] = js.native
  def apply[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */](options: WriterOptions): N3StreamWriter[Q] = js.native
}

