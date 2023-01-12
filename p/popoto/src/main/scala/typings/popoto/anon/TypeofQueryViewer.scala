package typings.popoto.anon

import typings.popoto.providerMod.Link
import typings.popoto.providerMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQueryViewer extends StObject {
  
  val CHOOSE_LABEL: String
  
  val QUERY_STARTER: String
  
  def clickSpan(): Unit
  
  val containerId: String
  
  /**
    * Create the query viewer area.
    */
  def createQueryArea(): Unit
  
  def generateConstraintData(links: js.Array[Link], nodes: js.Array[Node]): js.Array[Any]
  
  def generateData(links: js.Array[Link], nodes: js.Array[Node]): js.Array[Any]
  
  def mouseOutSpan(): Unit
  
  def mouseOverSpan(): Unit
  
  def rightClickSpan(): Unit
  
  /**
    * Update all the elements displayed on the query viewer based on current graph.
    */
  def updateQuery(): Unit
}
object TypeofQueryViewer {
  
  inline def apply(
    CHOOSE_LABEL: String,
    QUERY_STARTER: String,
    clickSpan: () => Unit,
    containerId: String,
    createQueryArea: () => Unit,
    generateConstraintData: (js.Array[Link], js.Array[Node]) => js.Array[Any],
    generateData: (js.Array[Link], js.Array[Node]) => js.Array[Any],
    mouseOutSpan: () => Unit,
    mouseOverSpan: () => Unit,
    rightClickSpan: () => Unit,
    updateQuery: () => Unit
  ): TypeofQueryViewer = {
    val __obj = js.Dynamic.literal(CHOOSE_LABEL = CHOOSE_LABEL.asInstanceOf[js.Any], QUERY_STARTER = QUERY_STARTER.asInstanceOf[js.Any], clickSpan = js.Any.fromFunction0(clickSpan), containerId = containerId.asInstanceOf[js.Any], createQueryArea = js.Any.fromFunction0(createQueryArea), generateConstraintData = js.Any.fromFunction2(generateConstraintData), generateData = js.Any.fromFunction2(generateData), mouseOutSpan = js.Any.fromFunction0(mouseOutSpan), mouseOverSpan = js.Any.fromFunction0(mouseOverSpan), rightClickSpan = js.Any.fromFunction0(rightClickSpan), updateQuery = js.Any.fromFunction0(updateQuery))
    __obj.asInstanceOf[TypeofQueryViewer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofQueryViewer] (val x: Self) extends AnyVal {
    
    inline def setCHOOSE_LABEL(value: String): Self = StObject.set(x, "CHOOSE_LABEL", value.asInstanceOf[js.Any])
    
    inline def setClickSpan(value: () => Unit): Self = StObject.set(x, "clickSpan", js.Any.fromFunction0(value))
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setCreateQueryArea(value: () => Unit): Self = StObject.set(x, "createQueryArea", js.Any.fromFunction0(value))
    
    inline def setGenerateConstraintData(value: (js.Array[Link], js.Array[Node]) => js.Array[Any]): Self = StObject.set(x, "generateConstraintData", js.Any.fromFunction2(value))
    
    inline def setGenerateData(value: (js.Array[Link], js.Array[Node]) => js.Array[Any]): Self = StObject.set(x, "generateData", js.Any.fromFunction2(value))
    
    inline def setMouseOutSpan(value: () => Unit): Self = StObject.set(x, "mouseOutSpan", js.Any.fromFunction0(value))
    
    inline def setMouseOverSpan(value: () => Unit): Self = StObject.set(x, "mouseOverSpan", js.Any.fromFunction0(value))
    
    inline def setQUERY_STARTER(value: String): Self = StObject.set(x, "QUERY_STARTER", value.asInstanceOf[js.Any])
    
    inline def setRightClickSpan(value: () => Unit): Self = StObject.set(x, "rightClickSpan", js.Any.fromFunction0(value))
    
    inline def setUpdateQuery(value: () => Unit): Self = StObject.set(x, "updateQuery", js.Any.fromFunction0(value))
  }
}
