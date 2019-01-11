package typings
package pidusageLib.pidusageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pidusage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(pid: java.lang.String): js.Promise[pidusageLib.pidusageMod.Stat] = js.native
  def default(
    pid: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* stats */ pidusageLib.pidusageMod.Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def default(pid: scala.Double): js.Promise[pidusageLib.pidusageMod.Stat] = js.native
  def default(
    pid: scala.Double,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* stats */ pidusageLib.pidusageMod.Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def default(pids: js.Array[scala.Double | java.lang.String]): js.Promise[org.scalablytyped.runtime.StringDictionary[pidusageLib.pidusageMod.Stat]] = js.native
  def default(
    pids: js.Array[scala.Double | java.lang.String],
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* stats */ org.scalablytyped.runtime.StringDictionary[pidusageLib.pidusageMod.Stat], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

