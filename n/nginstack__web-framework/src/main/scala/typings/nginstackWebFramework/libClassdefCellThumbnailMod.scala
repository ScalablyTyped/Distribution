package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefCellThumbnailMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/CellThumbnail", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CellThumbnail
  @JSImport("@nginstack/web-framework/lib/classdef/CellThumbnail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait CellThumbnail extends StObject {
    
    def assignFrom(obj: Any): Unit = js.native
    
    /* private */ var assignProperties_ : Any = js.native
    
    def getImages(): js.Array[String] = js.native
    def getImages(key: Double): js.Array[String] = js.native
    
    var height: Double = js.native
    
    var onGetImages: typings.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    var visible: Boolean = js.native
    
    var width: Double = js.native
    
    var zoomMaxHeight: Double = js.native
    
    var zoomMaxWidth: Double = js.native
    
    var zoomOnHover: Boolean = js.native
  }
}
