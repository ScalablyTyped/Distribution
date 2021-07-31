package typings.paralleljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Parallel")
  @js.native
  class Parallel[T] protected ()
    extends StObject
       with typings.paralleljs.Parallel[T] {
    /**
      * This is the constructor.  Use it to new up any parallel jobs.  The constructor takes an array of data you want to operate on.  This data will be held in memory until you finish your job, and can be accessed via the .data attribute of your job.
      * The object returned by the Parallel constructor is meant to be chained, so you can produce a chain of operations on the provided data.
      * @param data This is the data you wish to operate on.  Will often be an array, but the only restrictions are that your values are serializable as JSON.
      * @param opts Some options for your job.
      **/
    def this(data: T) = this()
    def this(data: T, opts: ParallelOptions) = this()
  }
}
