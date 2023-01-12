package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCommit extends StObject {
  
  var autoCommit: js.UndefOr[Boolean] = js.undefined
}
object AutoCommit {
  
  inline def apply(): AutoCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCommit] (val x: Self) extends AnyVal {
    
    inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
  }
}
