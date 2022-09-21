package typings.oracledb.mod

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extends Readable and provides access to data and metadata of the query. The end event indicates the end of the query results.
  * After the end event has been received, the Stream destroy() function should be called to clean up resources properly.
  * Any further end-of-fetch logic, in particular the connection release, should be in the close event.
  */
@js.native
trait QueryStream[T]
  extends Readable
     with QueryStreamEvents[T]
