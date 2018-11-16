package typings
package nodeDashFetchLib.nodeDashFetchMod.fetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Headers
  extends nodeLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[nodeLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]]
  def append(name: java.lang.String, value: java.lang.String): scala.Unit
  def delete(name: java.lang.String): scala.Unit
  // Iterator methods
  def entries(): nodeLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]
  def forEach(callback: js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, scala.Unit]): scala.Unit
  def get(name: java.lang.String): java.lang.String | scala.Null
  def getAll(name: java.lang.String): js.Array[java.lang.String]
  def has(name: java.lang.String): scala.Boolean
  def keys(): nodeLib.Iterator[java.lang.String]
  def raw(): ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]
  def set(name: java.lang.String, value: java.lang.String): scala.Unit
  def values(): nodeLib.Iterator[js.Array[java.lang.String]]
}

