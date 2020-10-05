package typings.mime

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def define(mimes: TypeMap): Unit = js.native
  def define(mimes: TypeMap, force: Boolean): Unit = js.native
  def getExtension(mime: String): String | Null = js.native
  def getType(path: String): String | Null = js.native
  type TypeMap = StringDictionary[js.Array[String]]
}

