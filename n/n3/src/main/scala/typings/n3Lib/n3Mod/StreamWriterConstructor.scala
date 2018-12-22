package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamWriterConstructor
  extends org.scalablytyped.runtime.Instantiable0[N3StreamWriter[rdfDashJsLib.rdfDashJsMod.BaseQuad]]
     with org.scalablytyped.runtime.Instantiable2[
      /* fd */ js.Any, 
      /* options */ WriterOptions, 
      N3StreamWriter[rdfDashJsLib.rdfDashJsMod.BaseQuad]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* fd */ js.Any) | (/* options */ WriterOptions), 
      N3StreamWriter[rdfDashJsLib.rdfDashJsMod.BaseQuad]
    ] {
  def apply[Q /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */](): N3StreamWriter[Q] = js.native
  def apply[Q /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */](fd: js.Any): N3StreamWriter[Q] = js.native
  def apply[Q /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */](fd: js.Any, options: WriterOptions): N3StreamWriter[Q] = js.native
  def apply[Q /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */](options: WriterOptions): N3StreamWriter[Q] = js.native
}

