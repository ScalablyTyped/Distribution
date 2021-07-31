package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tojsMod {
  
  @JSImport("mobx/lib/api/tojs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def toJS(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def toJS(source: js.Any, options: ToJSOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def toJS[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def toJS[T](source: T, options: ToJSOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait ToJSOptions extends StObject {
    
    var detectCycles: js.UndefOr[Boolean] = js.undefined
    
    var exportMapsAsObjects: js.UndefOr[Boolean] = js.undefined
    
    var recurseEverything: js.UndefOr[Boolean] = js.undefined
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
