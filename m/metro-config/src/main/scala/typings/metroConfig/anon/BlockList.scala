package typings.metroConfig.anon

import org.scalablytyped.runtime.StringDictionary
import typings.metroConfig.metroConfigBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockList extends StObject {
  
  var blockList: StringDictionary[`true`]
}
object BlockList {
  
  inline def apply(blockList: StringDictionary[`true`]): BlockList = {
    val __obj = js.Dynamic.literal(blockList = blockList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockList] (val x: Self) extends AnyVal {
    
    inline def setBlockList(value: StringDictionary[`true`]): Self = StObject.set(x, "blockList", value.asInstanceOf[js.Any])
  }
}
