package typings.natsort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("natsort", JSImport.Default)
  @js.native
  def default(): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = js.native
  @JSImport("natsort", JSImport.Default)
  @js.native
  def default(options: OptionsType): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = js.native
  
  @js.native
  trait OptionsType extends StObject {
    
    var desc: js.UndefOr[Boolean] = js.native
    
    var insensitive: js.UndefOr[Boolean] = js.native
  }
  object OptionsType {
    
    @scala.inline
    def apply(): OptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsType]
    }
    
    @scala.inline
    implicit class OptionsTypeMutableBuilder[Self <: OptionsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      @scala.inline
      def setInsensitive(value: Boolean): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
    }
  }
}
