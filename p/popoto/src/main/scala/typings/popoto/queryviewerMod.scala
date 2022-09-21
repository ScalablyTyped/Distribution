package typings.popoto

import typings.popoto.providerMod.Link
import typings.popoto.providerMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryviewerMod {
  
  object QueryViewer {
    
    @JSImport("popoto/queryviewer", "QueryViewer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popoto/queryviewer", "QueryViewer.CHOOSE_LABEL")
    @js.native
    val CHOOSE_LABEL: String = js.native
    
    @JSImport("popoto/queryviewer", "QueryViewer.QUERY_STARTER")
    @js.native
    val QUERY_STARTER: String = js.native
    
    inline def clickSpan(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clickSpan")().asInstanceOf[Unit]
    
    @JSImport("popoto/queryviewer", "QueryViewer.containerId")
    @js.native
    val containerId: String = js.native
    
    /**
      * Create the query viewer area.
      */
    inline def createQueryArea(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryArea")().asInstanceOf[Unit]
    
    inline def generateConstraintData(links: js.Array[Link], nodes: js.Array[Node]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateConstraintData")(links.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def generateData(links: js.Array[Link], nodes: js.Array[Node]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateData")(links.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def mouseOutSpan(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOutSpan")().asInstanceOf[Unit]
    
    inline def mouseOverSpan(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOverSpan")().asInstanceOf[Unit]
    
    inline def rightClickSpan(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rightClickSpan")().asInstanceOf[Unit]
    
    /**
      * Update all the elements displayed on the query viewer based on current graph.
      */
    inline def updateQuery(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateQuery")().asInstanceOf[Unit]
  }
}
