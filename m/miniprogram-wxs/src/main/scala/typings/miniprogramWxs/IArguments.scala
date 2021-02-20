package typings.miniprogramWxs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArguments
  extends /* index */ NumberDictionary[js.Any] {
  
  var callee: Function = js.native
  
  var length: Double = js.native
}
object IArguments {
  
  @scala.inline
  def apply(callee: Function, length: Double): IArguments = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArguments]
  }
  
  @scala.inline
  implicit class IArgumentsMutableBuilder[Self <: IArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallee(value: Function): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
