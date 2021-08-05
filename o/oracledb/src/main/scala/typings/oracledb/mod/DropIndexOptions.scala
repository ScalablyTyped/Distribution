package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which may be passed to SODA collection.dropIndex().
  */
trait DropIndexOptions extends StObject {
  
  /**
    * Setting force to true forces dropping of a JSON Search index or Spatial index if the
    * underlying Oracle Database domain index does not permit normal dropping.
    *
    * @see https://www.oracle.com/pls/topic/lookup?ctx=dblatest&id=GUID-F60F75DF-2866-4F93-BB7F-8FCE64BF67B6
    */
  var force: js.UndefOr[Boolean] = js.undefined
}
object DropIndexOptions {
  
  inline def apply(): DropIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropIndexOptions]
  }
  
  extension [Self <: DropIndexOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
