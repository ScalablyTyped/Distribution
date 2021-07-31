package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "ProxyConfigList")
@js.native
class ProxyConfigList protected () extends PropertyList[ProxyConfig] {
  def this(parent: js.Any, populate: js.Array[ProxyConfig]) = this()
  
  def resolve(url: String): ProxyConfig = js.native
  def resolve(url: Url): ProxyConfig = js.native
}
/* static members */
object ProxyConfigList {
  
  @JSImport("postman-collection", "ProxyConfigList")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isProxyConfigList(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProxyConfigList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
