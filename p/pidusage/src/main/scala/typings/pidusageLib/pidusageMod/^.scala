package typings
package pidusageLib.pidusageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pidusage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(pid: scala.Double | java.lang.String): js.Promise[pidusageLib.pidusageMod.Stat] = js.native
  def apply(
    pid: scala.Double | java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* stats */ pidusageLib.pidusageMod.Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(pid: scala.Double | java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[pidusageLib.pidusageMod.Stat] = js.native
  def apply(
    pid: scala.Double | java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* stats */ pidusageLib.pidusageMod.Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(pids: js.Array[scala.Double | java.lang.String]): js.Promise[org.scalablytyped.runtime.StringDictionary[pidusageLib.pidusageMod.Stat]] = js.native
  def apply(
    pids: js.Array[scala.Double | java.lang.String],
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* stats */ org.scalablytyped.runtime.StringDictionary[pidusageLib.pidusageMod.Stat], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    pids: js.Array[scala.Double | java.lang.String],
    options: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[org.scalablytyped.runtime.StringDictionary[pidusageLib.pidusageMod.Stat]] = js.native
  def apply(
    pids: js.Array[scala.Double | java.lang.String],
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* stats */ org.scalablytyped.runtime.StringDictionary[pidusageLib.pidusageMod.Stat], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * If needed this function can be used to clear the event loop.
    * Indeed, we're registering an interval to free up the in-memory metrics.
    * By calling this, it will clear this interval and all delete all in-memory data
    */
  def clear(): scala.Unit = js.native
}

