package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.mongodb.mod.GridFSBucketWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGridFSBucketWriteSt
  extends StObject
     with Instantiable0[GridFSBucketWriteStream] {
  
  /** @event */
  val CLOSE: /* "close" */ String = js.native
  
  /** @event */
  val ERROR: /* "error" */ String = js.native
  
  /**
    * `end()` was called and the write stream successfully wrote the file metadata and all the chunks to MongoDB.
    * @event
    */
  val FINISH: /* "finish" */ String = js.native
}
