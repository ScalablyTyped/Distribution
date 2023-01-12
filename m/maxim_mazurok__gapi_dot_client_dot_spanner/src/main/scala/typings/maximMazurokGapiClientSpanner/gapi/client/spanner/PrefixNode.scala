package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixNode extends StObject {
  
  /** Whether this corresponds to a data_source name. */
  var dataSourceNode: js.UndefOr[Boolean] = js.undefined
  
  /** The depth in the prefix hierarchy. */
  var depth: js.UndefOr[Double] = js.undefined
  
  /** The index of the end key bucket of the range that this node spans. */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /** The index of the start key bucket of the range that this node spans. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /** The string represented by the prefix node. */
  var word: js.UndefOr[String] = js.undefined
}
object PrefixNode {
  
  inline def apply(): PrefixNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrefixNode] (val x: Self) extends AnyVal {
    
    inline def setDataSourceNode(value: Boolean): Self = StObject.set(x, "dataSourceNode", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNodeUndefined: Self = StObject.set(x, "dataSourceNode", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
