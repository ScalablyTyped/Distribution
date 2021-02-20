package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReadFileOptions extends IOptions {
  
  var flag: js.UndefOr[String] = js.native
}
object IReadFileOptions {
  
  @scala.inline
  def apply(): IReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadFileOptions]
  }
  
  @scala.inline
  implicit class IReadFileOptionsMutableBuilder[Self <: IReadFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
