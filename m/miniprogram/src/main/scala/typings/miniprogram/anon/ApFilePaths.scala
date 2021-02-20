package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApFilePaths extends StObject {
  
  var apFilePaths: js.Array[String] = js.native
}
object ApFilePaths {
  
  @scala.inline
  def apply(apFilePaths: js.Array[String]): ApFilePaths = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePaths]
  }
  
  @scala.inline
  implicit class ApFilePathsMutableBuilder[Self <: ApFilePaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePaths(value: js.Array[String]): Self = StObject.set(x, "apFilePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApFilePathsVarargs(value: String*): Self = StObject.set(x, "apFilePaths", js.Array(value :_*))
  }
}
