package typings
package pidusageLib.pidusageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pidusage", JSImport.Namespace)
@js.native
object pidusageModMembers extends js.Object {
  def default(pid: java.lang.String): stdLib.Promise[Stat] = js.native
  def default(
    pid: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* stats */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def default(pid: scala.Double): stdLib.Promise[Stat] = js.native
  def default(
    pid: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* stats */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def default(pids: js.Array[scala.Double | java.lang.String]): stdLib.Promise[ScalablyTyped.runtime.StringDictionary[Stat]] = js.native
  def default(
    pids: js.Array[scala.Double | java.lang.String],
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* stats */ ScalablyTyped.runtime.StringDictionary[Stat], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

