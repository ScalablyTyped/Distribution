package typings.meteorSjobs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/msavin:sjobs", "JobContext")
@js.native
class JobContext () extends js.Object {
  
  /** Access the cached document of the current job. */
  def document(): Job = js.native
  
  /** Mark the job as having failed. */
  def failure(): js.Object = js.native
  def failure(result: js.Any): js.Object = js.native
  
   // returns Mongo WriteResult object
  /** get a persistent value from key */
  def get(key: String): js.Any = js.native
  
  /** Remove the job from the collection. */
  def remove(): Double = js.native
  
   // returns Mongo WriteResult object
  /** Replicate the job with the same arguments. */
  def replicate(): Job = js.native
  def replicate(config: JobRunConfigObject): Job = js.native
  
   // returns Mongo WriteResult object
  /** Tell the job to run again later. */
  def reschedule(): js.Object = js.native
  def reschedule(config: JobRunConfigObject): js.Object = js.native
  
  /** Sets a persistent key/value pair */
  def set(key: String, value: js.Any): js.Object = js.native
  
  /** Mark the job as successful. */
  def success(): js.Object = js.native
}
