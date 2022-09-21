package typings.popoto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsMod {
  
  object Tools {
    
    @JSImport("popoto/tools", "Tools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popoto/tools", "Tools.CENTER_GRAPH")
    @js.native
    val CENTER_GRAPH: Boolean = js.native
    
    @JSImport("popoto/tools", "Tools.RESET_GRAPH")
    @js.native
    val RESET_GRAPH: Boolean = js.native
    
    @JSImport("popoto/tools", "Tools.SAVE_GRAPH")
    @js.native
    val SAVE_GRAPH: Boolean = js.native
    
    @JSImport("popoto/tools", "Tools.TOGGLE_FIT_TEXT")
    @js.native
    val TOGGLE_FIT_TEXT: Boolean = js.native
    
    @JSImport("popoto/tools", "Tools.TOGGLE_FULL_SCREEN")
    @js.native
    val TOGGLE_FULL_SCREEN: Boolean = js.native
    
    @JSImport("popoto/tools", "Tools.TOGGLE_TAXONOMY")
    @js.native
    val TOGGLE_TAXONOMY: Boolean = js.native
    
    @JSImport("popoto/tools", "Tools.TOGGLE_VIEW_RELATION")
    @js.native
    val TOGGLE_VIEW_RELATION: Boolean = js.native
    
    /**
      * Reset zoom and center the view on svg center.
      */
    inline def center(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("center")().asInstanceOf[Unit]
    
    /**
      * Reset the graph to display the root node only.
      */
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    
    /**
      * Enable, disable text fitting on nodes.
      */
    inline def toggleFitText(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleFitText")().asInstanceOf[Unit]
    
    inline def toggleFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleFullScreen")().asInstanceOf[Unit]
    
    /**
      * Show, hide taxonomy panel.
      */
    inline def toggleTaxonomy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleTaxonomy")().asInstanceOf[Unit]
    
    /**
      * Show, hide relation donuts.
      */
    inline def toggleViewRelation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleViewRelation")().asInstanceOf[Unit]
  }
}
