package typings.omitEmpty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("omit-empty", JSImport.Default)
  @js.native
  def default(obj: js.Object): js.Object = js.native
  @JSImport("omit-empty", JSImport.Default)
  @js.native
  def default(obj: js.Object, options: OmitOptions): js.Object = js.native
  
  @js.native
  trait OmitOptions extends StObject {
    
    var omitZero: js.UndefOr[Boolean] = js.native
  }
  object OmitOptions {
    
    @scala.inline
    def apply(): OmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitOptions]
    }
    
    @scala.inline
    implicit class OmitOptionsMutableBuilder[Self <: OmitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOmitZero(value: Boolean): Self = StObject.set(x, "omitZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitZeroUndefined: Self = StObject.set(x, "omitZero", js.undefined)
    }
  }
}
