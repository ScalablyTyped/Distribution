package typings.paralleljs.mod

import typings.paralleljs.Parallel
import typings.paralleljs.ParallelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paralleljs", JSImport.Namespace)
@js.native
class ^[T] protected () extends Parallel[T] {
  /**
  	* This is the constructor.  Use it to new up any parallel jobs.  The constructor takes an array of data you want to operate on.  This data will be held in memory until you finish your job, and can be accessed via the .data attribute of your job.
  	* The object returned by the Parallel constructor is meant to be chained, so you can produce a chain of operations on the provided data.
  	* @param data This is the data you wish to operate on.  Will often be an array, but the only restrictions are that your values are serializable as JSON.
  	* @param opts Some options for your job.
  	**/
  def this(data: T) = this()
  def this(data: T, opts: ParallelOptions) = this()
}

