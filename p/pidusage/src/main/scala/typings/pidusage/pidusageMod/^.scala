package typings.pidusage.pidusageMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pidusage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(pid: Double | String): js.Promise[Stat] = js.native
  def apply(pid: Double | String, callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]): Unit = js.native
  def apply(pid: Double | String, options: StringDictionary[js.Any]): js.Promise[Stat] = js.native
  def apply(
    pid: Double | String,
    options: StringDictionary[js.Any],
    callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]
  ): Unit = js.native
  def apply(pids: js.Array[Double | String]): js.Promise[StringDictionary[Stat]] = js.native
  def apply(
    pids: js.Array[Double | String],
    callback: js.Function2[/* err */ Error | Null, /* stats */ StringDictionary[Stat], Unit]
  ): Unit = js.native
  def apply(pids: js.Array[Double | String], options: StringDictionary[js.Any]): js.Promise[StringDictionary[Stat]] = js.native
  def apply(
    pids: js.Array[Double | String],
    options: StringDictionary[js.Any],
    callback: js.Function2[/* err */ Error | Null, /* stats */ StringDictionary[Stat], Unit]
  ): Unit = js.native
  /**
    * If needed this function can be used to clear the event loop.
    * Indeed, we're registering an interval to free up the in-memory metrics.
    * By calling this, it will clear this interval and all delete all in-memory data
    */
  def clear(): Unit = js.native
}

