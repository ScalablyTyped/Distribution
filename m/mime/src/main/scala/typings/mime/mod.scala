package typings.mime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def define(mimes: TypeMap): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(mimes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def define(mimes: TypeMap, force: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(mimes.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getExtension(mime: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(mime.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getType(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  type TypeMap = StringDictionary[js.Array[String]]
}
