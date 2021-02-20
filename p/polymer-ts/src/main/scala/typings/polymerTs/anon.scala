package typings.polymerTs

import typings.polymerTs.polymerTsStrings.splice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddedCount extends StObject {
    
    var addedCount: Double = js.native
    
    var index: Double = js.native
    
    var `object`: js.Array[_] = js.native
    
    var removed: js.Array[_] = js.native
    
    var `type`: splice = js.native
  }
  object AddedCount {
    
    @scala.inline
    def apply(addedCount: Double, index: Double, `object`: js.Array[_], removed: js.Array[_], `type`: splice): AddedCount = {
      val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddedCount]
    }
    
    @scala.inline
    implicit class AddedCountMutableBuilder[Self <: AddedCount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddedCount(value: Double): Self = StObject.set(x, "addedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: js.Array[_]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectVarargs(value: js.Any*): Self = StObject.set(x, "object", js.Array(value :_*))
      
      @scala.inline
      def setRemoved(value: js.Array[_]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedVarargs(value: js.Any*): Self = StObject.set(x, "removed", js.Array(value :_*))
      
      @scala.inline
      def setType(value: splice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
