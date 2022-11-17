package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :false | undefined} */
trait StatSyncOptionsbigintfalsBigint extends StObject {
  
  var bigint: js.UndefOr[Boolean] & js.UndefOr[false]
  
  var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
}
object StatSyncOptionsbigintfalsBigint {
  
  inline def apply(bigint: js.UndefOr[Boolean] & js.UndefOr[false]): StatSyncOptionsbigintfalsBigint = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSyncOptionsbigintfalsBigint]
  }
  
  extension [Self <: StatSyncOptionsbigintfalsBigint](x: Self) {
    
    inline def setBigint(value: js.UndefOr[Boolean] & js.UndefOr[false]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}
