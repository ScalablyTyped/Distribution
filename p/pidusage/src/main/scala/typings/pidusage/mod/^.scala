package typings.pidusage.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pidusage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(pid: String): js.Promise[Stat] = js.native
  def apply(pid: String, callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]): Unit = js.native
  def apply(pid: String, options: StringDictionary[js.Any]): js.Promise[Stat] = js.native
  def apply(
    pid: String,
    options: StringDictionary[js.Any],
    callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]
  ): Unit = js.native
  def apply(pid: Double): js.Promise[Stat] = js.native
  def apply(pid: Double, callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]): Unit = js.native
  def apply(pid: Double, options: StringDictionary[js.Any]): js.Promise[Stat] = js.native
  def apply(
    pid: Double,
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
}
