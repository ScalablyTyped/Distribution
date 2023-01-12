package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :false | undefined} */
trait StatSyncOptionsbigintfalsBigint extends StObject {
  
  var bigint: js.UndefOr[Boolean] = js.undefined
  
  var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
}
object StatSyncOptionsbigintfalsBigint {
  
  inline def apply(): StatSyncOptionsbigintfalsBigint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatSyncOptionsbigintfalsBigint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatSyncOptionsbigintfalsBigint] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
    
    inline def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}
