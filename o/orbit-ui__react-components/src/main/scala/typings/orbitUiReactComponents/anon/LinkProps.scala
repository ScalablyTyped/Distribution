package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps extends StObject {
  
  var linkProps: Rel
  
  var showNewTabIndicator: Boolean
}
object LinkProps {
  
  inline def apply(linkProps: Rel, showNewTabIndicator: Boolean): LinkProps = {
    val __obj = js.Dynamic.literal(linkProps = linkProps.asInstanceOf[js.Any], showNewTabIndicator = showNewTabIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  extension [Self <: LinkProps](x: Self) {
    
    inline def setLinkProps(value: Rel): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
    
    inline def setShowNewTabIndicator(value: Boolean): Self = StObject.set(x, "showNewTabIndicator", value.asInstanceOf[js.Any])
  }
}
