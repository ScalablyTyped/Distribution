package typings.mime

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mime", JSImport.Namespace)
@js.native
object mimeMod extends js.Object {
  @js.native
  trait Mime extends js.Object {
    def define(mimes: TypeMap): Unit = js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    def getExtension(mime: String): String | Null = js.native
    def getType(path: String): String | Null = js.native
  }
  
  @js.native
  class default protected () extends Mime {
    def this(mimes: TypeMap) = this()
  }
  
  def define(mimes: TypeMap): Unit = js.native
  def define(mimes: TypeMap, force: Boolean): Unit = js.native
  def getExtension(mime: String): String | Null = js.native
  def getType(path: String): String | Null = js.native
  type TypeMap = StringDictionary[js.Array[String]]
}

