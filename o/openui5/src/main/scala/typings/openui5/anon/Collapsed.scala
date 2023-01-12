package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapsed extends StObject {
  
  /**
    * Indicates exact collapse direction
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
}
object Collapsed {
  
  inline def apply(): Collapsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collapsed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collapsed] (val x: Self) extends AnyVal {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
  }
}
