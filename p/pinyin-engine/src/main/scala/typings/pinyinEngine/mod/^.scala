package typings.pinyinEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pinyin-engine", JSImport.Namespace)
@js.native
class ^ () extends PinyinEngine {
  def this(dataList: js.Array[String | js.Object]) = this()
  def this(dataList: js.Array[String | js.Object], keyList: js.Array[String]) = this()
  /* CompleteClass */
  override def query(`val`: String): js.Array[String] = js.native
}

