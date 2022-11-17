package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :boolean,   throwIfNoEntry :false | undefined} */
trait StatSyncOptionsbigintbool extends StObject {
  
  var bigint: js.UndefOr[Boolean] & Boolean
  
  var throwIfNoEntry: js.UndefOr[Boolean] & js.UndefOr[false]
}
object StatSyncOptionsbigintbool {
  
  inline def apply(bigint: js.UndefOr[Boolean] & Boolean, throwIfNoEntry: js.UndefOr[Boolean] & js.UndefOr[false]): StatSyncOptionsbigintbool = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any], throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSyncOptionsbigintbool]
  }
  
  extension [Self <: StatSyncOptionsbigintbool](x: Self) {
    
    inline def setBigint(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: js.UndefOr[Boolean] & js.UndefOr[false]): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}
