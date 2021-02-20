package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStatOptions extends StObject {
  
  var bigint: js.UndefOr[Boolean] = js.native
}
object IStatOptions {
  
  @scala.inline
  def apply(): IStatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatOptions]
  }
  
  @scala.inline
  implicit class IStatOptionsMutableBuilder[Self <: IStatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
  }
}
