package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Display
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefViewDefMod {
  
  inline def apply(key: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(scala.List(key.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/ViewDef", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ViewDef {
    def this(key: String, args: Any*) = this()
  }
  @JSImport("@nginstack/web-framework/lib/classdef/ViewDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Field = typings.nginstackEngine.libClassdefFieldMod.^
  
  @js.native
  trait ViewDef extends StObject {
    
    var canDuplicate: Boolean = js.native
    
    var canNavigate: Boolean = js.native
    
    var confirmCancel: js.UndefOr[Boolean] = js.native
    
    var confirmChange: js.UndefOr[Boolean] = js.native
    
    var confirmDelete: js.UndefOr[Boolean] = js.native
    
    var defaultExplorerIndex: js.Array[String] | String = js.native
    
    var defaultIndex: js.Array[String] | String = js.native
    
    var defaultOpenInteraction: String = js.native
    
    var defaultOpenInteractionParameters: js.Array[String] = js.native
    
    var defaultProcess: Double = js.native
    
    def defineGrid(gridName: String, func: js.Function1[/* arg0 */ Any, Any]): Unit = js.native
    
    var deprecatedInterfaceEnabled: Boolean = js.native
    
    def field(name: String, `type`: String, size: Double, args: Any*): Field = js.native
    def field(name: String, `type`: String, size: Unit, args: Any*): Field = js.native
    def field(name: String, `type`: Unit, size: Double, args: Any*): Field = js.native
    def field(name: String, `type`: Unit, size: Unit, args: Any*): Field = js.native
    
    def fieldClass(arg0: Any): Any = js.native
    
    def fileAttributes(vfsKey: Double): Display = js.native
    
    var globalActions: typings.nginstackWebFramework.libClassdefGlobalActionSetMod.^ = js.native
    
    var gridDefinition: Any = js.native
    
    var imageHeight: Double = js.native
    
    var imageWidth: Double = js.native
    
    /* protected */ var logger_ : typings.nginstackEngine.libLogLoggerMod.^ = js.native
    
    var lookupTableViewWidth: Double | Null = js.native
    
    var lookupWidth: Double = js.native
    
    var onAfterChange: typings.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    var onAfterDuplicate: Any = js.native
    
    var onAfterScroll: Any = js.native
    
    var onBeforeChange: typings.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    var onBeforeDuplicate: Any = js.native
    
    var onBeforeScroll: Any = js.native
    
    var onCalculate: typings.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    var onChangeView: Any = js.native
    
    var onDefineClassesGrid: Any = js.native
    
    var onDefinePermissionsGrid: Any = js.native
    
    var onLocate: Any = js.native
    
    var onOpenKey: Any = js.native
    
    var onShowLog: Any = js.native
    
    var thumbnail: typings.nginstackWebFramework.libClassdefCellThumbnailMod.^ = js.native
    
    var tooltip: String = js.native
    
    var zoomImageHeight: Double = js.native
    
    var zoomImageOnHover: Boolean = js.native
    
    var zoomImageWidth: Double = js.native
  }
}
