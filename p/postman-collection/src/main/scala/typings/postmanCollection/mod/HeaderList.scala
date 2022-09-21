package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "HeaderList")
@js.native
open class HeaderList protected () extends PropertyList[Header] {
  def this(parent: Any, headers: js.Array[Header]) = this()
  
  def contentSize(): Double = js.native
}
/* static members */
object HeaderList {
  
  @JSImport("postman-collection", "HeaderList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isHeaderList(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeaderList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
