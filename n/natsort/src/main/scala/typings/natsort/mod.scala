package typings.natsort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("natsort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function2[/* a */ String | Double, /* b */ String | Double, Double]]
  @scala.inline
  def default(options: OptionsType): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ String | Double, /* b */ String | Double, Double]]
  
  trait OptionsType extends StObject {
    
    var desc: js.UndefOr[Boolean] = js.undefined
    
    var insensitive: js.UndefOr[Boolean] = js.undefined
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
