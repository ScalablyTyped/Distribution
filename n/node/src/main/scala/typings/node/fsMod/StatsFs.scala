package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "StatsFs")
@js.native
open class StatsFs ()
  extends StObject
     with StatsFsBase[Double] {
  
  /** Available blocks for unprivileged users */
  /* CompleteClass */
  var bavail: Double = js.native
  
  /** Free blocks in file system. */
  /* CompleteClass */
  var bfree: Double = js.native
  
  /**  Total data blocks in file system. */
  /* CompleteClass */
  var blocks: Double = js.native
  
  /**  Optimal transfer block size. */
  /* CompleteClass */
  var bsize: Double = js.native
  
  /** Free file nodes in file system. */
  /* CompleteClass */
  var ffree: Double = js.native
  
  /** Total file nodes in file system. */
  /* CompleteClass */
  var files: Double = js.native
  
  /** Type of file system. */
  /* CompleteClass */
  var `type`: Double = js.native
}
