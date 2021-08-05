package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returned from SODA collection.drop().
  */
trait DropCollectionResult extends StObject {
  
  /** If the drop operation succeeded, dropped will be true. If no collection was found, dropped will be false. */
  var dropped: Boolean
}
object DropCollectionResult {
  
  inline def apply(dropped: Boolean): DropCollectionResult = {
    val __obj = js.Dynamic.literal(dropped = dropped.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCollectionResult]
  }
  
  extension [Self <: DropCollectionResult](x: Self) {
    
    inline def setDropped(value: Boolean): Self = StObject.set(x, "dropped", value.asInstanceOf[js.Any])
  }
}
