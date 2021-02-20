package typings.mime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mime", "define")
  @js.native
  def define(mimes: TypeMap): Unit = js.native
  @JSImport("mime", "define")
  @js.native
  def define(mimes: TypeMap, force: Boolean): Unit = js.native
  
  @JSImport("mime", "getExtension")
  @js.native
  def getExtension(mime: String): String | Null = js.native
  
  @JSImport("mime", "getType")
  @js.native
  def getType(path: String): String | Null = js.native
  
  type TypeMap = StringDictionary[js.Array[String]]
}
