package typings.pgCopyStreams

import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.pg.mod.Connection
import typings.pg.mod.Submittable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-copy-streams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
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
    
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
  }
  
  @scala.inline
  def from(txt: String): CopyStreamQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(txt.asInstanceOf[js.Any]).asInstanceOf[CopyStreamQuery]
  @scala.inline
  def from(txt: String, options: TransformOptions): CopyStreamQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CopyStreamQuery]
  
  @scala.inline
  def to(txt: String): CopyToStreamQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("to")(txt.asInstanceOf[js.Any]).asInstanceOf[CopyToStreamQuery]
  @scala.inline
  def to(txt: String, options: TransformOptions): CopyToStreamQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("to")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CopyToStreamQuery]
}
