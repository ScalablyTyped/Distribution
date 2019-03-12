package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Headers")
@js.native
class Headers ()
  extends stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
  def this(init: Headers) = this()
  def this(init: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  // Iterator methods
  def entries(): stdLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def forEach(callback: js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def keys(): stdLib.Iterator[java.lang.String] = js.native
  def raw(): org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def values(): stdLib.Iterator[js.Array[java.lang.String]] = js.native
}

