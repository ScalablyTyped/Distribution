package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.meteor.meteorStrings.close
import typings.meteor.meteorStrings.data
import typings.meteor.meteorStrings.end
import typings.meteor.meteorStrings.error
import typings.meteor.meteorStrings.file
import typings.mongodb.mod.GridFSBucketReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGridFSBucketReadStr
  extends StObject
     with Instantiable0[GridFSBucketReadStream] {
  
  /**
    * Fired when the stream is exhausted and the underlying cursor is killed
    * @event
    */
  val CLOSE: close = js.native
  
  /**
    * Emitted when a chunk of data is available to be consumed.
    * @event
    */
  val DATA: data = js.native
  
  /**
    * Fired when the stream is exhausted (no more data events).
    * @event
    */
  val END: end = js.native
  
  /* Excluded from this release type: s */
  /**
    * An error occurred
    * @event
    */
  val ERROR: error = js.native
  
  /**
    * Fires when the stream loaded the file document corresponding to the provided id.
    * @event
    */
  val FILE: file = js.native
}
