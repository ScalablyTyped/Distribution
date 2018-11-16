package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Headers")
@js.native
class Headers ()
  extends nodeDashFetchLib.nodeDashFetchMod.fetchNs.Headers {
  def this(init: ScalablyTyped.runtime.StringDictionary[java.lang.String]) = this()
  def this(init: nodeDashFetchLib.nodeDashFetchMod.fetchNs.Headers) = this()
  /* CompleteClass */
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[nodeLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  /* CompleteClass */
  override def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def delete(name: java.lang.String): scala.Unit = js.native
  // Iterator methods
  /* CompleteClass */
  override def entries(): nodeLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  /* CompleteClass */
  override def forEach(callback: js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def has(name: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def keys(): nodeLib.Iterator[java.lang.String] = js.native
  /* CompleteClass */
  override def raw(): ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  /* CompleteClass */
  override def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def values(): nodeLib.Iterator[js.Array[java.lang.String]] = js.native
}

