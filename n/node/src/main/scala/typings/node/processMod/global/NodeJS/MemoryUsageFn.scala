package typings.node.processMod.global.NodeJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryUsageFn extends StObject {
  
  /**
    * The `process.memoryUsage()` method iterate over each page to gather informations about memory
    * usage which can be slow depending on the program memory allocations.
    */
  def apply(): MemoryUsage = js.native
  
  /**
    * method returns an integer representing the Resident Set Size (RSS) in bytes.
    */
  def rss(): Double = js.native
}
