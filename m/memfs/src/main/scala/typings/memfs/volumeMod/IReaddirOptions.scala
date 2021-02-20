package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReaddirOptions extends IOptions {
  
  var withFileTypes: js.UndefOr[Boolean] = js.native
}
object IReaddirOptions {
  
  @scala.inline
  def apply(): IReaddirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReaddirOptions]
  }
  
  @scala.inline
  implicit class IReaddirOptionsMutableBuilder[Self <: IReaddirOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
