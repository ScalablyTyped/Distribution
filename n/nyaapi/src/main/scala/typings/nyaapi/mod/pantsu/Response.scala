package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response[T] extends StObject {
  
  var data: js.Array[T] = js.native
  
  var infos: js.Array[String] = js.native
  
  var ok: Boolean = js.native
}
object Response {
  
  @scala.inline
  def apply[T](data: js.Array[T], infos: js.Array[String], ok: Boolean): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response[_], T] (val x: Self with Response[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setInfos(value: js.Array[String]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfosVarargs(value: String*): Self = StObject.set(x, "infos", js.Array(value :_*))
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
