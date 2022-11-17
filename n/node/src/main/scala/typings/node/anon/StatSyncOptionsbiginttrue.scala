package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :true,   throwIfNoEntry :false} */
trait StatSyncOptionsbiginttrue extends StObject {
  
  var bigint: js.UndefOr[Boolean] & true
  
  var throwIfNoEntry: js.UndefOr[Boolean] & false
}
object StatSyncOptionsbiginttrue {
  
  inline def apply(bigint: js.UndefOr[Boolean] & true, throwIfNoEntry: js.UndefOr[Boolean] & false): StatSyncOptionsbiginttrue = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any], throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSyncOptionsbiginttrue]
  }
  
  extension [Self <: StatSyncOptionsbiginttrue](x: Self) {
    
    inline def setBigint(value: js.UndefOr[Boolean] & true): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: js.UndefOr[Boolean] & false): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}
