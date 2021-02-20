package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tojsMod {
  
  @JSImport("mobx/lib/api/tojs", "toJS")
  @js.native
  def toJS(source: js.Any): js.Any = js.native
  @JSImport("mobx/lib/api/tojs", "toJS")
  @js.native
  def toJS(source: js.Any, options: ToJSOptions): js.Any = js.native
  @JSImport("mobx/lib/api/tojs", "toJS")
  @js.native
  def toJS[T](source: T): T = js.native
  @JSImport("mobx/lib/api/tojs", "toJS")
  @js.native
  def toJS[T](source: T, options: ToJSOptions): T = js.native
  
  @js.native
  trait ToJSOptions extends StObject {
    
    var detectCycles: js.UndefOr[Boolean] = js.native
    
    var exportMapsAsObjects: js.UndefOr[Boolean] = js.native
    
    var recurseEverything: js.UndefOr[Boolean] = js.native
  }
  object ToJSOptions {
    
    @scala.inline
    def apply(): ToJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToJSOptions]
    }
    
    @scala.inline
    implicit class ToJSOptionsMutableBuilder[Self <: ToJSOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectCycles(value: Boolean): Self = StObject.set(x, "detectCycles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectCyclesUndefined: Self = StObject.set(x, "detectCycles", js.undefined)
      
      @scala.inline
      def setExportMapsAsObjects(value: Boolean): Self = StObject.set(x, "exportMapsAsObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportMapsAsObjectsUndefined: Self = StObject.set(x, "exportMapsAsObjects", js.undefined)
      
      @scala.inline
      def setRecurseEverything(value: Boolean): Self = StObject.set(x, "recurseEverything", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurseEverythingUndefined: Self = StObject.set(x, "recurseEverything", js.undefined)
    }
  }
}
