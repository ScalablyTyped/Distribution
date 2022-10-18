package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Bookmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnchorAnchorCollectionMod {
  
  inline def apply(attachedTo: Any, process: Process): Unit = (^.asInstanceOf[js.Dynamic].apply(attachedTo.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/anchor/AnchorCollection", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AnchorCollection {
    def this(attachedTo: Any, process: Process) = this()
  }
  @JSImport("@nginstack/web-framework/lib/anchor/AnchorCollection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Anchor = typings.nginstackWebFramework.libAnchorAnchorMod.^
  
  @js.native
  trait AnchorCollection extends StObject {
    
    /* private */ var act_showMenu_ : Any = js.native
    
    def add(anchor: js.Array[Anchor]): Unit = js.native
    def add(anchor: Anchor): Unit = js.native
    
    /* private */ var addAnchor_ : Any = js.native
    
    /* private */ var anchorToMenuItem_ : Any = js.native
    
    var anchors: js.Array[Any] = js.native
    
    /* private */ var assign: Any = js.native
    
    /* private */ var attachedTo_ : Any = js.native
    
    def clear(): Unit = js.native
    
    /* private */ @JSName("clone")
    var clone_FAnchorCollection: Any = js.native
    
    /* private */ var convertParametersToParams: Any = js.native
    
    /* private */ var createParametersInfo: Any = js.native
    
    /* private */ var cssClass: Any = js.native
    
    def formatHtml(content: String, parameterValues: js.Array[Any]): String = js.native
    def formatHtml(content: String, parameterValues: js.Array[Any], opt_options: Bookmark): String = js.native
    
    /* private */ var getHtml: Any = js.native
    
    /* private */ var getImgHtml: Any = js.native
    
    /* private */ var getParameters: Any = js.native
    
    /* private */ var getParametersValues: Any = js.native
    
    /* private */ var pairName_ : Any = js.native
    
    var process: typings.nginstackWebFramework.libProcessProcessMod.^ = js.native
    
    /* private */ var setParameterForAllAnchors: Any = js.native
    
    var size: Double = js.native
    
    /* private */ var write: Any = js.native
    
    /* private */ var written_ : Any = js.native
  }
  
  type Process = typings.nginstackWebFramework.libProcessProcessMod.^
}
