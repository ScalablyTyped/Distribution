package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :false | undefined,   throwIfNoEntry :false} */
trait StatSyncOptionsbigintfals extends StObject {
  
  var bigint: js.UndefOr[Boolean] & js.UndefOr[false]
  
  var throwIfNoEntry: js.UndefOr[Boolean] & false
}
object StatSyncOptionsbigintfals {
  
  inline def apply(bigint: js.UndefOr[Boolean] & js.UndefOr[false], throwIfNoEntry: js.UndefOr[Boolean] & false): StatSyncOptionsbigintfals = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any], throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSyncOptionsbigintfals]
  }
  
  extension [Self <: StatSyncOptionsbigintfals](x: Self) {
    
    inline def setBigint(value: js.UndefOr[Boolean] & js.UndefOr[false]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: js.UndefOr[Boolean] & false): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}
