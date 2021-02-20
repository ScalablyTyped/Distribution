package typings.pgCopyStreams

import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.pg.mod.Submittable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-copy-streams", "CopyStreamQuery")
  @js.native
  class CopyStreamQuery ()
    extends Transform
       with Submittable {
    def this(opts: TransformOptions) = this()
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @JSImport("pg-copy-streams", "CopyToStreamQuery")
  @js.native
  class CopyToStreamQuery ()
    extends Transform
       with Submittable {
    def this(opts: TransformOptions) = this()
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @JSImport("pg-copy-streams", "from")
  @js.native
  def from(txt: String): CopyStreamQuery = js.native
  @JSImport("pg-copy-streams", "from")
  @js.native
  def from(txt: String, options: TransformOptions): CopyStreamQuery = js.native
  
  @JSImport("pg-copy-streams", "to")
  @js.native
  def to(txt: String): CopyToStreamQuery = js.native
  @JSImport("pg-copy-streams", "to")
  @js.native
  def to(txt: String, options: TransformOptions): CopyToStreamQuery = js.native
}
