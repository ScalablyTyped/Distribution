package typings.pgCopyStreams

import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
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
  open class CopyStreamQuery ()
    extends Writable
       with Submittable {
    def this(opts: WritableOptions) = this()
    
    var rowCount: Double = js.native
    
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
    
    var text: String = js.native
  }
  
  @JSImport("pg-copy-streams", "CopyToStreamQuery")
  @js.native
  open class CopyToStreamQuery ()
    extends Readable
       with Submittable {
    def this(opts: ReadableOptions) = this()
    
    var rowCount: Double = js.native
    
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
    
    var text: String = js.native
  }
  
  inline def from(txt: String): CopyStreamQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(txt.asInstanceOf[js.Any]).asInstanceOf[CopyStreamQuery]
  inline def from(txt: String, options: WritableOptions): CopyStreamQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CopyStreamQuery]
  
  inline def to(txt: String): CopyToStreamQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("to")(txt.asInstanceOf[js.Any]).asInstanceOf[CopyToStreamQuery]
  inline def to(txt: String, options: ReadableOptions): CopyToStreamQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("to")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CopyToStreamQuery]
}
